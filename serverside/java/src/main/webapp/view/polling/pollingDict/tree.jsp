<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<SCRIPT type="text/javascript">
    var canEdit = ${canEdit};               //编辑权限
    var icon = addIcons("default.gif");  //节点图标
    var clazz = '${clazz}';    //供上移下移使用

    $(document).ready(function () {
        //不覆盖zTree的配置，如果需要额外配置，可直接在setting里面添加
        var setting = {
            simpleOpts:{
                treeUrl:CONTEXT_NAME + "/pollingDict/treeData.do?icon=" + icon, //树的链接
                isOpenRoot:true, //是否打开根节点
                clickOpts:function (treeId, treeNode) {
                    return {
                        "root":CONTEXT_NAME + "/pollingDict/grid.do",
                        "data":["查看字典", CONTEXT_NAME + "/pollingDict/view.do?id={id}&level=" + treeNode.level]
                    };
                },
                rightMenuOpts:function (treeNode, zTree) {
                    var menu = [];
                    if (canEdit) {
                        if (treeNode.level != 3) {
                            if (treeNode.id != 'root') {
                                menu.push(["添加", ["添加巡查字典", CONTEXT_NAME + "/pollingDict/add.do?parentId={id}&level=" + (1 + treeNode.level)]]);
                            }else{
                                menu.push(["添加", ["添加巡查字典", CONTEXT_NAME + "/pollingDict/add.do?parentId=&level=" + (1 + treeNode.level)]]);
                            }
                        }

                        if (treeNode.id != 'root') {
                            menu.push(["修改", ["修改巡查字典", CONTEXT_NAME + "/pollingDict/modify.do?id={id}&level=" + treeNode.level]]);
                            menu.push([]);
                            menu.push(["删除", CONTEXT_NAME + "/pollingDict/delete.do?id={id}", true]);
                            menu.push([]);
                            menu.push(["上移", "moveUp"]);
                            menu.push(["下移", "moveDown"]);
//                            menu.push([]);
//                            menu.push(["自定义操作", function (treeNode, zTree) {}, true]);
                        }
                        menu.push([]);
                    }
                    menu.push(["刷新", "refreshNode"]);

                    return menu;
                }
            }
        };
        initTree($("#treeId"), setting);
    })
</SCRIPT>
<ul id="treeId" class="ztree"></ul>