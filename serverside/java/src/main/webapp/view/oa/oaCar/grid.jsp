<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<script type="text/javascript">
    $(function () {
        var conf = {
            gridOpts: {
                url: "${ctx}/oaCar/gridDataCustom.do?isCarAudit="+'${canClddAudit}',
                colNames: ['ID',
                    '申请部门',
                    '申请人',
                    '用车时间',
                    '起止时间',
                    '拟派车牌',
                    '拟派驾驶员',
                    '用车事由',
                    '状态Code',
                    '状态',
                    '操作'
                ],
                colModel: [
                    {name: 'id', width: 10, align: "center", searchtype: "integer", hidden: true},
                    {name: "applyDept.name", width: "40", align: "center", searchtype: "string", sortable: true},
                    {name: "applyUser.displayName", width: "20", align: "center", searchtype: "string", sortable: true},
                    {name: "beginTime", width: "30", align: "center", searchtype: "date", sortable: true, formatter: 'date', formatoptions: {srcformat: 'Y-m-d', newformat: 'Y-m-d'}},
                    {name: "endTime", width: "30", align: "center", searchtype: "string", sortable: true},
                    {name: "car.name", width: "20", align: "center", searchtype: "string", sortable: true},
                    {name: "driverPerson.name", width: "20", align: "center", searchtype: "string", sortable: true},
                    {name: "useCause", width: "53", align: "left", searchtype: "string", sortable: true},
                    {name: "status", width: "53", align: "left", searchtype: "string", hidden: true},
                    {name: "statusName", width: "30", align: "center", searchtype: "string", sortable: true}
                ],
                actModel: [
                    {name: 'operation', width: 40, align: 'center'}
                ],
                pager: '#pager2',
                caption: "车辆申请列表",
                shrinkToFit: true,
                gridComplete: function () {  //在此事件中循环为每一行添加修改和删除链接
                    var ids = jQuery("#listGrid").jqGrid('getDataIDs');
                    for (var i = 0; i < ids.length; i++) {
                        var id = ids[i];
                        var rowData = jQuery("#listGrid").jqGrid('getRowData', id);
                        var opButton = '<input type="button" value="查看" onclick="doView(' + id + ')" class="button_normal"/> ';
                        <c:if test="${canEdit}">
                        if (rowData['status'] == '${STATUS_EDIT}' || rowData['status'] == '${STATUS_BRANCH_BACK}' || rowData['status'] == '${STATUS_MAIN_BACK}') {
                            opButton += '<input type="button" value="编辑" onclick="doEdit(' + id + ')" class="button_normal"/> ';
                            opButton += '<input type="button" value="删除" onclick="doDelete(' + id + ')" class="button_normal"/>';
                        }
                        </c:if>
                        if (rowData['status'] == '${STATUS_SUBMIT}' || rowData['status'] == '${STATUS_BRANCH_PASS}') {
                            <c:if test="${canKzAudit}">
                            if ((rowData['status'] == '${STATUS_SUBMIT}')) {
                                opButton += '<input type="button" value="审核" onclick="doAudit(' + id + ')" class="button_normal"/> ';
                            }
                            </c:if>
                            <c:if test="${canZrAudit}">
                            if (rowData['status'] == '${STATUS_BRANCH_PASS}') {
                                opButton += '<input type="button" value="审核" onclick="doAudit(' + id + ')" class="button_normal"/> ';
                            }
                            </c:if>
                        }
                        if (rowData['status'] == '${STATUS_MAIN_PASS}') {
                            <c:if test="${canClddAudit}">
                            <%--if (!(rowData['canClddAudit']=='${STATUS_BRANCH_PASS}' &&${canKzAudit})) {--%>
                            opButton += '<input type="button" value="车辆调度" onclick="doAudit(' + id + ')" class="button_normal_long"/> ';
//                            }
                            </c:if>
                        }

                        jQuery("#listGrid").jqGrid('setRowData', ids[i], { operation: opButton});
                    }
                }, rownumbers: true
            },
            userOpts: {
                defaultQuery: { "groupOp": "AND", "rules": [
                    { "field": "申请人", "op": "cn", "data": ""},
                    { "field": "用车时间", "op": "bt", "data": ""},
                    { "field": "拟派车牌", "op": "cn", "data": ""},
                    { "field": "拟派驾驶员", "op": "cn", "data": ""}
                ]},
                queryButton: $("#queryButton"),
                queryDesc: $("#queryConditionDesc")
            },
            isExportExcel: true
        };
        gridinit($("#listGrid"), conf);
    });
    function doView(id) {
        openWindow("查看车辆申请", "${ctx}/oaCar/view.do?id=" + id, false, 800, 500);
    }

    <c:if test="${canEdit}">
    function doAdd() {
        openWindow("添加车辆申请", "${ctx}/oaCar/add.do", true, 800, 500);
    }
    function doEdit(id) {
        openWindow("修改车辆申请", "${ctx}/oaCar/modify.do?id=" + id, true, 800, 500);
    }

    function doDelete(id) {
        doGridDelete("${ctx}/oaCar/delete.do?id=" + id);
    }
    </c:if>
    function doAudit(id) {
        openWindow("审核车辆申请", "${ctx}/oaCar/audit.do?id=" + id, true, 800, 500);
    }
    //按是否标注过滤数据
    function loadThisGrid() {
        var v = $("#isViewAll").attr("checked") == "checked";
        jQuery("#listGrid").jqGrid('setGridParam',
                {
                    postData: {'isViewAll': v}
                }).trigger('reloadGrid');
    }

</script>

<div class="title_Search">
    <div class="gridQueryArea">
        <div style="float:left;padding-left: 5px">
            <input type="button" name="queryButton" id="queryButton" value="查询" class="btn_Search"/>
        </div>
        <%--<div style="float:right;padding-left: 10px" id="conditionsDesc">--%>
        <%--<input type="text" name="queryConditionDesc" id="queryConditionDesc" value="" class="title_input"--%>
        <%--readonly="true"/>--%>
        <%----%>
        <%--</div>--%>
        <div style="float:right;padding-right: 10px">
            <%--用于查看分管领导下属所管理部门的全部信息--%>
            <c:if test="${canViewAll}">
                <input type="checkbox" id="isViewAll" name="isViewAll" class="checkbox"
                       onchange="loadThisGrid()">查看全部 &nbsp;&nbsp;&nbsp;
            </c:if>

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