<%@include file="/jsp/farmer/init.jsp" %>

<%
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
%>

<h3>Farmer registry</h3>

<%-- Организационно-правовые формы --%>

<strong>Legal forms</strong>

<liferay-portlet:renderURL varImpl="legalFormIteratorURL">
    <portlet:param name="mvcPath" value="/jsp/farmer/view.jsp"/>
</liferay-portlet:renderURL>

<liferay-ui:search-container
        curParam="legalFormParam"
        emptyResultsMessage="No legal forms available!"
        total="<%=LegalFormLocalServiceUtil.getLegalFormsCount()%>"
        delta="5"
        deltaConfigurable="false"
        iteratorURL="<%=legalFormIteratorURL %>"
>

    <liferay-ui:search-container-results
            results="<%=LegalFormLocalServiceUtil.getLegalForms(searchContainer.getStart(),
                        searchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="com.isands.farmer.registry.model.LegalForm" keyProperty="id" modelVar="legalForm">

        <liferay-ui:search-container-column-text property="id"/>
        <liferay-ui:search-container-column-text property="abbreviation"/>

        <!-- For Delete URL -->
        <portlet:actionURL name="deleteLegalForm" var="deleteLegalFormURL">
            <portlet:param name="legalFormId" value="${legalForm.id}"/>
        </portlet:actionURL>
        <liferay-ui:search-container-column-text name="Delete Legal Form" value="Delete" href="${deleteLegalFormURL}"/>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:button-row cssClass="legalForm-buttons">

    <portlet:renderURL var="addLegalFormURL">
        <portlet:param name="mvcPath" value="/jsp/farmer/edit_legal_form.jsp"/>
    </portlet:renderURL>
    <aui:button onClick="<%=addLegalFormURL%>" value="Add"/>

</aui:button-row>

<%-- Фильтр фермеров --%>

<%
    String filterRegistrationDateFrom = ParamUtil.getString(request, "filterRegistrationDateFrom", "");
    String filterRegistrationDateTo = ParamUtil.getString(request, "filterRegistrationDateTo", "");
    String filterOrganizationName = ParamUtil.getString(request, "filterOrganizationName", "");
    String filterInn = ParamUtil.getString(request, "filterInn", "");
    String filterRegionName = ParamUtil.getString(request, "filterRegionName", "");
    boolean filterArchive = ParamUtil.getBoolean(request, "filterArchive", false);
%>

<portlet:actionURL name="filterFarmer" var="actionFilterFarmerURL"/>

<aui:form action="<%= actionFilterFarmerURL %>" name="<portlet:namespace />fmFilterFarmer">

    <aui:fieldset label="Farmer filter">

        <aui:input name="filterRegistrationDateFrom" label="Registration date 'From' (yyyy-MM-dd)"
                   value="<%=filterRegistrationDateFrom %>">
            <aui:validator name="date" errorMessage="Enter date with format: 'yyyy-MM-dd', please"/>
            <aui:validator name="minLength">2</aui:validator>
        </aui:input>

        <aui:input name="filterRegistrationDateTo" label="Registration date 'To' (yyyy-MM-dd)"
                   value="<%=filterRegistrationDateTo %>">
            <aui:validator name="date" errorMessage="Enter date with format: 'yyyy-MM-dd', please"/>
            <aui:validator name="minLength">2</aui:validator>
        </aui:input>

        <aui:input name="filterOrganizationName" label="Organization name (wildcards % allowed)"
                   value="<%=filterOrganizationName %>">
            <aui:validator name="minLength">2</aui:validator>
        </aui:input>

        <aui:input name="filterInn" label="INN (wildcards % allowed)" value="<%=filterInn %>">
            <aui:validator name="rangeLength">[2,12]</aui:validator>
        </aui:input>

        <aui:input name="filterRegionName" label="Region name (wildcards % allowed)" value="<%=filterRegionName %>">
            <aui:validator name="minLength">2</aui:validator>
        </aui:input>

        <aui:input name="filterArchive" type="checkbox" label="Region is archived"
                   value="<%=String.valueOf(filterArchive) %>">
        </aui:input>

    </aui:fieldset>

    <aui:button-row>

        <aui:button type="submit" value="Find"/>

    </aui:button-row>

</aui:form>

<%-- Фермеры --%>

<strong>Farmer list</strong>

<%
    List<Farmer> filteredFarmers = FarmerLocalServiceUtil.getFilteredFarmers(filterRegistrationDateFrom,
            filterRegistrationDateTo,
            filterOrganizationName,
            filterInn,
            filterRegionName,
            filterArchive);
%>

<liferay-portlet:renderURL varImpl="farmerIteratorURL">
    <portlet:param name="mvcPath" value="/jsp/farmer/view.jsp"/>
    <portlet:param name="filterRegistrationDateFrom" value="<%=filterRegistrationDateFrom%>"/>
    <portlet:param name="filterRegistrationDateTo" value="<%=filterRegistrationDateTo%>"/>
    <portlet:param name="filterOrganizationName" value="<%=filterOrganizationName%>"/>
    <portlet:param name="filterInn" value="<%=filterInn%>"/>
    <portlet:param name="filterRegionName" value="<%=filterRegionName%>"/>
    <portlet:param name="filterArchive" value="<%=String.valueOf(filterArchive)%>"/>
</liferay-portlet:renderURL>

