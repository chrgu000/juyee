<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/init.jsp"%>
<%@ include file="init.jsp"%>
<script type="text/javascript">
    window.jQuery || document.write("<script src='/static/jquery/jquery-1.12.4.min.js'>"+"<"+"/script>");
</script> 
<liferay-ui:header title="施工许可申请查看" backURL="${viewURL }" />
<liferay-ui:tabs names="工程概况,参建单位,单位工程,申请材料" refresh="false">
	<liferay-ui:section>
		<jsp:include page="${contextPath }/view-permit/projectprofile.jsp" />
	</liferay-ui:section>
	<liferay-ui:section>
		<jsp:include page="${contextPath }/view-permit/participationunits.jsp" />
	</liferay-ui:section>
	<liferay-ui:section>
		<jsp:include page="${contextPath }/view-permit/unitprojects.jsp" />
	</liferay-ui:section>
	<liferay-ui:section>
		<jsp:include page="${contextPath }/view-permit/applymaterials.jsp" />
	</liferay-ui:section>
</liferay-ui:tabs>
<br>
<%
	Long permitId = ParamUtil.getLong(request, "permitId");
	Permit permit = PermitLocalServiceUtil.getPermit(permitId);
	ProjectProfile projectProfile = ProjectProfileLocalServiceUtil.getProjectProfile(permitId);
	int status = permit.getStatus();
	request.setAttribute("permitId", permitId);
