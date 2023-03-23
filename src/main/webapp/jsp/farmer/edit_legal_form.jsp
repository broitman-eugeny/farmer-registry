<%@include file="/jsp/farmer/init.jsp"%>

<h3>Farmer registry</h3>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/jsp/farmer/view.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addLegalForm" var="actionAddLegalFormURL"/>

<aui:form action="<%= actionAddLegalFormURL %>" name="<portlet:namespace />fmAddLegalForm" >

    <aui:fieldset label="Edit/create legal form">

        <aui:input name="id" label="Legal form id" >
            <aui:validator name="required" />
            <aui:validator name="digits" />
        </aui:input>

        <aui:input name="abbreviation" label="Legal form abbreviation" >
            <aui:validator name="required" />
        </aui:input>

    </aui:fieldset>

    <aui:button-row>

        <aui:button type="submit"/>

        <aui:button type="cancel" onClick="<%= viewURL %>"/>

    </aui:button-row>

</aui:form>