<liferay-ui:search-container
        curParam="farmerParam"
        emptyResultsMessage="No farmers available!"
        total="<%=filteredFarmers.size()%>"
        delta="10"
        deltaConfigurable="false"
        iteratorURL="<%=farmerIteratorURL %>"
>

    <liferay-ui:search-container-results
            results="<%=FarmerLocalServiceUtil.getFilteredFarmers(filteredFarmers,
                searchContainer.getStart(),
                searchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="com.isands.farmer.registry.model.Farmer" keyProperty="id" modelVar="farmer">

        <liferay-ui:search-container-column-text property="organizationName"/>
        <liferay-ui:search-container-column-text name="Legal form"
                                                 value="<%=LegalFormLocalServiceUtil.getLegalFormAbbreviationById(farmer.getLegalFormId()) %>"/>
        <liferay-ui:search-container-column-text property="inn"/>
        <liferay-ui:search-container-column-text property="kpp"/>
        <liferay-ui:search-container-column-text property="ogrn"/>
        <liferay-ui:search-container-column-text name="Region"
                                                 value="<%=RegionLocalServiceUtil.getRegionNameById(farmer.getRegionId()) %>"/>
        <liferay-ui:search-container-column-text name="Registration Date"
                                                 value="<%=dateFormat.format(farmer.getRegistrationDate())%>"/>
        <liferay-ui:search-container-column-text property="archive"/>

        <!-- For Update URL -->

        <portlet:renderURL var="editFarmerURL">
            <portlet:param name="mvcPath" value="/jsp/farmer/edit_farmer.jsp"/>
            <portlet:param name="farmerId" value="${farmer.id}"/>
            <portlet:param name="farmerOrganizationName" value="${farmer.organizationName}"/>
            <portlet:param name="farmerLegalFormId" value="${farmer.legalFormId}"/>
            <portlet:param name="farmerInn" value="${farmer.inn}"/>
            <portlet:param name="farmerKpp" value="${farmer.kpp}"/>
            <portlet:param name="farmerOgrn" value="${farmer.ogrn}"/>
            <portlet:param name="farmerRegionId" value="${farmer.regionId}"/>
            <portlet:param name="farmerRegistrationDate" value="<%=dateFormat.format(farmer.getRegistrationDate())%>"/>
            <portlet:param name="farmerArchive" value="${farmer.archive}"/>
            <portlet:param name="filterRegistrationDateFrom" value="<%=filterRegistrationDateFrom%>"/>
            <portlet:param name="filterRegistrationDateTo" value="<%=filterRegistrationDateTo%>"/>
            <portlet:param name="filterOrganizationName" value="<%=filterOrganizationName%>"/>
            <portlet:param name="filterInn" value="<%=filterInn%>"/>
            <portlet:param name="filterRegionName" value="<%=filterRegionName%>"/>
            <portlet:param name="filterArchive" value="<%=String.valueOf(filterArchive)%>"/>
        </portlet:renderURL>
        <liferay-ui:search-container-column-text name="View/Update farmer" value="View/Update" href="${editFarmerURL}"/>

        <!-- For Add/Delete farmer's crop regions URL -->

        <portlet:renderURL var="editFarmerCropRegionURL">
            <portlet:param name="mvcPath" value="/jsp/farmer/edit_farmer_crop_regions.jsp"/>
            <portlet:param name="farmerId" value="${farmer.id}"/>
            <portlet:param name="filterRegistrationDateFrom" value="<%=filterRegistrationDateFrom%>"/>
            <portlet:param name="filterRegistrationDateTo" value="<%=filterRegistrationDateTo%>"/>
            <portlet:param name="filterOrganizationName" value="<%=filterOrganizationName%>"/>
            <portlet:param name="filterInn" value="<%=filterInn%>"/>
            <portlet:param name="filterRegionName" value="<%=filterRegionName%>"/>
            <portlet:param name="filterArchive" value="<%=String.valueOf(filterArchive)%>"/>
        </portlet:renderURL>
        <liferay-ui:search-container-column-text name="Add/Delete farmer's crop regions" value="Add/Delete"
                                                 href="${editFarmerCropRegionURL}"/>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:button-row cssClass="farmer-buttons">

    <portlet:renderURL var="addFarmerURL">
        <portlet:param name="mvcPath" value="/jsp/farmer/edit_farmer.jsp"/>
        <portlet:param name="farmerId" value="0"/>
        <portlet:param name="farmerOrganizationName" value=""/>
        <portlet:param name="farmerLegalFormId" value=""/>
        <portlet:param name="farmerInn" value=""/>
        <portlet:param name="farmerKpp" value=""/>
        <portlet:param name="farmerOgrn" value=""/>
        <portlet:param name="farmerRegionId" value=""/>
        <portlet:param name="farmerRegistrationDate" value=""/>
        <portlet:param name="farmerArchive" value=""/>
        <portlet:param name="filterRegistrationDateFrom" value="<%=filterRegistrationDateFrom%>"/>
        <portlet:param name="filterRegistrationDateTo" value="<%=filterRegistrationDateTo%>"/>
        <portlet:param name="filterOrganizationName" value="<%=filterOrganizationName%>"/>
        <portlet:param name="filterInn" value="<%=filterInn%>"/>
        <portlet:param name="filterRegionName" value="<%=filterRegionName%>"/>
        <portlet:param name="filterArchive" value="<%=String.valueOf(filterArchive)%>"/>
    </portlet:renderURL>
    <aui:button onClick="<%=addFarmerURL%>" value="Add"/>

</aui:button-row>