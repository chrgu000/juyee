<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<script type="text/javascript">
    $(function () {
        var conf = {
            gridOpts: {
                url: "${ctx}/projStage/gridDataCustom.do",
                colNames: ['ID',
                    '编码',
                    '名称',
                    '审批部门',
                    '是否有效',
                    '缺省工作周期(天)',
                    '预警期限(天)',
                    '办证联系信息',
                    '是否叶节点',
                    '树形层次',
                    '操作'
                ],
                colModel: [
                    {name: 'id', width: 10, align: "center", searchtype: "integer", hidden: true},
                    {name: "code", width: "60", align: "center", searchtype: "string", sortable: true},
                    {name: "name", width: "88", align: "center", searchtype: "string", sortable: true},
                    {name: "auditDept", width: "88", align: "center", searchtype: "string", sortable: true},
                    {name: "isValid", width: "88", align: "center", searchtype: "integer", sortable: true, formatter: booleanFormat},
                    {name: "defaultDays", width: "88", align: "center", searchtype: "integer", sortable: true, formatter: 'integer', formatoptions: {thousandsSeparator: ",", defaulValue: 0}},
                    {name: "alertDays", width: "70", align: "center", searchtype: "integer", sortable: true, formatter: 'integer', formatoptions: {thousandsSeparator: ",", defaulValue: 0}},
                    {name: "linkInfo", width: "100", align: "center", searchtype: "string", sortable: true},
                    {name: "isLeaf", width: "60", align: "center", searchtype: "integer", sortable: true, hidden: true, formatter: booleanFormat},
                    {name: "treeId", width: "88", align: "center", searchtype: "string", sortable: true, hidden: true}
                ],
                actModel: [
                    {name: 'operation', width: 40, align: 'center'}
                ],
                pager: '#pager2',
                caption: "项目办证阶段管理列表",
                shrinkToFit: true,
                gridComplete: function () {  //在此事件中循环为每一行添加修改和删除链接
                    var ids = jQuery("#listGrid").jqGrid('getDataIDs');
                    for (var i = 0; i < ids.length; i++) {
                        var id = ids[i];
                        var opButton = '<input type="button" value="查看" onclick="doView(' + id + ')" class="button_normal"/> ';
                        <%--<c:if test="${canEdit}">
                        opButton += '<input type="button" value="编辑" onclick="doEdit(' + id + ')" class="button_normal"/> ';
                        opButton += '<input type="button" value="删除" onclick="doDelete(' + id + ')" class="button_normal"/>';
                        </c:if>--%>
                        jQuery("#listGrid").jqGrid('setRowData', ids[i], { operation: opButton});
                    }
                }, rownumbers: true
            },
            userOpts: {
                defaultQuery: { "groupOp": "AND", "rules": [
                    { "field": "编码", "op": "cn", "data": ""},
                    { "field": "名称", "op": "cn", "data": ""}
                    /*{ "field": "审批部门", "op": "cn", "data": ""},
                     { "field": "是否有效", "op": "cn", "data": ""},
                     { "field": "缺省工作周期(天)", "op": "cn", "data": ""},
                     { "field": "预警期限(天)", "op": "cn", "data": ""},
                     { "field": "办证联系信息", "op": "cn", "data": ""},
                     { "field": "是否叶节点", "op": "cn", "data": ""},
                     { "field": "树形层次", "op": "cn", "data": ""}*/
                ]},
                queryButton: $("#queryButton"),
                queryDesc: $("#queryConditionDesc")
            },
            isExportExcel: true
        };
        gridinit($("#listGrid"), conf);
    });
    function doView(id) {
        openWindow("查看项目办证阶段", "${ctx}/projStage/view.do?id=" + id, false);
    }
    <c:if test="${canEdit}">
    function doAdd() {
        openWindow("添加项目办证阶段", "${ctx}/projStage/add.do", true);
    }
    function doEdit(id) {
        openWindow("修改项目办证阶段", "${ctx}/projStage/modify.do?id=" + id, true);
    }
    function doDelete(id) {
        doGridDelete("${ctx}/projStage/delete.do?id=" + id);
    }
    </c:if>

    //custom formatter
    //function customeFormat(cellvalue, options, rowObject) {
    //    return cellvalue == "true"?"是":"否";
    //}
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
            <%--<c:if test="${canEdit}">--%>
            <%--<input type="button" value="添加" class="button_add"--%>
            <%--onclick="doAdd()"/>--%>
            <%--</c:if>--%>
        </div>
    </div>
</div>
<div class="gridQueryTable">
    <table id="listGrid"></table>
    <div id="pager2"></div>
</div>