<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/init.jsp"%>
<%@ include file="../init.jsp"%>
<%
	long permitId = ParamUtil.getLong(request, "permitId");
	request.setAttribute("permitId", permitId);
	List<ApplyMaterial> applyMaterials = ApplyMaterialLocalServiceUtil.findByPermitId(permitId, -1, -1);
	request.setAttribute("applyMaterials", applyMaterials);
	int num = 1;
%>

<portlet:actionURL var="saveFhURL" name="saveFh">
	<portlet:param name="permitId" value="${permitId}" />
</portlet:actionURL>
<aui:form action="${saveFhURL}" method="post">
	<table style="width: 98%" class="table table-striped table-bordered table-hover">
		<thead>
			<tr>
				<th width="5%" class="text-center">序号</th>
				<th width="30%" class="text-center">材料提交名称</th>
				<th width="45%" class="text-center">审核要求</th>
				<th width="10%" class="text-center">初审意见</th>
				<th width="10%" class="text-center">复核意见</th>
			</tr>
		</thead>
		<tbody id="applyMaterials">
			<c:if test="${!empty applyMaterials}">
				<c:forEach items="<%=applyMaterials%>" var="applyMaterial">
					<tr>
						<td class="text-center"><%=String.valueOf(num)%></td>
						<td class="text-left">${applyMaterial.clmc}</td>
						<td class="text-left">${applyMaterial.shyq}</td>
						<td>${applyMaterial.csyj}</td>
						<td><aui:select name="fhyj" label="" cssClass="span11">
								<c:if test="${applyMaterial.fhyj==''}">
									<aui:option value="符合">符合</aui:option>
									<aui:option value="不符合">不符合</aui:option>
								</c:if>
								<c:if test="${applyMaterial.fhyj=='符合'}">
									<aui:option value="符合">符合</aui:option>
									<aui:option value="不符合">不符合</aui:option>
								</c:if>
								<c:if test="${applyMaterial.fhyj=='不符合'}">
									<aui:option value="符合">符合</aui:option>
									<aui:option value="不符合" selected="true">不符合</aui:option>
								</c:if>
							</aui:select></td>
					</tr>
					</tr>
					<%
						num++;
					%>
				</c:forEach>
			</c:if>
		</tbody>

	</table>

	<!-- <div class="text-center">
		审核意见：
		<textarea rows="3" name="shyj" style="width: 70%; margin-bottom: 15px; margin-top: 15px"></textarea>
	</div> -->
	<div class="text-center">
		<div class="btn-group">
			<aui:button name="pass" type="submit" value="保存" cssClass="btn btn-primary" />
		</div>
		<%-- <div class="btn-group">
			<aui:button name="pass" value="审核通过" cssClass="btn btn-primary" />
		</div> --%>
		<div class="btn-group">
			<aui:button name="close" value="关闭" cssClass="btn" href="${viewURL}" />
		</div>
	</div>
	</div>
</aui:form>