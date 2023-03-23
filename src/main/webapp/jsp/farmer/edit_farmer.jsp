<%@include file="/jsp/farmer/init.jsp" %>

<h3>Farmer registry</h3>

<%
    long farmerId = ParamUtil.getLong(request, "farmerId", 0L);
    String farmerOrganizationName = ParamUtil.getString(request, "farmerOrganizationName", "");
    int farmerLegalFormId = ParamUtil.getInteger(request, "farmerLegalFormId", 0);
    String farmerInn = ParamUtil.getString(request, "farmerInn", "");
    String farmerKpp = ParamUtil.getString(request, "farmerKpp", "");
    String farmerOgrn = ParamUtil.getString(request, "farmerOgrn", "");
    long farmerRegionId = ParamUtil.getLong(request, "farmerRegionId", 0L);
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String farmerRegistrationDate =
            dateFormat.format(ParamUtil.getDate(request, "farmerRegistrationDate", dateFormat, new Date()));
    boolean farmerArchive = ParamUtil.getBoolean(request, "farmerArchive", false);

    List<LegalForm> legalForms = LegalFormLocalServiceUtil.findAll();
    List<Region> regions = RegionLocalServiceUtil.findByArchive(false);

    String filterRegistrationDateFrom = ParamUtil.getString(request, "filterRegistrationDateFrom", "");
    String filterRegistrationDateTo = ParamUtil.getString(request, "filterRegistrationDateTo", "");
    String filterOrganizationName = ParamUtil.getString(request, "filterOrganizationName", "");
    String filterInn = ParamUtil.getString(request, "filterInn", "");
    String filterRegionName = ParamUtil.getString(request, "filterRegionName", "");
    boolean filterArchive = ParamUtil.getBoolean(request, "filterArchive", false);
%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/jsp/farmer/view.jsp"/>
    <portlet:param name="filterRegistrationDateFrom" value="<%=filterRegistrationDateFrom%>"/>
    <portlet:param name="filterRegistrationDateTo" value="<%=filterRegistrationDateTo%>"/>
    <portlet:param name="filterOrganizationName" value="<%=filterOrganizationName%>"/>
    <portlet:param name="filterInn" value="<%=filterInn%>"/>
    <portlet:param name="filterRegionName" value="<%=filterRegionName%>"/>
    <portlet:param name="filterArchive" value="<%=String.valueOf(filterArchive)%>"/>
</portlet:renderURL>

<portlet:actionURL name="addFarmer" var="actionAddFarmerURL"/>

