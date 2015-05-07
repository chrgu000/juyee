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
                treeUrl:CONTEXT_NAME + "/docCategory/treeData.do?icon=" + icon, //树的链接
                isOpenRoot:true, //是否打开根节点
                clickOpts:{
                    "root":CONTEXT_NAME + "/docCategory/grid.do",
                    "data":["查看文档目录", CONTEXT_NAME + "/docCategory/view.do?id={id}"]
                },
                rightMenuOpts:function (treeNode, zTree) {
                    var menu = [];
                    if (canEdit) {
                        menu.push(["添加", ["添加文档目录", CONTEXT_NAME + "/docCategory/add.do?parentId={id}"]]);

                        if (treeNode.id != 'root') {
                            menu.push(["修改", ["修改文档目录", CONTEXT_NAME + "/docCategory/modify.do?id={id}"]]);
                            menu.push([]);
                            menu.push(["删除", CONTEXT_NAME + "/docCategory/delete.do?id={id}", true]);
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