<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>


<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.isands.farmer.registry.service.FarmerLocalServiceUtil" %>"
<%@ page import="com.isands.farmer.registry.service.LegalFormLocalServiceUtil" %>
<%@ page import="com.isands.farmer.registry.service.RefLocalServiceUtil" %>
<%@ page import="com.isands.farmer.registry.model.LegalForm" %>
<%@ page import="com.isands.farmer.registry.service.RegionLocalServiceUtil" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.isands.farmer.registry.model.Farmer" %>
<%@ page import="com.isands.farmer.registry.model.Region" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.isands.farmer.registry.service.persistence.LegalFormUtil" %>
<%@ page import="java.text.DateFormat" %>

<theme:defineObjects />
<portlet:defineObjects />