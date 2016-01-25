<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<%@ include file="/common/header.jsp" %>
<script type="text/javascript">
    var formId = "bean";
    $(function () {
        //页面验证初始化
        var validateCondition = [];
        validateInit(validateCondition, formId);
    });
    //保存操作
    function save(btn, buttonName, status) {
        if (!validateForm(formId)) {
            return;
        }

        $("#status").val(status);
        if (status == '${STATUS_SH_BACK}' || status == '${STATUS_FGLD_BACK}' || status == '${STATUS_ZXLD_BACK}') {
            if (status == '${STATUS_SH_BACK}') {
                status = '${STATUS_SUBMIT}';
            } else if (status == '${STATUS_FGLD_BACK}' || status == '${STATUS_ZXLD_BACK}') {
                status = '${STATUS_FH_PASS}';
            }
            $("#status").val(status);
            if (buttonName != "补正退回") {
                parent.openNewWindow("selectMaterial", "退回选择页面", "${ctx}/sgPermit/selectMaterial.do", true, 400, 200);
            } else {
                parent.openNewWindow("bzBackMaterialDiv", "补正退回资料", "${ctx}/sgPermit/bzBackMaterial.do", true, 400, 200);
            }
        } else {
            savaAudit(buttonName);
        }
    }
    function savaAudit(buttonName) {
        if (confirm("是否确定执行 " + buttonName + " 操作？")) {
            saveAjaxData("${ctx}/sgPermit/saveAudit.do", formId, doCloseWin);
        }
    }
    function doCloseWin() {
        parent.closeWindow();
    }
