create table proj_Bidding (
	biddingId LONG not null primary key,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	bidCode VARCHAR(75) null,
	sortNo INTEGER,
	bidName VARCHAR(75) null,
	bidCategoryCode VARCHAR(75) null,
	buildMileage VARCHAR(75) null,
	involveCounty VARCHAR(75) null,
	projLinkman VARCHAR(75) null,
	linkTel VARCHAR(75) null,
	startDate DATE null,
	projectId LONG
);

create table proj_Company (
	companyId LONG not null primary key,
	type_ LONG,
	unitName VARCHAR(75) null,
	indepLegal VARCHAR(75) null,
	indepLegalTel VARCHAR(75) null,
	indepLegalFax VARCHAR(75) null,
	indepLegalPhone VARCHAR(75) null,
	projLegal VARCHAR(75) null,
	projLegalTel VARCHAR(75) null,
	projLegalFax VARCHAR(75) null,
	projLegalPhone VARCHAR(75) null,
	linkman VARCHAR(75) null,
	linkmanTel VARCHAR(75) null,
	linkmanFax VARCHAR(75) null,
	linkmanPhone VARCHAR(75) null,
	projectId LONG,
	biddingId LONG
);

create table proj_Project (
	projectId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	bjbh VARCHAR(75) null,
	projNum VARCHAR(75) null,
	sortNo INTEGER,
	projStatus LONG,
	industryCategory LONG,
	manageAttr LONG,
	isMajor BOOLEAN,
	projSource LONG,
	belongCounty LONG,
	projAttr LONG,
	startDate DATE null,
	endDate DATE null,
	projName VARCHAR(75) null,
	location VARCHAR(75) null,
	involveCounty VARCHAR(75) null,
	ghhx DOUBLE,
	roadLevel LONG,
	roadTechLevel LONG,
	startNode DATE null,
	endNode DATE null,
	planStartDate DATE null,
	planEndDate DATE null,
	introduction VARCHAR(75) null,
	planTotle DOUBLE,
	gkpfTotle DOUBLE,
	gkpfPre DOUBLE,
	gkpfJafy DOUBLE,
	csTotle DOUBLE,
	csPre DOUBLE,
	csJafy DOUBLE
);