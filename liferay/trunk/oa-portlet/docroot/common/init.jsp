<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/init-ext.jsp"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<portlet:defineObjects />
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<liferay-theme:defineObjects />

<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<%@ page import="com.liferay.portal.model.*"%>
<%@ page import="com.liferay.portal.service.*"%>
<%@ page import="java.util.*"%>
<%@ page import="com.liferay.portal.kernel.util.*"%>
<%@ page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@ page import="java.text.SimpleDateFormat"%>

<script type="text/javascript"
	src="/html/js/My97DatePicker/WdatePicker.js"></script>