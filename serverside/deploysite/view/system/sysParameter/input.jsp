<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<script type="text/javascript">
    var formId = "bean";
    $(function () {
        //页面验证初始化
        var validateCondition = [
            {name:"code", rule:"validate[required]"},
            {name:"name", rule:"validate[required]"},
            {name:"value", rule:"validate[required]"}
            //{name:"constraint", rule:"validate[required]"},
            //{name:"clobvalue", rule:"validate[required]"},
        ];
        validateInit(validateCondition, formId);
    });

    //保存操作
    function save(btn) {
        if (!validateForm(formId)) {
            return;
        }

        //提交表单
        saveAjaxData("${ctx}/sysParameter/save.do", formId);
    }
</script>
<form:form commandName="bean">
    <form:hidden path="id"/>

    <div class="form_div">
        <table cellpadding="0" cellspacing="0" class="form_table">
            <tr class="tr_light">
                <td class="form_label">参数代码:</td>
                <td class="form_content">
                    <form:input path="code" cssClass="input_text"/>
                </td>
            </tr>
            <tr class="tr_dark">
                <td class="form_label">参数名称:</td>
                <td class="form_content">
                    <form:input path="name" cssClass="input_text_long"/>
                </td>
            </tr>
            <tr class="tr_light">
                <td class="form_label">参数值:</td>
                <td class="form_content">
                    <form:input path="value" cssClass="input_text_long"/>
                </td>
            </tr>
            <tr class="tr_dark">
                <td class="form_label">约束:</td>
                <td class="form_content">
                    <form:textarea path="constraint" cssClass="input_textarea"/>
                </td>
            </tr>
            <%--<tr class="tr_light">--%>
                <%--<td class="form_label">长参数:</td>--%>
                <%--<td class="form_content">--%>
                    <%--<form:input path="clobvalue" cssClass="input_text"/>--%>
                <%--</td>--%>
            <%--</tr>--%>

            <tr class="tr_button">
                <td class="form_label"></td>
                <td class="form_content">
                    <input type="button" value="确定" class="button_confirm" onclick="save(this)">&nbsp;
                    <input type="button" value="取消" class="button_cancel" onclick="closeWindow()">
                </td>
            </tr>
        </table>
    </div>
</form:form>