<%@include file="/jsp/farmer/init.jsp" %>

<%
    long farmerId = ParamUtil.getLong(request, "farmerId", 0L);
    List<Region> cropRegionsToAdd = RefLocalServiceUtil.findCropRegionsToAddByfarmerId(farmerId);
    boolean disableAdd = cropRegionsToAdd.isEmpty();
    String farmerOrganizationName = FarmerLocalServiceUtil.getFarmerOrganizationNameById(farmerId);

    String filterRegistrationDateFrom = ParamUtil.getString(request, "filterRegistrationDateFrom", "");
    String filterRegistrationDateTo = ParamUtil.getString(request, "filterRegistrationDateTo", "");
    String filterOrganizationName = ParamUtil.getString(request, "filterOrganizationName", "");
    String filterInn = ParamUtil.getString(request, "filterInn", "");
    String filterRegionName = ParamUtil.getString(request, "filterRegionName", "");
    boolean filterArchive = ParamUtil.getBoolean(request, "filterArchive", false);
%>

<h3>Farmer registry</h3>

<strong>Farmer's '<%=farmerOrganizationName %>' crop region list</strong>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/jsp/farmer/view.jsp"/>
    <portlet:param name="filterRegistrationDateFrom" value="<%=filterRegistrationDateFrom%>"/>
    <portlet:param name="filterRegistrationDateTo" value="<%=filterRegistrationDateTo%>"/>
    <portlet:param name="filterOrganizationName" value="<%=filterOrganizationName%>"/>
    <portlet:param name="filterInn" value="<%=filterInn%>"/>
    <portlet:param name="filterRegionName" value="<%=filterRegionName%>"/>
    <portlet:param name="filterArchive" value="<%=String.valueOf(filterArchive)%>"/>
</portlet:renderURL>

<liferay-portlet:renderURL varImpl="cropRegionIteratorURL">
    <portlet:param name="mvcPath" value="/jsp/farmer/edit_farmer_crop_regions.jsp"/>
    <portlet:param name="farmerId" value='<%=String.valueOf(farmerId)%>' />
    <portlet:param name="filterRegistrationDateFrom" value="<%=filterRegistrationDateFrom%>"/>
    <portlet:param name="filterRegistrationDateTo" value="<%=filterRegistrationDateTo%>"/>
    <portlet:param name="filterOrganizationName" value="<%=filterOrganizationName%>"/>
    <portlet:param name="filterInn" value="<%=filterInn%>"/>
    <portlet:param name="filterRegionName" value="<%=filterRegionName%>"/>
    <portlet:param name="filterArchive" value="<%=String.valueOf(filterArchive)%>"/>
</liferay-portlet:renderURL>

<portlet:actionURL name="addRef" var="actionAddRefURL"/>

<liferay-ui:search-container
        emptyResultsMessage="No regions available!"
        total="<%=RefLocalServiceUtil.countByfarmerId(farmerId)%>"
        delta="5"
        deltaConfigurable="false"
        iteratorURL="<%=cropRegionIteratorURL %>"
>

    <liferay-ui:search-container-results
            results="<%=RefLocalServiceUtil.findRegionsByfarmerIdStartEnd(farmerId, searchContainer.getStart(),
                                searchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="com.isands.farmer.registry.model.Region" keyProperty="id" modelVar="region">

        <liferay-ui:search-container-column-text property="name"/>
        <liferay-ui:search-container-column-text property="code"/>
        <liferay-ui:search-container-column-text property="archive"/>

        <!-- For Delete URL -->
        <portlet:actionURL name="deleteRef" var="deleteRefURL">
            <portlet:param name="farmerId" value='<%=(String.valueOf(farmerId))%>'/>
            <portlet:param name="regionId" value="${region.id}"/>
        </portlet:actionURL>
        <liferay-ui:search-container-column-text name="Delete crop region" value="Delete" href="${deleteRefURL}"/>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:form action="<%= actionAddRefURL %>" name="<portlet:namespace />fmAddRef">

    <aui:fieldset label="Adding farmer crop region">

        <aui:input name="filterRegistrationDateFrom" type="hidden" value="<%=filterRegistrationDateFrom %>">
        </aui:input>

        <aui:input name="filterRegistrationDateTo" type="hidden" value="<%=filterRegistrationDateTo %>">
        </aui:input>

        <aui:input name="filterOrganizationName" type="hidden" value="<%=filterOrganizationName %>">
        </aui:input>

        <aui:input name="filterInn" type="hidden" value="<%=filterInn %>">
        </aui:input>

        <aui:input name="filterRegionName" type="hidden" value="<%=filterRegionName %>">
        </aui:input>

        <aui:input name="filterArchive" type="hidden" value="<%=String.valueOf(filterArchive) %>">
        </aui:input>

        <aui:input name="farmerId" type="hidden" value="<%=farmerId %>">
        </aui:input>

        <aui:select name="cropRegionToAddId" id="cropRegionsToAdd" label="Crop regions to add">
            <%
                if (!cropRegionsToAdd.isEmpty()) {
                    for (Region r : cropRegionsToAdd) {
            %>
            <aui:option value="<%=r.getId() %>">
                <%=r.getName() %>
            </aui:option>
            <%
                    }
                }
            %>
        </aui:select>

    </aui:fieldset>

    <aui:button-row>

        <aui:button type="submit" value="Add" disabled="<%=disableAdd %>"/>

        <aui:button type="cancel" value="To farmer list" onClick="<%= viewURL %>"/>

    </aui:button-row>
</aui:form>