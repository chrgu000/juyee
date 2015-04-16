<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<script type="text/javascript">
    $(function () {
        var conf = {
            gridOpts:{
                url:"${ctx}/sysParameter/gridDataCustom.do?code=${code}",
                colNames:['ID',
                    '参数代码',
                    '参数名称',
                    '参数值',
                    '约束',
//                    '长参数',
                    '更新时间',
                    '更新人',
                    '操作'
                ],
                colModel:[
                    {name:'id', width:10, align:"center", searchtype:"integer", hidden:true},
                    {name:"code", width:"50", align:"center", searchtype:"string", sortable:true},
                    {name:"name", width:"60", align:"center", searchtype:"string", sortable:true},
                    {name:"value", width:"80", align:"center", searchtype:"string", sortable:true},
                    {name:"constraint", width:"80", align:"center", searchtype:"string", sortable:true},
//                    {name:"clobvalue", width:"88", align:"center", searchtype:"string", sortable:true},
                    {name:"updateTime", width:"40", align:"center", searchtype:"datetime", sortable:true, formatter:'date', formatoptions:{srcformat:'Y-m-d H:i:s', newformat:'Y-m-d H:i:s'}},
                    {name:"updateUser", width:"40", align:"center", searchtype:"string", sortable:true}
                ],
                actModel:[
                    {name:'operation', width:60, align:'center'}
                ],
                pager:'#pager2',
                caption:"系统参数设置",
                shrinkToFit:true,
                gridComplete:function () {  //在此事件中循环为每一行添加修改和删除链接
                    var ids = jQuery("#listGrid").jqGrid('getDataIDs');
                    for (var i = 0; i < ids.length; i++) {
                        var id = ids[i];
                        var opButton = '<input type="button" value="查看" onclick="doView(' + id + ')" class="button_normal"> ';
                    <c:if test="${canEdit}">
                        opButton += '<input type="button" value="编辑" onclick="doEdit(' + id + ')" class="button_normal"> ';
                        opButton += '<input type="button" value="删除" onclick="doDelete(' + id + ')" class="button_normal">';
                    </c:if>
                        jQuery("#listGrid").jqGrid('setRowData', ids[i], { operation:opButton});
                    }
                }, rownumbers:true
            },
            userOpts:{
                defaultQuery:{ "groupOp":"AND", "rules":[
                    { "field":"参数代码", "op":"cn", "data":""},
                    { "field":"参数名称", "op":"cn", "data":""},
                    { "field":"参数值", "op":"cn", "data":""},
                    { "field":"约束", "op":"cn", "data":""}
//                    { "field":"长参数", "op":"cn", "data":""}
                ]},
                queryButton:$("#queryButton"),
                queryDesc:$("#queryConditionDesc")
            }
        };
        gridinit($("#listGrid"), conf);
    });
    <c:if test="${canEdit}">
    function doAdd() {
        openWindow("添加系统参数设置", "${ctx}/sysParameter/add.do", true);
    }
    function doDelete(id) {
        doGridDelete("${ctx}/sysParameter/delete.do?id=" + id);
    }
    </c:if>
    function doEdit(id) {
        openWindow("修改系统参数设置", "${ctx}/sysParameter/modify.do?id=" + id, true);
    }
    function doView(id) {
        openWindow("查看系统参数设置", "${ctx}/sysParameter/view.do?id=" + id, false);
    }
</script>

<div class="title_Search">
    <div class="gridQueryArea">
        <div style="float:left;padding-left: 5px">
            <input type="button" name="queryButton" id="queryButton" value="查询" class="btn_Search"/>
        </div>
        <div style="float:left;padding-left: 10px" id="conditionsDesc">
            <input type="text" name="queryConditionDesc" id="queryConditionDesc" value="" class="title_input"
                   readonly="true"/>
        </div>
        <div style="float:right;padding-right: 10px">
            <c:if test="${canEdit}">
                <input type="button" value="添加" class="button_add"
                       onclick="doAdd()"/>
            </c:if>
        </div>
    </div>
</div>
<div class="gridQueryTable">
    <table id="listGrid"></table>
    <div id="pager2"></div>
</div>