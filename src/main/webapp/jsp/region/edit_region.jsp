<%@include file="/jsp/region/init.jsp" %>

<h3>Farmer registry</h3>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/jsp/region/view.jsp"/>
</portlet:renderURL>

<%
   long regionId = ParamUtil.getLong(request, "regionId", 0L);
   String regionName = ParamUtil.getString(request, "regionName", "");
   String regionCode = ParamUtil.getString(request, "regionCode", "");
   boolean regionArchive = ParamUtil.getBoolean(request, "regionArchive", false);
%>

<portlet:actionURL name="addRegion" var="actionAddRegionURL"/>

<aui:form action="<%= actionAddRegionURL %>" name="<portlet:namespace />fmAddRegion" >

    <aui:fieldset label="Edit/create region">

        <aui:input name="id" type="hidden" value="<%=regionId %>">
        </aui:input>

        <aui:input name="name" label="Region name" value="<%=regionName %>" >
            <aui:validator name="required" />
        </aui:input>

        <aui:input name="code" label="Region code" value="<%=regionCode %>">
        </aui:input>

        <aui:input name="archive" type="checkbox" label="Send region to archive" value="<%=regionArchive %>">
        </aui:input>

    </aui:fieldset>

    <aui:button-row>

        <aui:button type="submit"/>

        <aui:button type="cancel" onClick="<%= viewURL %>"/>

    </aui:button-row>

</aui:form>