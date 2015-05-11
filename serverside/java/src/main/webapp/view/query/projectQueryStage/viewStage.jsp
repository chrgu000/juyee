<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<script type="text/javascript">
    function loadStageData(flag) {
        if(flag == "all"){
           $("#projectName").val("");
           $("#bidName").val("");
           $("#jsDept").val("");
           $("#year").val("");
        }
        setButton(true);
        loadAjaxDataCallback("stageDataDiv", "${ctx}/projectQueryStage/viewStageData.do?id=${id}",resetButton);
    }
    function resetButton(){
        setButton(false);
    }
    function setButton(flag){
        document.getElementById("btnQueryThis").disabled = flag;
        document.getElementById("btnQueryAll").disabled = flag;
    }

    $(function () {
        loadStageData(null);
    });
</script>
<style type="text/css">
    .td_normal{
        height: 20px;
        background-color: white;
    }
    .td_active{
        height: 20px;
        background-color: #0074cc;
        font-weight: bold;
    }
</style>
<div class="form_div">
    <table cellpadding="1" cellspacing="1" width="500" border="0" <c:if test="${not empty id}">style="display: none"</c:if>>
        <tr class="tr_light">
            <td align="right" width="50" nowrap>项目名称：</td>
            <td align="left" nowrap>
               <input type="text" name="projectName" id="projectName" class="input_text"/>
            </td>
            <td align="right" width="50" nowrap>标段名称：</td>
            <td align="left" nowrap>
                <input type="text" name="bidName" id="bidName" class="input_text"/>
            </td>
            <td align="right" width="50" nowrap>年份：</td>
            <td align="left" nowrap>
                <select name="year" id="year">${yearOptions}</select>
            </td>
        </tr>
        <tr>
            <td align="right">建设单位：</td>
            <td align="left">
                <input type="text" name="jsDept" id="jsDept" class="input_text"/>
            </td>
            <td align="right">&nbsp;</td>
            <td align="left" colspan="3">
                <input type="button" value="查询" id="btnQueryThis" class="button_go" onclick="loadStageData(null)"/>
                <input type="button" value="显示全部" id="btnQueryAll" class="button_go" onclick="loadStageData('all')"/>
            </td>
        </tr>
    </table>
    <table cellpadding="0" cellspacing="0" class="form_table">
        <tr class="tr_light">
            <td id="stageDataDiv">
                &nbsp;
            </td>
        </tr>
    </table>
</div>