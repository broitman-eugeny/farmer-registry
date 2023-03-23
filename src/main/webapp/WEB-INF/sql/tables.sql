create table FarmerRegistry_Farmer (
	id_ LONG not null primary key,
	organizationName VARCHAR(75) null,
	legalFormId INTEGER,
	inn VARCHAR(75) null,
	kpp VARCHAR(75) null,
	ogrn VARCHAR(75) null,
	regionId LONG,
	registrationDate DATE null,
	archive BOOLEAN
);

create table FarmerRegistry_LegalForm (
	id_ INTEGER not null primary key,
	abbreviation VARCHAR(75) null
);

create table FarmerRegistry_Ref (
	farmerId LONG not null,
	regionId LONG not null,
	primary key (farmerId, regionId)
);

create table FarmerRegistry_Region (
	id_ LONG not null primary key,
	name VARCHAR(75) null,
	code_ VARCHAR(75) null,
	archive BOOLEAN
);