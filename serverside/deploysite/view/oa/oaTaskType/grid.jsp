<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<script type="text/javascript">
    $(function () {
        var conf = {
            gridOpts:{
                url:"${ctx}/oaTaskType/gridDataCustom.do",
                colNames:['ID',
                    '编码',
                    '名称',
                    '链接',
                    '是否有效',
                    '操作'
                ],
                colModel:[
                    {name:'id', width:10, align:"center", searchtype:"integer", hidden:true},
                    {name:"code", width:"50", align:"center", searchtype:"string", sortable:true},
                    {name:"name", width:"50", align:"center", searchtype:"string", sortable:true},
                    {name:"url", width:"90", align:"left", searchtype:"string", sortable:true},
                    {name:"isValid", width:"30", align:"center", searchtype:"integer", sortable:true, formatter:booleanFormat}
                ],
                actModel:[
                    {name:'operation', width:30, align:'center'}
                ],
                pager:'#pager2',
                caption:"任务类型列表",
                shrinkToFit:true,
                gridComplete:function () {  //在此事件中循环为每一行添加修改和删除链接
                    var ids = jQuery("#listGrid").jqGrid('getDataIDs');
                    for (var i = 0; i < ids.length; i++) {
                        var id = ids[i];
                        var opButton = '<input type="button" value="查看" onclick="doView(' + id + ')" class="button_normal"/> ';
                        jQuery("#listGrid").jqGrid('setRowData', ids[i], { operation:opButton});
                    }
                }, rownumbers:true
            },
            userOpts:{
                defaultQuery:{ "groupOp":"AND", "rules":[
                    { "field":"编码", "op":"cn", "data":""},
                    { "field":"名称", "op":"cn", "data":""},
                    { "field":"链接", "op":"cn", "data":""}
//                    { "field":"是否有效", "op":"cn", "data":""}
                ]},
                queryButton:$("#queryButton"),
                queryDesc:$("#queryConditionDesc")
            },
            isExportExcel:true
        };
        gridinit($("#listGrid"), conf);
    });
    function doView(id) {
        openWindow("查看任务类型", "${ctx}/oaTaskType/view.do?id=" + id, false);
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

        </div>
    </div>
</div>
<div class="gridQueryTable">
    <table id="listGrid"></table>
    <div id="pager2"></div>
</div>