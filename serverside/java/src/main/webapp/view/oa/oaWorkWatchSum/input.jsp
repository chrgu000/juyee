<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<script type="text/javascript">

    //保存操作
    function save(btn)
    {
        if (!validateForm(formId))
        {
            return;
        }

        //加入其他业务判断
//        if ($('#name').val() == '') {
//            showInfoMsg('请输入姓名！',null);
//            return;
//        }

        //提交表单
        saveAjaxData("${ctx}/oaWorkWatchSum/save.do", formId);
    }
</script>
<div class="form_div">
    <table cellspacing="3" cellpadding="3" class="form_border">
        <tr class="tr_title">
            <td class="form_border">
                <strong>
                    <select name="year" id="year">
                        ${yearOptions}
                    </select>&nbsp;年&nbsp;
                    <select name="month" id="month">
                        ${monthOptions}
                    </select>&nbsp;月份&nbsp;第
                    <select name="week" id="week">
                        ${weekOptions}
                    </select>&nbsp;周&nbsp;(
                    <select name="beginDay" id="beginDay">
                        ${dayOptions}
                    </select>~
                    <select name="endDay" id="endDay">
                        ${dayOptions}
                    </select>)&nbsp;工作督办一览表
                </strong>
            </td>
        </tr>
    </table>
    <table cellpadding="0" cellspacing="0" class="table_thin_line_center" border="1">
        <tr class="tr_header">
            <td><strong>科室</strong></td>
            <td><strong>序号</strong></td>
            <td><strong>工作内容</strong></td>
            <td><strong>分管领导</strong></td>
            <td><strong>时间节点</strong></td>
            <td><strong>上报形式</strong></td>
            <td><strong>完成情况</strong></td>
        </tr>
        <c:forEach items="${oaWorkWatches}" var="oaWorkWatch" varStatus="st">
            <c:forEach items="${oaWorkWatch.oaWorkWatchItems}" var="oaWorkWatchItem" varStatus="stItem">
                <tr
                        <c:if test="${stItem.index%2==0}">class="tr_dark"</c:if>
                        <c:if test="${stItem.index%2==1}">class="tr_light"</c:if>
                        >
                    <c:if test="${stItem.index==0}">
                        <td rowspan="${fn:length(oaWorkWatch.oaWorkWatchItems)}">
                            <strong>${oaWorkWatch.reportDept}</strong>
                        </td>
                    </c:if>
                    <td>
                            ${oaWorkWatchItem.orderNo}
                    </td>
                    <td>
                            ${oaWorkWatchItem.content}
                    </td>
                    <c:if test="${stItem.index==0}">
                        <td rowspan="${fn:length(oaWorkWatch.oaWorkWatchItems)}">
                                ${oaWorkWatch.reportPerson}
                        </td>
                    </c:if>
                    <td>
                            ${oaWorkWatchItem.timeNode}
                    </td>
                    <td>
                            ${oaWorkWatchItem.reportMethod}
                    </td>
                    <td>
                            ${oaWorkWatchItem.completeDesc}
                    </td>
                </tr>
            </c:forEach>
        </c:forEach>
    </table>
    <table cellpadding="3" cellspacing="3" class="form_table">
        <tr class="tr_button">
            <td class="form_border">
                <input type="button" value="关闭" class="button_cancel" onclick="closeWindow()">
            </td>
        </tr>
    </table>
</div>