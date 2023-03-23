create index IX_1616D8AA on FarmerRegistry_Farmer (archive, id_);
create index IX_721785CC on FarmerRegistry_Farmer (id_);
create index IX_EC648CA3 on FarmerRegistry_Farmer (inn, id_);
create index IX_40B7673A on FarmerRegistry_Farmer (organizationName, id_);
create index IX_4929A749 on FarmerRegistry_Farmer (regionId, id_);
create index IX_F31F6443 on FarmerRegistry_Farmer (registrationDate);
create index IX_B5CA2971 on FarmerRegistry_Farmer (registrationDate, id_);

create index IX_BA628D66 on FarmerRegistry_LegalForm (abbreviation);
create index IX_E2A31FB0 on FarmerRegistry_LegalForm (id_);

create index IX_1E6A4A2C on FarmerRegistry_Ref (farmerId);
create index IX_4130D18F on FarmerRegistry_Ref (farmerId, regionId);
create index IX_A97F913D on FarmerRegistry_Ref (regionId);

create index IX_56BF2939 on FarmerRegistry_Region (archive);
create index IX_B330991B on FarmerRegistry_Region (id_);
create index IX_22CD5CB7 on FarmerRegistry_Region (id_, archive);
create index IX_BB47BB58 on FarmerRegistry_Region (name);