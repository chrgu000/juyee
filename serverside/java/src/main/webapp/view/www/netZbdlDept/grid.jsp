<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<script type="text/javascript">
    $(function () {
        var conf = {
            gridOpts: {
                url: "${ctx}/netZbdlDept/gridDataCustom.do?projectBidSignId=${projectBidSign.id}",
                colNames: ['ID',
                    '购买标书单位',
                    '联系人',
                    '联系电话',
                    '购买标书时间',
                    '操作'
                ],
                colModel: [
                    {name: 'id', width: 10, align: "center", searchtype: "integer", hidden: true},
                    {name: "signUnit", width: "200", align: "left", searchtype: "string", sortable: true},
                    {name: "linkPerson", width: "60", align: "center", searchtype: "string", sortable: true},
                    {name: "linkTel", width: "60", align: "center", searchtype: "string", sortable: true},
                    {name: "signDate", width: "60", align: "center", searchtype: "datetime", sortable: true, formatter: 'date', formatoptions: {srcformat: 'Y-m-d H:i:s', newformat: 'Y-m-d H:i:s'}}
                ],
                actModel: [
                    {name: 'operation', width: 40, align: 'center'}
                ],
                pager: '#pager2',
                caption: "招标购买标书单位列表",
                shrinkToFit: true,
                gridComplete: function () {  //在此事件中循环为每一行添加修改和删除链接
                    var ids = jQuery("#listGrid").jqGrid('getDataIDs');
                    for (var i = 0; i < ids.length; i++) {
                        var id = ids[i];
                        var opButton = '<input type="button" value="查看" onclick="doView(' + id + ')" class="button_normal"/> ';
                        <c:if test="${canEdit}">
                        opButton += '<input type="button" value="编辑" onclick="doEdit(' + id + ')" class="button_normal"/> ';
                        opButton += '<input type="button" value="删除" onclick="doDelete(' + id + ')" class="button_normal"/>';
                        </c:if>
                        jQuery("#listGrid").jqGrid('setRowData', ids[i], { operation: opButton});
                    }
                }, rownumbers: true
            },
            userOpts: {
                defaultQuery: { "groupOp": "AND", "rules": [
                    { "field": "购买标书单位", "op": "cn", "data": ""},
                    { "field": "联系人", "op": "cn", "data": ""},
                    { "field": "联系电话", "op": "cn", "data": ""},
                    { "field": "购买标书时间", "op": "cn", "data": ""}
                ]},
                queryButton: $("#queryButton"),
                queryDesc: $("#queryConditionDesc")
            },
            isExportExcel: true
        };
        gridinit($("#listGrid"), conf);
    });
    function doView(id) {
        openWindow("查看招标购买标书单位", "${ctx}/netZbdlDept/view.do?id=" + id, false);
    }
    function goBack(){
        loadAjaxData("mainContent","${ctx}/netZbdl/grid.do");
    }
    <c:if test="${canEdit}">
    function doAdd() {
        openWindow("添加招标购买标书单位", "${ctx}/netZbdlDept/add.do?projectBidSignId=${projectBidSign.id}", true);
    }
    function doEdit(id) {
        openWindow("修改招标购买标书单位", "${ctx}/netZbdlDept/modify.do?id=" + id, true);
    }
    function doDelete(id) {
        doGridDelete("${ctx}/netZbdlDept/delete.do?id=" + id);
    }
    </c:if>
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
                <input type="button" value="添加" class="button_add"  onclick="doAdd()"/>
                <input type="button" value="返回" class="button_back" onclick="goBack()">
            </c:if>
        </div>
    </div>
</div>
<div class="gridQueryTable">
    <table id="listGrid"></table>
    <div id="pager2"></div>
</div>