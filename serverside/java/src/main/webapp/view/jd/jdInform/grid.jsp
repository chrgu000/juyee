<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<script type="text/javascript">
    $(function () {
        var conf = {
            gridOpts:{
                url:"${ctx}/jdInform/gridDataCustom.do",
                colNames:['ID',
                    '报建编号',
                    '工程名称',
                    '建设单位',
                    '建设地点',
                    '施工许可证发放日期',
                    '状态CODE',
                    '状态',
                    '操作'
                ],
                colModel:[
                    {name:'t.id', width:5, align:"center", searchtype:"integer", hidden:true},
                    {name:"t.bjbh", width:"30", align:"center", searchtype:"string", sortable:true},
                    {name:"p.project_name", width:"70", align:"left", searchtype:"string", sortable:true},
                    {name:"p.build_unit_name", width:"60", align:"left", searchtype:"string", sortable:true},
                    {name:"p.build_address", width:"60", align:"left", searchtype:"string", sortable:true},
                    {name:"t.sgxk_date", width:"30", align:"center", searchtype:"date", sortable:true, formatter:'date', formatoptions:{srcformat:'Y-m-d H:i:s', newformat:'Y-m-d '}},
                    {name:"t.status", width:"30", align:"center", searchtype:"string", hidden:true},
                    {name:"statusName", width:"30", align:"center", searchtype:"string"}

                ],
                actModel:[
                    {name:'operation', width:40, align:'center'}
                ],
                pager:'#pager2',
                caption:"质量监督告知书列表",
                jsonReader:{
                    repeatitems:true,
                    cell:"",
                    id:"0"
                },
                shrinkToFit:true,
                gridComplete:function () {  //在此事件中循环为每一行添加修改和删除链接
                    var ids = jQuery("#listGrid").jqGrid('getDataIDs');
                    for (var i = 0; i < ids.length; i++) {
                        var id = ids[i];
                        var rowData = jQuery("#listGrid").jqGrid('getRowData', id);
                        var bjbh = rowData["t.bjbh"];
                        var statusCode = rowData["t.status"];
                        var opButton = '<input type="button" value="查看" onclick="doView(' + id + ')" class="button_normal"/> ';

                    <c:if test="${canAudit}">
                        if (statusCode == ${STATUS_SUBMIT}) {
                            opButton += '<input type="button" value="审核" onclick="doAudit(' + id + ')" class="button_normal"/> ';
                        }
                    </c:if>
                    <c:if test="${canFgAudit}">
                        if (statusCode == ${STATUS_SUBMIT_LEADER}) {
                            opButton += '<input type="button" value="审核" onclick="doAudit(' + id + ')" class="button_normal"/> ';
                        }
                    </c:if>

                    <c:if test="${canEdit}">
                        if (statusCode == ${STATUS_EDIT} || statusCode == ${STATUS_BACK} || statusCode == ${STATUS_BACK_LEADER}) {

                            opButton += '<input type="button" value="编辑" onclick="doEdit(' + id + ')" class="button_normal"/> ';
                            opButton += '<input type="button" value="删除" onclick="doDelete(' + id + ')" class="button_normal"/>';
                        }
                    </c:if>
                        jQuery("#listGrid").jqGrid('setRowData', ids[i], { operation:opButton});
                    }
                }, rownumbers:true
            },
            userOpts:{
                defaultQuery:{ "groupOp":"AND", "rules":[
                    { "field":"报建编号", "op":"cn", "data":""},
                    { "field":"工程名称", "op":"cn", "data":""},
                    { "field":"建设单位", "op":"cn", "data":""},
                    { "field":"建设地点", "op":"cn", "data":""},
                    { "field":"施工许可证发放日期", "op":"bt", "data":""}
                ]},
                queryButton:$("#queryButton"),
                queryDesc:$("#queryConditionDesc")
            }

        };

        gridinit($("#listGrid"), conf);
    });
    function doView(id) {
        openWindow("查看质量监督告知书", "${ctx}/jdInform/view.do?id=" + id, false, 850, 500);
    }
    <c:if test="${canEdit}">
    function doAdd() {
        openWindow("添加质量监督告知书", "${ctx}/jdInform/add.do?bjbh=", true, 850, 500);
    }
    function doEdit(id) {
        openWindow("修改质量监督告知书", "${ctx}/jdInform/modify.do?id=" + id, true, 850, 500);
    }
    function doAudit(id) {
        openWindow("审核质量监督告知书", "${ctx}/jdInform/audit.do?id=" + id, true, 850, 500);
    }
    function doDelete(id) {
        doGridDelete("${ctx}/jdInform/delete.do?id=" + id);
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