%>
<aui:button-row cssClass="text-center">
	<portlet:renderURL var="printsjpzURL" windowState="pop_up">
		<portlet:param name="mvcPath" value="${contextPath}/print/sjpz.jsp" />
		<portlet:param name="permitId" value="${permitId}" />
	</portlet:renderURL>
	<portlet:renderURL var="printsltzsURL" windowState="pop_up">
		<portlet:param name="mvcPath" value="${contextPath}/print/sltzs.jsp" />
		<portlet:param name="permitId" value="${permitId}" />
	</portlet:renderURL>
	<portlet:renderURL var="printbysljdsURL" windowState="pop_up">
		<portlet:param name="mvcPath" value="${contextPath}/print/bysljds.jsp" />
		<portlet:param name="permitId" value="${permitId}" />
	</portlet:renderURL>
	<portlet:renderURL var="printbzclURL" windowState="pop_up">
		<portlet:param name="mvcPath" value="${contextPath}/print/bzcl.jsp" />
		<portlet:param name="permitId" value="${permitId}" />
	</portlet:renderURL>
	<portlet:renderURL var="printjsscbURL" windowState="pop_up">
		<portlet:param name="mvcPath" value="${contextPath}/print/jsscb.jsp" />
		<portlet:param name="permitId" value="${permitId}" />
	</portlet:renderURL>
	<portlet:resourceURL var="printsgxkURL" id="printsgxkPdf">
	</portlet:resourceURL>
	<portlet:resourceURL var="printsgxklsURL" id="printsgxklsPdf">
	</portlet:resourceURL>
	<portlet:resourceURL var="printkgbaURL" id="printkgbaPdf"> 
	</portlet:resourceURL>
	<portlet:resourceURL var="printsgxk" id="ptintsgxkExcel">  
		<portlet:param name="permitId" value="${permitId}" /> 
	</portlet:resourceURL>
	<portlet:resourceURL var="printsgxkls" id="printsgxklsExcel">
		<portlet:param name="permitId" value="${permitId}" />
	</portlet:resourceURL>
	<portlet:resourceURL var="printkgba" id="printkgbaExcel">
		<portlet:param name="permitId" value="${permitId}" />
	</portlet:resourceURL>
	<c:if test="<%=!projectProfile.getLxjb().equals(\"区县级机关或区县级单位\")%>">
		<c:if test="<%=status >= 5%>">
			<a class="btn" href="${printsjpzURL}" target="_blank">收件凭证</a>
		</c:if>
		<c:if test="<%=status >= 9%>">
			<a class="btn" href="${printsltzsURL}" target="_blank">受理通知书</a>
		</c:if>
		<c:if test="<%=status == 10%>">
			<a class="btn" href="${printbysljdsURL}" target="_blank">不予受理决定书</a>
		</c:if>
		<c:if test="<%=status == 23%>">
			<a class="btn" href="${printbzclURL}" target="_blank">补正材料</a>
		</c:if>
		<c:if
			test="<%=status == CityPermitStatus.STATUS_ZXLD_PASS.getCode()
								|| status == CityPermitStatus.STATUS_WLD_PASS.getCode()%>">
			<a class="btn" href="${printjsscbURL}" target="_blank">技术审查表</a>
		</c:if>
		<c:if test="<%=status == CityPermitStatus.STATUS_WLD_PASS.getCode()%>">
			<c:choose>
				<c:when test="<%=projectProfile.getXmlx() == 29741%>">
					<a class="btn" onclick="kgba()">开工备案Pdf</a>
					<a class="btn" href="${printkgba}">开工备案Excel</a>
				</c:when>
				<c:otherwise>
					<c:if test="<%=projectProfile.getXmxz() != 29769%>">
						<a class="btn" onclick="sgxk()" >施工许可(绿色)Pdf</a>
						<a class="btn" href="${printsgxkls}">施工许可(绿色)Excel</a>
					</c:if>
					<c:if test="<%=projectProfile.getXmxz() == 29769%>">
						<a class="btn" onclick="sgxkls()">施工许可Pdf</a>
						<a class="btn" href="${printsgxk}">施工许可Excel</a>
					</c:if>
				</c:otherwise>
			</c:choose>
		</c:if>
		<c:if test="<%=status == CityPermitStatus.STATUS_WLD_BACK.getCode()%>">
			<a class="btn" href="" target="_blank">不予许可通知书</a>
		</c:if>
	</c:if>
	<c:if test="<%=projectProfile.getLxjb().equals(\"区县级机关或区县级单位\")%>">
		<c:if test="<%=status >= 3%>">
			<a class="btn" href="${printsjpzURL}" target="_blank">收件凭证</a>
		</c:if>
		<c:if
			test="<%=status == CountyPermitStatus.STATUS_SP_PASS.getCode()
								|| status == CountyPermitStatus.STATUS_SP_BACK.getCode()%>">
			<a class="btn" href="${printsltzsURL}" target="_blank">受理通知书</a>
		</c:if>
		<c:if test="<%=status == 8%>">
			<a class="btn" href="${printbysljdsURL}" target="_blank">不予受理决定书</a>
		</c:if>
		<c:if test="<%=status == 9%>">
			<a class="btn" href="${printbzclURL}" target="_blank">补正材料</a>
		</c:if>
		<c:if
			test="<%=status == CountyPermitStatus.STATUS_SP_PASS.getCode()%>">
			<c:choose>
				<c:when test="<%=projectProfile.getXmlx() == 29741%>">
					<a class="btn" onclick="kgba()">开工备案Pdf</a>
					<a class="btn" href="${printkgba}">开工备案Excel</a>
				</c:when>
				<c:otherwise>
					<c:if test="<%=projectProfile.getXmxz() != 29769%>">
						<a class="btn" onclick="sgxk()" >施工许可(绿色)Pdf</a>
						<a class="btn" href="${printsgxkls}">施工许可(绿色)Excel</a>
					</c:if>
					<c:if test="<%=projectProfile.getXmxz() == 29769%>">
						<a class="btn" onclick="sgxkls()">施工许可Pdf</a>
						<a class="btn" href="${printsgxk}">施工许可Excel</a>
					</c:if>
				</c:otherwise>
			</c:choose>
		</c:if>
	</c:if>
<script type="text/javascript">
	function kgba(){
		$.ajax({
			type:"GET",	
			url:"<%=printkgbaURL%>",
			data:{
				'permitId':<%=permitId%>
			},
			success:function(data){
				location.href=data;
			}
		})
	}
	function sgxk(){
		$.ajax({
			type:"GET",
			url:"<%=printsgxkURL%>",
			data:{
				'permitId':<%=permitId%>
			},
			success:function(data){
				location.href=data;
			}
		})
	}
	function sgxkls(){
		$.ajax({
			type:"GET",
			url:"<%=printsgxklsURL%>",
			data:{
				'permitId':<%=permitId%>
			},
			success:function(data){
				location.href=data;
			}
		})
	}
</script>
</aui:button-row>