<aui:form action="<%= actionAddFarmerURL %>" name="<portlet:namespace />fmAddFarmer">

    <aui:fieldset label="Edit/create farmer">

        <aui:input name="id" type="hidden" value="<%=farmerId %>">
        </aui:input>

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

        <aui:input name="organizationName" label="Organization name" value="<%=farmerOrganizationName %>">
            <aui:validator name="required"/>
        </aui:input>

        <aui:select name="legalFormId" id="legalForms" label="Legal Form">
            <%
                boolean selected;
                if (!legalForms.isEmpty()) {
                    for (LegalForm lf : legalForms) {
                        selected = lf.getId() == farmerLegalFormId;
            %>
            <aui:option value="<%=lf.getId() %>" selected="<%=selected %>">
                <%=lf.getAbbreviation()%>
            </aui:option>
            <%
                    }
                }
                if(farmerLegalFormId == 0) {
            %>
            <aui:option value="0" selected="true">
            </aui:option>
            <%
                }
            %>
        </aui:select>

        <aui:input name="inn" label="INN" value="<%=farmerInn %>">
            <aui:validator name="required"/>
            <aui:validator name="digits"/>
            <aui:validator name="rangeLength"
                           errorMessage="Enter 10 digits for legal entity or 12 digits for individual, please">
                [10, 12]
            </aui:validator>
        </aui:input>

        <aui:input name="kpp" label="KPP" value="<%=farmerKpp %>">
            <aui:validator name="digits"/>
            <aui:validator name="rangeLength">[9, 9]</aui:validator>
        </aui:input>

        <aui:input name="ogrn" label="OGRN" value="<%=farmerOgrn %>">
            <aui:validator name="digits"/>
            <aui:validator name="rangeLength"
                           errorMessage="Enter 13 digits for legal entity or 15 digits for individual, please">
                [13, 15]
            </aui:validator>
        </aui:input>

        <aui:select name="regionId" id="regions" label="Regions">
            <%
                boolean selected;
                if (!regions.isEmpty()) {
                    for (Region r : regions) {
                        selected = r.getId() == farmerRegionId;
            %>
            <aui:option value="<%=r.getId() %>" selected="<%=selected %>">
                <%=r.getName() %>
            </aui:option>
            <%
                    }
                }
                if(farmerRegionId == 0) {
            %>
            <aui:option value="0" selected="true">
            </aui:option>
            <%
                }
            %>
        </aui:select>

        <aui:input name="registrationDate" label="Registration date (yyyy-MM-dd)" value="<%=farmerRegistrationDate %>">
            <aui:validator name="date" errorMessage="Enter date with format: 'yyyy-MM-dd', please"/>
        </aui:input>

        <aui:input name="archive" type="checkbox" label="Send region to archive" value="<%=farmerArchive %>">
        </aui:input>

    </aui:fieldset>


    <%
        if (farmerId > 0L) { //edit (farmer exists in database)
    %>

    <strong>Farmer's crop region list</strong>

    <liferay-portlet:renderURL varImpl="farmerRegioniteratorURL">
        <portlet:param name="mvcPath" value="/jsp/farmer/edit_farmer.jsp"/>
        <portlet:param name="farmerId" value='<%=String.valueOf(farmerId) %>'/>
        <portlet:param name="farmerOrganizationName" value='<%=farmerOrganizationName %>'/>
        <portlet:param name="farmerLegalFormId" value='<%=String.valueOf(farmerLegalFormId) %>'/>
        <portlet:param name="farmerInn" value='<%=farmerInn %>'/>
        <portlet:param name="farmerKpp" value='<%=farmerKpp %>'/>
        <portlet:param name="farmerOgrn" value='<%=farmerOgrn %>'/>
        <portlet:param name="farmerRegionId" value='<%=String.valueOf(farmerRegionId) %>'/>
        <portlet:param name="farmerRegistrationDate" value='<%=farmerRegistrationDate %>'/>
        <portlet:param name="farmerArchive" value='<%=String.valueOf(farmerArchive) %>'/>
        <portlet:param name="filterRegistrationDateFrom" value="<%=filterRegistrationDateFrom%>"/>
        <portlet:param name="filterRegistrationDateTo" value="<%=filterRegistrationDateTo%>"/>
        <portlet:param name="filterOrganizationName" value="<%=filterOrganizationName%>"/>
        <portlet:param name="filterInn" value="<%=filterInn%>"/>
        <portlet:param name="filterRegionName" value="<%=filterRegionName%>"/>
        <portlet:param name="filterArchive" value="<%=String.valueOf(filterArchive)%>"/>
    </liferay-portlet:renderURL>

    <liferay-ui:search-container
            emptyResultsMessage="No regions available!"
            total="<%=RefLocalServiceUtil.countByfarmerId(farmerId)%>"
            delta="5"
            deltaConfigurable="false"
            iteratorURL="<%=farmerRegioniteratorURL %>"
    >

        <liferay-ui:search-container-results
                results="<%=RefLocalServiceUtil.findRegionsByfarmerIdStartEnd(farmerId, searchContainer.getStart(),
                                searchContainer.getEnd())%>"/>

        <liferay-ui:search-container-row
                className="com.isands.farmer.registry.model.Region" keyProperty="id" modelVar="region">

            <liferay-ui:search-container-column-text property="name"/>
            <liferay-ui:search-container-column-text property="code"/>
            <liferay-ui:search-container-column-text property="archive"/>
        </liferay-ui:search-container-row>

        <liferay-ui:search-iterator/>
    </liferay-ui:search-container>

    <%
        } //if (farmerId > 0L) {
    %>

    <aui:button-row>

        <aui:button type="submit"/>

        <aui:button type="cancel" onClick="<%= viewURL %>"/>

    </aui:button-row>

</aui:form>