<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<div class="form_div">
    <table cellpadding="0" cellspacing="0" class="form_table">
        <tr class="tr_dark">
            <td class="form_label">网上受理编号：</td>
            <td class="form_content">&nbsp;
                ${bean.netCode}                    </td>
        </tr>

        <tr class="tr_light">
            <td class="form_label">报建编号：</td>
            <td class="form_content">&nbsp;
                ${bean.bjbh}                    </td>
        </tr>
        <tr class="tr_dark">
            <td class="form_label">标段编号：</td>
            <td class="form_content">&nbsp;
                ${bean.bdh}                    </td>
        </tr>
        <tr class="tr_light">
            <td class="form_label">项目名称：</td>
            <td class="form_content">&nbsp;
                ${bean.projectName}                    </td>
        </tr>
        <tr class="tr_dark">
            <td class="form_label">建设单位：</td>
            <td class="form_content">&nbsp;
                ${bean.buildUnitName}                    </td>
        </tr>
        <tr class="tr_light">
            <td class="form_label">申请单位：</td>
            <td class="form_content">&nbsp;
                ${bean.applyUnitName}                    </td>
        </tr>
        <tr class="tr_dark">
            <td class="form_label">网上提交日期：</td>
            <td class="form_content">&nbsp;
                <fmt:formatDate value="${bean.netDate}" pattern="yyyy-MM-dd"/>

            </td>
        </tr>
        <tr class="tr_button">
            <td class="form_label"></td>
            <td class="form_content">
                <input type="button" value="关闭" class="button_cancel" onclick="closeWindow()">
            </td>
        </tr>
    </table>
</div>