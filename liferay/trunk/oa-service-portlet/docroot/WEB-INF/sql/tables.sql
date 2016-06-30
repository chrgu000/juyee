create table oa_DeptWork (
	deptWorkId LONG not null primary key,
	userId LONG,
	userName VARCHAR(75) null,
	createTime DATE null,
	modifiedTime DATE null,
	deptId LONG,
	deptName VARCHAR(75) null,
	startDate DATE null,
	endDate DATE null,
	status VARCHAR(75) null
);

create table oa_DeptWorkItem (
	deptWorkItemId LONG not null primary key,
	deptWorkId LONG,
	sortNo INTEGER,
	dutyPerosn VARCHAR(75) null,
	mainWork BOOLEAN,
	schedule VARCHAR(75) null,
	content VARCHAR(1000) null,
	agentPerson VARCHAR(75) null
);

create table oa_LeaderWork (
	userId LONG not null,
	workDate LONG not null,
	amOrPm LONG not null,
	userName VARCHAR(75) null,
	createTime DATE null,
	modifiedTime DATE null,
	content VARCHAR(1000) null,
	primary key (userId, workDate, amOrPm)
);

create table oa_OfficeSupply (
	officeSupplyId LONG not null primary key,
	userId LONG,
	userName VARCHAR(75) null,
	createTime DATE null,
	modifiedTime DATE null,
	name VARCHAR(75) null,
	model VARCHAR(75) null,
	unit VARCHAR(75) null,
	unitPrice DOUBLE,
	quantity INTEGER
);

create table oa_VehicleRequisition (
	vehicleRequisitionId LONG not null primary key,
	userId LONG,
	userName VARCHAR(75) null,
	createTime DATE null,
	modifiedTime DATE null,
	applicantDeptId LONG,
	applicantDeptName VARCHAR(75) null,
	applicantId LONG,
	applicantName VARCHAR(75) null,
	startTime DATE null,
	endTime DATE null,
	passengerNum INTEGER,
	reason VARCHAR(1000) null,
	destination VARCHAR(200) null
);