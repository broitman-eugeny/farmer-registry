<%@include file="/jsp/region/init.jsp" %>

<h3>Farmer registry</h3>

<strong>Region list</strong>

<liferay-portlet:renderURL varImpl="iteratorURL">
    <portlet:param name="mvcPath" value="/jsp/region/view.jsp"/>
</liferay-portlet:renderURL>

<liferay-ui:search-container
        emptyResultsMessage="No regions available!"
        total="<%=RegionLocalServiceUtil.countByArchive(false)%>"
        delta="10"
        deltaConfigurable="false"
        iteratorURL="<%=iteratorURL %>"
>

    <liferay-ui:search-container-results
            results="<%=RegionLocalServiceUtil.findByArchive(false, searchContainer.getStart(),
                        searchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="com.isands.farmer.registry.model.Region" keyProperty="id" modelVar="region">

        <liferay-ui:search-container-column-text property="name"/>
        <liferay-ui:search-container-column-text property="code"/>

        <!-- For Update URL -->

        <portlet:renderURL var="editRegionURL">
            <portlet:param name="mvcPath" value="/jsp/region/edit_region.jsp"/>
            <portlet:param name="regionId" value="${region.id}"/>
            <portlet:param name="regionName" value="${region.name}"/>
            <portlet:param name="regionCode" value="${region.code}"/>
            <portlet:param name="regionArchive" value="${region.archive}"/>
        </portlet:renderURL>
        <liferay-ui:search-container-column-text name="Update Region" value="Update" href="${editRegionURL}"/>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<portlet:renderURL var="addRegionURL">
    <portlet:param name="mvcPath" value="/jsp/region/edit_region.jsp"/>
    <portlet:param name="regionId" value="0"/>
    <portlet:param name="regionName" value=""/>
    <portlet:param name="regionCode" value=""/>
    <portlet:param name="regionArchive" value="false"/>
</portlet:renderURL>

<aui:button-row cssClass="region-buttons">

    <aui:button onClick="<%=addRegionURL%>" value="Add"/>

</aui:button-row>