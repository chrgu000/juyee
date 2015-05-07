<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<SCRIPT type="text/javascript">
    var canEdit = ${canEdit};               //编辑权限
    var icon = addIcons("privilege.gif,button.gif,oa.gif,biz.gif");  //节点图标
    var clazz = '${clazz}';    //供上移下移使用
    $(document).ready(function () {
        //不覆盖zTree的配置，如果需要额外配置，可直接在setting里面添加
        var setting = {
            simpleOpts:{
                treeUrl:CONTEXT_NAME + "/sysPrivilege/treeData.do?icon=" + icon, //树的链接
                isOpenRoot:true, //是否打开根节点
                clickOpts:{
                    "root":CONTEXT_NAME + "/sysPrivilege/grid.do",
                    "data":["查看权限", CONTEXT_NAME + "/sysPrivilege/view.do?id={id}"]
                },
                rightMenuOpts:function (treeNode, zTree) {
                    var menu = [];
                    if (canEdit) {
//                        menu.push(["添加", ["添加权限", CONTEXT_NAME + "/sysPrivilege/add.do?parentId={id}"]]);

                        if (treeNode.id == 'root') {
                            menu.push(["重新排序","treeReorder"]);

//                        }else if (treeNode.type == "platform") {
                            menu.push(["添加", ["添加权限", CONTEXT_NAME + "/sysPrivilege/add.do?parentId=&platform="]]);
                            menu.push([]);
                            menu.push(["从菜单添加", ["从菜单添加权限", CONTEXT_NAME + "/sysPrivilege/addFromMenu.do?parentId=&platform={id}"]]);

                        }else if (treeNode.type == "data") {
                            menu.push(["添加", ["添加权限", CONTEXT_NAME + "/sysPrivilege/add.do?parentId={id}"]]);
                            menu.push(["修改", ["修改权限", CONTEXT_NAME + "/sysPrivilege/modify.do?id={id}"]]);
                            menu.push([]);
                            menu.push(["删除", CONTEXT_NAME + "/sysPrivilege/delete.do?id={id}", true]);
                            menu.push([]);
                            menu.push(["添加按钮权限",["添加按钮权限", CONTEXT_NAME + "/sysPrivilege/batchInput.do?parentId={id}"]]);
                            menu.push([]);
                            menu.push(["从菜单添加", ["从菜单添加权限", CONTEXT_NAME + "/sysPrivilege/addFromMenu.do?parentId={id}"]]);
                            menu.push([]);
                            menu.push(["上移", "moveUp"]);
                            menu.push(["下移", "moveDown"]);
                            menu.push([]);
                            menu.push(["移动节点", ["移动节点", CONTEXT_NAME + "/sysPrivilege/move.do?id={id}"]]);
//                            menu.push([]);
//                        menu.push(["刷新父节点", "refreshParentNode"]);
//                        menu.push(["自定义操作", function (treeNode, zTree) {
//                            alert(treeNode);
//                        }, true]);
                        }else{
                            menu.push(["重新排序","treeReorder"]);
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