</script>
<form:form commandName="bean">
    <form:hidden path="id"/>
    <form:hidden path="year"/>
    <form:hidden path="status"/>
    <form:hidden path="backNum"/>
    <form:hidden path="bzBackMaterial"/>

    <div class="form_div">
        <fieldset class="form_fieldset" style="width: 96%;">
            <legend>申请信息</legend>
            <table cellpadding="0" cellspacing="0" class="form_table">
                <tr class="tr_light">
                    <td class="form_label_right" nowrap>项目性质：</td>
                    <td class="form_content" colspan="3">${bean.propertyType.name}</td>
                </tr>
                <tr class="tr_dark">
                    <td class="form_label_right" nowrap>报建编号：</td>
                    <td class="form_content">${bean.bjbh}</td>
                    <td class="form_label_right" nowrap>业务编号：</td>
                    <td class="form_content">${bean.bizCode}</td>
                </tr>
                <tr class="tr_light">
                    <td class="form_label_right">项目名称：</td>
                    <td class="form_content" colspan="3">${bean.projectName}</td>
                </tr>
                <tr class="tr_dark">
                    <td class="form_label_right">建设单位：</td>
                    <td class="form_content" colspan="3">${bean.buildName}</td>
                </tr>
                <tr class="tr_light">
                    <td class="form_label_right" style="width: 20%;">建设单位性质：</td>
                    <td class="form_content" style="width: 30%;">${bean.buildUnitType}</td>
                    <td class="form_label_right" style="width: 15%;">建设单位地址：</td>
                    <td class="form_content" style="width: 35%;">${bean.buildUnitAddress}</td>
                </tr>
                <tr class="tr_dark">
                    <td class="form_label_right">建设地点：</td>
                    <td class="form_content" colspan="3">${bean.buildSite}</td>
                </tr>
                <tr class="tr_light">
                    <td class="form_label_right">建设工程类别：</td>
                    <td class="form_content" colspan="3">
                        <c:forEach items="${lbs}" var="item">
                            <input type="checkbox" name="buildLbId" value="${item.id}"
                                   <c:if test="${fn:contains(bean.buildLbIds, item.id)}">checked</c:if>
                                   disabled>${item.name}&nbsp;
                        </c:forEach>
                    </td>
                </tr>
                <tr class="tr_dark">
                    <td class="form_label_right">建设工程属性：</td>
                    <td class="form_content" colspan="3">
                        <c:forEach items="${sxs}" var="item">
                            <input type="radio" name="buildSx" value="${item.id}"
                                   <c:if test="${bean.buildSx.id == item.id}">checked</c:if> disabled>${item.name}&nbsp;
                        </c:forEach>
                    </td>
                </tr>
                <tr class="tr_light">
                    <td class="form_label_right">建设工程规模：</td>
                    <td class="form_content" colspan="3">${bean.buildProjSize}</td>
                </tr>
                <tr class="tr_dark">
                    <td class="form_label_right">合同价格（万元）：</td>
                    <td class="form_content">${bean.contractPrice}</td>
                    <td class="form_label_right">合同工期（日历天）：</td>
                    <td class="form_content">${bean.contractPeriod}</td>
                </tr>
                <tr class="tr_light">
                    <td class="form_label_right" nowrap>中标价格（万元）：</td>
                    <td class="form_content">${bean.zbPrice}</td>
                    <td class="form_label_right" nowrap>项目投资估算（万元）：</td>
                    <td class="form_content">${bean.projectPlanCost}</td>
                </tr>
                <tr class="tr_dark">
                    <td class="form_label_right">开工日期：</td>
                    <td class="form_content">
                        <fmt:formatDate value="${bean.contractBeginDate}" pattern="yyyy-MM-dd"/>
                    </td>
                    <td class="form_label_right">完工日期：</td>
                    <td class="form_content">
                        <fmt:formatDate value="${bean.contractEndDate}" pattern="yyyy-MM-dd"/>
                    </td>
                </tr>
                <tr class="tr_light">
                    <td class="form_label_right">法定代表人：</td>
                    <td class="form_content">${bean.fr}</td>
                    <td class="form_label_right">建设单位联系电话：</td>
                    <td class="form_content">${bean.buildUnitPhone}</td>
                </tr>
                <tr class="tr_dark">
                    <td class="form_label_right">建设单位联系人：</td>
                    <td class="form_content">${bean.buildUnitPerson}</td>
                    <td class="form_label_right">手机号：</td>
                    <td class="form_content">${bean.buildUnitMobile}</td>
                </tr>
                <tr class="tr_light">
                    <td class="form_label_right">现场开工情况：</td>
                    <td class="form_content" colspan="3">${bean.startWorkCon}</td>
                </tr>
                <tr>
                    <td colspan="4">
                        <table cellpadding="0" cellspacing="0" class="form_table">
                            <tr class="tr_header">
                                <td colspan="5">主要设计单位</td>
                            </tr>
                            <tr class="tr_light">
                                <td class="form_label_right" style="width: 12%;">主要设计单位：</td>
                                <td class="form_content" style="width: 88%;" colspan="4">
                                        ${bean.sjUnitName}
                                </td>
                            </tr>
                            <tr class="tr_light">
                                <td rowspan="3" class="form_label_right" style="width: 12%;"
                                    style="text-align: center;">主要设计单位
                                </td>
                                <td class="form_label_right" style="width: 15%;">招标方式：</td>
                                <td class="form_content" style="width: 30%;">
                                        ${hdExtend.mainSjZbfs}
                                </td>
                                <td class="form_label_right" style="width: 10%;">中标价：</td>
                                <td class="form_content" style="width: 35%;">
                                        ${hdExtend.mainSjZbj}
                                </td>
                            </tr>
                            <tr class="tr_light">
                                <td class="form_label_right">资质等级：</td>
                                <td class="form_content">
                                        ${hdExtend.mainSjZzdj}
                                </td>
                                <td class="form_label_right">证书编号：</td>
                                <td class="form_content">
                                        ${hdExtend.mainSjZsbh}
                                </td>
                            </tr>
                            <tr class="tr_light">
                                <td class="form_label_right">项目负责人：</td>
                                <td class="form_content">
                                        ${hdExtend.mainSjXmfzr}
                                </td>
                                <td class="form_label_right">证书编号：</td>
                                <td class="form_content">
                                        ${hdExtend.mainSjZsbh2}
                                </td>
                            </tr>
                            <tr class="tr_header">
                                <td colspan="5">主要监理单位</td>
                            </tr>
                            <tr class="tr_light">
                                <td class="form_label_right">主要监理单位：</td>
                                <td class="form_content" colspan="4">
                                        ${bean.jlUnitName}
                                </td>
                            </tr>
                            <tr class="tr_dark">
                                <td rowspan="3" class="form_label_right" style="text-align: center;">主要监理单位</td>
                                <td class="form_label_right">招标方式：</td>
                                <td class="form_content">${hdExtend.mainJlZbfs}</td>
                                <td class="form_label_right">中标价：</td>
                                <td class="form_content">${hdExtend.mainJlZbj}</td>
                            </tr>
                            <tr class="tr_dark">
                                <td class="form_label_right">资质等级：</td>
                                <td class="form_content">${hdExtend.mainJlZzdj}</td>
                                <td class="form_label_right">证书编号：</td>
                                <td class="form_content">${hdExtend.mainJlZsbh}</td>
                            </tr>
                            <tr class="tr_dark">
                                <td class="form_label_right">项目负责人：</td>
                                <td class="form_content">${hdExtend.mainJlXmfzr}</td>
                                <td class="form_label_right">证书编号：</td>
                                <td class="form_content">${hdExtend.mainJlZsbh2}</td>
                            </tr>
                            <tr class="tr_header">
                                <td colspan="5">主要施工单位</td>
                            </tr>
                            <tr class="tr_light">
                                <td class="form_label_right" style="width: 10%;">主要施工单位：</td>
                                <td class="form_content" style="width: 85%;" colspan="4">
                                        ${bean.sgUnitName}
                                </td>
                            </tr>
                            <tr class="tr_light">
                                <td rowspan="3" class="form_label_right" style="text-align: center;">主要施工单位</td>
                                <td class="form_label_right">招标方式：</td>
                                <td class="form_content">${hdExtend.mainSgZbfs}</td>
                                <td class="form_label_right">中标价：</td>
                                <td class="form_content">${hdExtend.mainSgZbj}</td>
                            </tr>
                            <tr class="tr_light">
                                <td class="form_label_right">资质等级：</td>
                                <td class="form_content">${hdExtend.mainSgZzdj}</td>
                                <td class="form_label_right">证书编号：</td>
                                <td class="form_content">${hdExtend.mainSgZsbh}</td>
                            </tr>
                            <tr class="tr_light">
                                <td class="form_label_right">项目负责人：</td>
                                <td class="form_content">${hdExtend.mainSgXmfzr}</td>
                                <td class="form_label_right">证书编号：</td>
                                <td class="form_content">${hdExtend.mainSgZsbh2}</td>
                            </tr>
                            <tr class="tr_header">
                                <td colspan="5">建设依据</td>
                            </tr>
                            <tr class="tr_dark">
                                <td rowspan="5" class="form_label_right" style="text-align: center;">建设依据</td>
                                <td class="form_label_right">工可批准或核准机关和文号：</td>
                                <td colspan="3" class="form_content">${hdExtend.gkpzCode}</td>
                            </tr>
                            <tr class="tr_dark">
                                <td class="form_label_right">批复或核准日期：</td>
                                <td class="form_content">
                                    <fmt:formatDate value="${hdExtend.hzDate}" pattern="yyyy-MM-dd"/>
                                </td>
                                <td class="form_label_right">投资估算：</td>
                                <td class="form_content">${hdExtend.planCost}</td>
                            </tr>
                            <tr class="tr_dark">
                                <td class="form_label_right">初步设计批准机关和文号：</td>
                                <td colspan="3" class="form_content">${hdExtend.cbshCode}</td>
                            </tr>
                            <tr class="tr_dark">
                                <td class="form_label_right">批复日期：</td>
                                <td class="form_content">
                                    <fmt:formatDate value="${hdExtend.pfDate}" pattern="yyyy-MM-dd"/>
                                </td>
                                <td class="form_label_right">批复工程：</td>
                                <td class="form_content">${hdExtend.pfGq}</td>
                            </tr>
                            <tr class="tr_dark">
                                <td class="form_label_right">总概算：</td>
                                <td colspan="3" class="form_content">${hdExtend.totalGs}</td>
                            </tr>
                            <tr class="tr_light">
                                <td class="form_label_right" style="text-align: center;">主体工程<br>施工图审批</td>
                                <td class="form_label_right">批准机关和文号：</td>
                                <td colspan="3" class="form_content">${hdExtend.pzjgCode}</td>
                            </tr>
                            <tr class="tr_dark">
                                <td class="form_label_right" style="text-align: center;">投资来源</td>
                                <td colspan="4" class="form_content">${hdExtend.costFrom}</td>
                            </tr>
                        </table>
                    </td>
                </tr>

                <tr>
                    <td colspan="4">
                        <table cellpadding="0" cellspacing="0" class="table_thin_line" border="1" style="width: 100%;">
                            <tr class="tr_header">
                                <td style="width: 5%;">序号</td>
                                <td style="width: 50%;">申请材料名称</td>
                                <td style="width: 8%;">应交份数</td>
                                <td style="width: 8%;">实交份数</td>
                                <td style="width: 15%;">附件</td>
                            </tr>
                            <c:forEach items="${applyList}" var="map">
                                <c:set value="upLoad${map.no}" var="upLoadNo"/>
                                <tr class="tr_dark">
                                    <td style="text-align: center;">${map.no}</td>
                                    <td style="text-align: left;">${map.materialName}</td>
                                    <td style="text-align: center;">${map.yjNum}</td>
                                    <td style="text-align: center;">${map.sjNum}</td>
                                    <td style="text-align: center;">${map[upLoadNo]}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </td>
                </tr>
                <tr class="tr_light">
                    <td class="form_label_right">提交时间：</td>
                    <td class="form_content" colspan="3">
                        <fmt:formatDate value="${bean.submitDate}" pattern="yyyy-MM-dd HH:mm"/>
                    </td>
                </tr>
            </table>
        </fieldset>
        <div class="div_space"></div>
        <fieldset class="form_fieldset" style="width: 96%;">
            <legend>受理初审</legend>
            <table cellpadding="0" cellspacing="0" class="form_table">
                <tr class="tr_light">
                    <td class="form_label_right" nowrap style="width: 20%;">受理编号：</td>
                    <td class="form_content" style="width: 80%;">${bean.acceptCode}</td>
                </tr>
                <tr class="tr_dark">
                    <td class="form_label_right">沪交管收字</td>
                    <td class="form_content">
                        （${bean.hjgYear}）第&nbsp;${bean.hjgNum}&nbsp;号
                    </td>
                </tr>
                <tr class="tr_light">
                    <td class="form_label_right">申请人：</td>
                    <td class="form_content">${bean.applyPerson}</td>
                </tr>
                <tr class="tr_dark">
                    <td class="form_label_right">申请事项：</td>
                    <td class="form_content">${bean.applyMatter}</td>
                </tr>
                <tr class="tr_light">
                    <td class="form_label_right">申请号：</td>
                    <td class="form_content">${bean.applyNum}</td>
                </tr>
                <tr class="tr_dark">
                    <td class="form_label_right">材料提交人：</td>
                    <td class="form_content">${bean.materialPerson}</td>
                </tr>
                <tr class="tr_light">
                    <td class="form_label_right">材料提交人联系电话：</td>
                    <td class="form_content">${bean.materialPersonPhone}</td>
                </tr>
                <tr class="tr_dark">
                    <td class="form_label_right">材料提交人联系地址：</td>
                    <td class="form_content">${bean.materialPersonAddress}</td>
                </tr>
                <tr class="tr_light">
                    <td class="form_label_right">收件人：</td>
                    <td class="form_content">${bean.receivePerson}</td>
                </tr>
                <tr class="tr_dark">
                    <td class="form_label_right">收件人联系电话：</td>
                    <td class="form_content">${bean.receivePersonPhone}</td>
                </tr>
                <tr class="tr_light">
                    <td class="form_label_right">受理意见：</td>
                    <td class="form_content">
                        <sys:toHtml>${bean.acceptOpinion}</sys:toHtml>
                    </td>
                </tr>
                <tr class="tr_dark">
                    <td class="form_label_right">受理时间：</td>
                    <td class="form_content">
                        <fmt:formatDate value="${bean.acceptDate}" pattern="yyyy-MM-dd HH:mm"/>
                        <form:hidden path="acceptDate"/>
                    </td>
                </tr>
            </table>
        </fieldset>
        <div class="div_space"></div>
        <fieldset class="form_fieldset" style="width: 96%;">
            <legend>审核信息</legend>
            <table cellpadding="0" cellspacing="0" class="form_table">
                <tr>
                    <td colspan="4">
                        <table cellpadding="0" cellspacing="0" class="table_thin_line" border="1" style="width: 100%;">
                            <tr class="tr_header">
                                <td style="width: 5%;">序号</td>
                                <td style="width: 25%;">提交材料名称</td>
                                <c:if test="${!isGreen}">
                                    <td style="width: 40%;">审核要求</td>
                                </c:if>
                                <c:if test="${isGreen}">
                                    <td style="width: 40%;">绿色审核要求</td>
                                </c:if>
                                <td style="width: 8%;">初审意见</td>
                                <td style="width: 8%;">复核意见</td>
                                <td style="width: 8%;">审核意见</td>
                            </tr>
                            <c:forEach items="${submitList}" var="map">
                                <input type="hidden" name="no" value="${map.no}"/>
                                <tr class="tr_dark">
                                    <td style="text-align: center;">${map.no}</td>
                                    <td style="text-align: left;">${map.materialName}</td>
                                    <c:if test="${!isGreen}">
                                        <td style="text-align: left;">${map.auditReq}</td>
                                    </c:if>
                                    <c:if test="${isGreen}">
                                        <td style="text-align: left;">${map.auditReqGreen}</td>
                                    </c:if>
                                    <td style="text-align: center;">
                                        <c:choose>
                                            <c:when test="${(bean.status==STATUS_SLZX_PASS)&&canCsAudit}">
                                                <select name="isCsOpinion${map.no}" id="isCsOpinion${map.no}"
                                                        class="form_select_long" style="width: 70px;">
                                                    <option value="1"
                                                            <c:if test="${map.isCsOpinion=='true'}">selected</c:if>>
                                                        符合
                                                    </option>
                                                    <option value="0"
                                                            <c:if test="${map.isCsOpinion=='false'||map.isCsOpinion==''}">selected</c:if>>
                                                        不符合
                                                    </option>
                                                </select>
                                            </c:when>
                                            <c:otherwise>
                                                <select name="isCsOpinion${map.no}" id="isCsOpinion${map.no}"
                                                        class="form_select_long" style="width: 70px;" disabled>
                                                    <option value="1"
                                                            <c:if test="${map.isCsOpinion=='true'}">selected</c:if>>
                                                        符合
                                                    </option>
                                                    <option value="0"
                                                            <c:if test="${map.isCsOpinion=='false'||map.isCsOpinion==''}">selected</c:if>>
                                                        不符合
                                                    </option>
                                                </select>
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td>
                                        <c:choose>
                                            <c:when test="${(bean.status==STATUS_CS_PASS)&&canFhAudit}">
                                                <select name="isFhOpinion${map.no}" id="isFhOpinion${map.no}"
                                                        class="form_select_long" style="width: 70px;">
                                                    <option value="1"
                                                            <c:if test="${map.isFhOpinion=='true'}">selected</c:if>>
                                                        符合
                                                    </option>
                                                    <option value="0"
                                                            <c:if test="${map.isFhOpinion=='false'||map.isFhOpinion==''||map.isFhOpinion=='null'}">selected</c:if>>
                                                        不符合
                                                    </option>
                                                </select>
                                            </c:when>
                                            <c:otherwise>
                                                <select name="isFhOpinion${map.no}" id="isFhOpinion${map.no}"
                                                        class="form_select_long" style="width: 70px;" disabled>
                                                    <option value="1"
                                                            <c:if test="${map.isFhOpinion=='true'}">selected</c:if>>
                                                        符合
                                                    </option>
                                                    <option value="0"
                                                            <c:if test="${map.isFhOpinion=='false'||map.isFhOpinion==''||map.isFhOpinion=='null'}">selected</c:if>>
                                                        不符合
                                                    </option>
                                                </select>
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td>
                                        <c:choose>
                                            <c:when test="${(bean.status==STATUS_FH_PASS)&&canAudit}">
                                                <select name="isShOpinion${map.no}" id="isShOpinion${map.no}"
                                                        class="form_select_long"
                                                        style="width: 70px;">
                                                    <option value="1"
                                                            <c:if test="${map.isShOpinion=='true'}">selected</c:if>>
                                                        符合
                                                    </option>
                                                    <option value="0"
                                                            <c:if test="${map.isShOpinion=='false'||map.isShOpinion==''||map.isShOpinion=='null'}">selected</c:if>>
                                                        不符合
                                                    </option>
                                                </select>
                                            </c:when>
                                            <c:otherwise>
                                                <select name="isShOpinion${map.no}" id="isShOpinion${map.no}"
                                                        class="form_select_long"
                                                        style="width: 70px;" disabled>
                                                    <option value="1"
                                                            <c:if test="${map.isShOpinion=='true'}">selected</c:if>>
                                                        符合
                                                    </option>
                                                    <option value="0"
                                                            <c:if test="${map.isShOpinion=='false'||map.isShOpinion==''||map.isShOpinion=='null'}">selected</c:if>>
                                                        不符合
                                                    </option>
                                                </select>
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                    </td>
                </tr>

                <c:if test="${(bean.status==STATUS_SLZX_PASS)&&canCsAudit}">
                    <tr class="tr_dark">
                        <td class="form_label_right" style="width: 20%;">初审意见：</td>
                        <td class="form_content" style="width: 80%;">
                            <form:textarea path="csOpinion" cssClass="input_textarea" cssStyle="width: 95%;"/>
                        </td>
                    </tr>
                </c:if>

                <c:if test="${(bean.status==STATUS_CS_PASS)&&canFhAudit}">
                    <tr class="tr_dark">
                        <td class="form_label_right" style="width: 20%;">初审意见：</td>
                        <td class="form_content" style="width: 80%;">
                            <sys:toHtml>${bean.csOpinion}</sys:toHtml>
                            <form:hidden path="csOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right" style="width: 15%;">初审时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.csDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_dark">
                        <td class="form_label_right">复核意见：</td>
                        <td class="form_content">
                            <form:textarea path="fhOpinion" cssClass="input_textarea" cssStyle="width: 95%;"/>
                        </td>
                    </tr>
                </c:if>

                <c:if test="${(bean.status==STATUS_FH_PASS)&&canAudit}">
                    <tr class="tr_dark">
                        <td class="form_label_right" style="width: 20%;">初审意见：</td>
                        <td class="form_content" style="width: 80%;">
                            <sys:toHtml>${bean.csOpinion}</sys:toHtml>
                            <form:hidden path="csOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right" style="width: 15%;">初审时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.csDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right">复核意见：</td>
                        <td class="form_content">
                            <sys:toHtml>${bean.fhOpinion}</sys:toHtml>
                            <form:hidden path="fhOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_dark">
                        <td class="form_label_right">复核时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.fhDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right">审核意见：</td>
                        <td class="form_content">
                            <form:textarea path="shOpinion" cssClass="input_textarea" cssStyle="width: 95%;"/>
                        </td>
                    </tr>
                </c:if>

                <c:if test="${(bean.status==STATUS_SH_PASS)&&canFgldAudit}">
                    <tr class="tr_dark">
                        <td class="form_label_right" style="width: 20%;">初审意见：</td>
                        <td class="form_content" style="width: 80%;">
                            <sys:toHtml>${bean.csOpinion}</sys:toHtml>
                            <form:hidden path="csOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right" style="width: 15%;">初审时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.csDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right">复核意见：</td>
                        <td class="form_content">
                            <sys:toHtml>${bean.fhOpinion}</sys:toHtml>
                            <form:hidden path="fhOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_dark">
                        <td class="form_label_right">复核时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.fhDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right">审核意见：</td>
                        <td class="form_content">
                            <sys:toHtml>${bean.shOpinion}</sys:toHtml>
                            <form:hidden path="shOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_dark">
                        <td class="form_label_right">审核时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.shDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right">分管领导审核意见：</td>
                        <td class="form_content">
                            <form:textarea path="fgldOpinion" cssClass="input_textarea" cssStyle="width: 95%;"/>
                        </td>
                    </tr>
                </c:if>

                <c:if test="${(bean.status==STATUS_FGLD_PASS)&&canZxldAudit}">
                    <tr class="tr_dark">
                        <td class="form_label_right" style="width: 20%;">初审意见：</td>
                        <td class="form_content" style="width: 80%;">
                            <sys:toHtml>${bean.csOpinion}</sys:toHtml>
                            <form:hidden path="csOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right" style="width: 15%;">初审时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.csDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right">复核意见：</td>
                        <td class="form_content">
                            <sys:toHtml>${bean.fhOpinion}</sys:toHtml>
                            <form:hidden path="fhOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_dark">
                        <td class="form_label_right">复核时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.fhDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right">审核意见：</td>
                        <td class="form_content">
                            <sys:toHtml>${bean.shOpinion}</sys:toHtml>
                            <form:hidden path="shOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_dark">
                        <td class="form_label_right">审核时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.shDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right">分管领导审核意见：</td>
                        <td class="form_content">
                            <sys:toHtml>${bean.fgldOpinion}</sys:toHtml>
                            <form:hidden path="fgldOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right">分管领导审核时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.fgldDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_dark">
                        <td class="form_label_right">中心领导审核意见：</td>
                        <td class="form_content">
                            <form:textarea path="zxldOpinion" cssClass="input_textarea" cssStyle="width: 95%;"/>
                        </td>
                    </tr>
                </c:if>

                <c:if test="${(bean.status==STATUS_ZXLD_PASS)&&canWldAudit}">
                    <tr class="tr_dark">
                        <td class="form_label_right" style="width: 20%;">初审意见：</td>
                        <td class="form_content" style="width: 80%;">
                            <sys:toHtml>${bean.csOpinion}</sys:toHtml>
                            <form:hidden path="csOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right" style="width: 15%;">初审时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.csDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right">复核意见：</td>
                        <td class="form_content">
                            <sys:toHtml>${bean.fhOpinion}</sys:toHtml>
                            <form:hidden path="fhOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_dark">
                        <td class="form_label_right">复核时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.fhDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right">审核意见：</td>
                        <td class="form_content">
                            <sys:toHtml>${bean.shOpinion}</sys:toHtml>
                            <form:hidden path="shOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_dark">
                        <td class="form_label_right">审核时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.shDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right">分管领导审核意见：</td>
                        <td class="form_content">
                            <sys:toHtml>${bean.fgldOpinion}</sys:toHtml>
                            <form:hidden path="fgldOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right">分管领导审核时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.fgldDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_dark">
                        <td class="form_label_right">中心领导审核意见：</td>
                        <td class="form_content">
                            <sys:toHtml>${bean.zxldOpinion}</sys:toHtml>
                            <form:hidden path="zxldOpinion"/>
                        </td>
                    </tr>
                    <tr class="tr_light">
                        <td class="form_label_right">中心领导审核时间：</td>
                        <td class="form_content">
                            <fmt:formatDate value="${bean.zxldDate}" pattern="yyyy-MM-dd HH:mm"/>
                        </td>
                    </tr>
                    <tr class="tr_dark">
                        <td class="form_label_right">委领导审核意见：</td>
                        <td class="form_content">
                            <form:textarea path="wldOpinion" cssClass="input_textarea" cssStyle="width: 95%;"/>
                        </td>
                    </tr>
                </c:if>
            </table>
        </fieldset>
        <div style="text-align: center;" class="tr_button">
            <c:if test="${bean.status==STATUS_SLZX_PASS}">
                <input type="button" value="审核通过" class="button_normal_long"
                       onclick="save(this,this.value,'${STATUS_CS_PASS}')">&nbsp;
                <%--<input type="button" value="审核退回" class="button_normal_long"--%>
                <%--onclick="save(this,this.value,'${STATUS_CS_BACK}')">&nbsp;--%>
                <%--<input type="button" value="补正退回" class="button_normal_long"--%>
                <%--onclick="save(this,this.value,'${STATUS_CS_BACK}')">--%>
            </c:if>
            <c:if test="${bean.status==STATUS_CS_PASS}">
                <input type="button" value="审核通过" class="button_normal_long"
                       onclick="save(this,this.value,'${STATUS_FH_PASS}')">&nbsp;
                <%--<input type="button" value="审核退回" class="button_normal_long"--%>
                <%--onclick="save(this,this.value,'${STATUS_FH_BACK}')">&nbsp;--%>
                <%--<input type="button" value="补正退回" class="button_normal_long"--%>
                <%--onclick="save(this,this.value,'${STATUS_FH_BACK}')">--%>
            </c:if>
            <c:if test="${bean.status==STATUS_FH_PASS}">
                <input type="button" value="审核通过" class="button_normal_long"
                       onclick="save(this,this.value,'${STATUS_SH_PASS}')">&nbsp;
                <input type="button" value="审核退回" class="button_normal_long"
                       onclick="save(this,this.value,'${STATUS_SH_BACK}')">&nbsp;
                <input type="button" value="补正退回" class="button_normal_long"
                       onclick="save(this,this.value,'${STATUS_SH_BACK}')">
            </c:if>
            <c:if test="${bean.status==STATUS_SH_PASS}">
                <input type="button" value="审核通过" class="button_normal_long"
                       onclick="save(this,this.value,'${STATUS_FGLD_PASS}')">&nbsp;
                <input type="button" value="审核退回" class="button_normal_long"
                       onclick="save(this,this.value,'${STATUS_FGLD_BACK}')">&nbsp;
                <input type="button" value="补正退回" class="button_normal_long"
                       onclick="save(this,this.value,'${STATUS_FGLD_BACK}')">
            </c:if>
            <c:if test="${bean.status==STATUS_FGLD_PASS}">
                <input type="button" value="审核通过" class="button_normal_long"
                       onclick="save(this,this.value,'${STATUS_ZXLD_PASS}')">&nbsp;
                <input type="button" value="审核退回" class="button_normal_long"
                       onclick="save(this,this.value,'${STATUS_ZXLD_BACK}')">&nbsp;
                <input type="button" value="补正退回" class="button_normal_long"
                       onclick="save(this,this.value,'${STATUS_ZXLD_BACK}')">
            </c:if>
            <c:if test="${bean.status==STATUS_ZXLD_PASS}">
                <input type="button" value="审核通过" class="button_normal_long"
                       onclick="save(this,this.value,'${STATUS_WLD_PASS}')">&nbsp;
                <%--<input type="button" value="审核退回" class="button_normal_long"--%>
                <%--onclick="save(this,this.value,'${STATUS_WLD_BACK}')">&nbsp;--%>
                <%--<input type="button" value="补正退回" class="button_normal_long"--%>
                <%--onclick="save(this,this.value,'${STATUS_WLD_BACK}')">--%>
            </c:if>
            <input type="button" value="取消" class="button_cancel" onclick="parent.closeWindow()">
        </div>
        <div class="div_space"></div>
    </div>
</form:form>
