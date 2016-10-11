create table cp_ApplyMaterial (
	materialId LONG not null primary key,
	permitId LONG,
	xh VARCHAR(75) null,
	clmc VARCHAR(75) null,
	yjfs INTEGER,
	sjfs INTEGER,
	fileEntryIds VARCHAR(500) null,
	bzclIds VARCHAR(500) null,
	wjscbzclIds VARCHAR(500) null,
	shyq VARCHAR(1000) null,
	csyj VARCHAR(75) null,
	fhyj VARCHAR(75) null,
	shyj VARCHAR(75) null
);

create table cp_Complete (
	completeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	zzjgdm VARCHAR(75) null,
	bjbh VARCHAR(75) null,
	sqbz INTEGER,
	status INTEGER,
	babh VARCHAR(75) null,
	wssqbh VARCHAR(75) null,
	sbrq DATE null,
	shyj VARCHAR(1000) null,
	shr VARCHAR(75) null,
	shrq DATE null
);

create table cp_CompleteApplyMaterial (
	materialId LONG not null primary key,
	completeId LONG,
	xh VARCHAR(75) null,
	clmc VARCHAR(75) null,
	fileEntryIds VARCHAR(75) null
);

create table cp_CompleteProjectProfile (
	completeId LONG not null primary key,
	bjbh VARCHAR(75) null,
	xmlx LONG,
	jsgcsx LONG,
	gcmc VARCHAR(500) null,
	lxjb VARCHAR(75) null,
	jsdwmc VARCHAR(500) null,
	jsdwdz VARCHAR(500) null,
	jsdd VARCHAR(500) null,
	szqx VARCHAR(75) null,
	fddbr VARCHAR(75) null,
	lxr VARCHAR(75) null,
	lxdh VARCHAR(75) null,
	bz VARCHAR(1000) null
);

create table cp_CompleteUnitProject (
	projectId LONG not null primary key,
	completeId LONG,
	permitUnitProjectId LONG,
	bjbh VARCHAR(75) null,
	sgxkzbh VARCHAR(75) null,
	gcbh VARCHAR(75) null,
	gcmc VARCHAR(500) null,
	jsnr VARCHAR(1000) null
);

create table cp_Contract (
	contractId VARCHAR(75) not null primary key,
	zzjgdm VARCHAR(75) null,
	htlb VARCHAR(75) null,
	id_ VARCHAR(75) null,
	htid VARCHAR(75) null,
	htbh VARCHAR(75) null,
	zbhtbh VARCHAR(75) null,
	fbhtbh VARCHAR(75) null,
	lwfbhtbh VARCHAR(75) null,
	htlx VARCHAR(75) null,
	htzt VARCHAR(75) null,
	sfsl VARCHAR(75) null,
	zxbz VARCHAR(75) null,
	state_ VARCHAR(75) null,
	bssj DATE null,
	slsj DATE null,
	bjbh VARCHAR(75) null,
	szdq VARCHAR(75) null,
	xmmc VARCHAR(75) null,
	jsdw VARCHAR(75) null,
	jsdd VARCHAR(300) null,
	lxpw VARCHAR(300) null,
	pzwh VARCHAR(75) null,
	dwxz VARCHAR(75) null,
	zjlygc VARCHAR(75) null,
	ztz VARCHAR(75) null,
	zmj VARCHAR(75) null,
	xmfl VARCHAR(75) null,
	jsgm VARCHAR(300) null,
	bdh VARCHAR(75) null,
	fbfs VARCHAR(75) null,
	cbfs VARCHAR(75) null,
	zycbht VARCHAR(75) null,
	zygclb VARCHAR(75) null,
	htmc VARCHAR(75) null,
	fbdw VARCHAR(75) null,
	cbdw VARCHAR(300) null,
	sjdw VARCHAR(75) null,
	xmfzr VARCHAR(75) null,
	xmfzrzjlx VARCHAR(75) null,
	xmfzrzjh VARCHAR(75) null,
	sjfzr VARCHAR(75) null,
	sjfzrzjlx VARCHAR(75) null,
	sjfzrzjh VARCHAR(75) null,
	kcdw VARCHAR(75) null,
	kcfzr VARCHAR(75) null,
	kcfzrzjlx VARCHAR(75) null,
	kcfzrzjh VARCHAR(75) null,
	sgdw VARCHAR(75) null,
	sgfzr VARCHAR(75) null,
	sgfzrzjlx VARCHAR(75) null,
	sgfzrzjh VARCHAR(75) null,
	xmlb VARCHAR(75) null,
	gclb VARCHAR(75) null,
	gcgm VARCHAR(300) null,
	sjxmlb VARCHAR(75) null,
	sjgclb VARCHAR(75) null,
	sjgcgm VARCHAR(75) null,
	sgxmlb VARCHAR(75) null,
	sggclb VARCHAR(75) null,
	sggcgm VARCHAR(75) null,
	kgrq DATE null,
	jgrq DATE null,
	jsfs VARCHAR(75) null,
	htj VARCHAR(75) null,
	sjf VARCHAR(75) null,
	kcf VARCHAR(75) null,
	jazj VARCHAR(75) null,
	zlje VARCHAR(75) null,
	zgj VARCHAR(75) null,
	wmcsf VARCHAR(75) null,
	htqdrq DATE null,
	htqzrq VARCHAR(300) null,
	cbnr VARCHAR(300) null,
	htsfwbmc VARCHAR(75) null,
	bz VARCHAR(300) null,
	sfzx VARCHAR(75) null,
	zxsj DATE null,
	zxsm VARCHAR(75) null
);

create table cp_ParticipationUnit (
	unitId LONG not null primary key,
	permitId LONG,
	dwlx VARCHAR(75) null,
	dwmc VARCHAR(75) null,
	xmfzr VARCHAR(75) null,
	dhhm VARCHAR(75) null,
	zjlx VARCHAR(75) null,
	zjh VARCHAR(75) null,
	sfyssj BOOLEAN
);

create table cp_Permit (
	permitId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	zzjgdm VARCHAR(75) null,
	bjbh VARCHAR(75) null,
	htxxbsbh VARCHAR(75) null,
	sqbz INTEGER,
	status INTEGER,
	bdh VARCHAR(75) null,
	ywbh VARCHAR(75) null,
	sgxkzbh VARCHAR(75) null,
	slbh VARCHAR(75) null,
	hjgsz INTEGER,
	hjgsh INTEGER,
	sqr VARCHAR(75) null,
	sqsx VARCHAR(75) null,
	sqh VARCHAR(75) null,
	cltjr VARCHAR(75) null,
	cltjrlxdh VARCHAR(75) null,
	cltjrlxdz VARCHAR(75) null,
	sjr VARCHAR(75) null,
	sjrlxdh VARCHAR(75) null,
	slyj VARCHAR(75) null,
	slsj VARCHAR(75) null,
	sgxkzFileEntryId LONG,
	title VARCHAR(200) null,
	content VARCHAR(1000) null,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);

create table cp_Project (
	bjbh VARCHAR(75) not null primary key,
	bjrq DATE null,
	jsdw VARCHAR(100) null,
	jsdwxz VARCHAR(75) null,
	jsdwdz VARCHAR(200) null,
	jsdwdh VARCHAR(75) null,
	jsdwfr VARCHAR(75) null,
	jsdwlxr VARCHAR(75) null,
	jsdwyb VARCHAR(75) null,
	jsdwzczj VARCHAR(75) null,
	xmmc VARCHAR(200) null,
	jsdd VARCHAR(200) null,
	lxwj VARCHAR(200) null,
	lxwh VARCHAR(200) null,
	lxjb VARCHAR(75) null,
	pzjg VARCHAR(100) null,
	pzrq VARCHAR(75) null,
	ztz VARCHAR(75) null,
	sbtz VARCHAR(75) null,
	jsxz VARCHAR(75) null,
	jsgm VARCHAR(200) null,
	zmj VARCHAR(75) null,
	kgrq VARCHAR(75) null,
	xmxz VARCHAR(75) null,
	cjqk VARCHAR(200) null,
	smqk VARCHAR(600) null,
	bjbz VARCHAR(600) null,
	fbzgsc VARCHAR(75) null,
	cardid VARCHAR(75) null,
	zjlygc_1 VARCHAR(75) null,
	zjlygc_2 VARCHAR(75) null,
	zjlygc_3 VARCHAR(75) null,
	zjlygc_4 VARCHAR(75) null,
	zjlygc_5 VARCHAR(75) null,
	zjlygc_6 VARCHAR(75) null,
	zjlygc_7 VARCHAR(75) null,
	zjlygc_8 VARCHAR(75) null,
	zjlygc_9 VARCHAR(75) null,
	jgxs VARCHAR(75) null,
	xmfl VARCHAR(75) null,
	jzmq VARCHAR(75) null,
	ywdt VARCHAR(75) null,
	dxsck VARCHAR(75) null,
	bhjz VARCHAR(75) null,
	fjms VARCHAR(75) null,
	sfsbxm VARCHAR(75) null,
	hzyj VARCHAR(75) null,
	bj_sx VARCHAR(75) null,
	bj_webid VARCHAR(75) null,
	bjwcbj VARCHAR(75) null,
	bmdm VARCHAR(75) null,
	jbr VARCHAR(75) null,
	shr VARCHAR(75) null,
	shbmdm VARCHAR(75) null,
	wcbjsj VARCHAR(75) null,
	old_bjbh VARCHAR(75) null,
	sffb VARCHAR(75) null,
	timeflag VARCHAR(75) null,
	jbrdm VARCHAR(75) null,
	shrdm VARCHAR(75) null,
	jsbh VARCHAR(75) null,
	needSbjl VARCHAR(75) null,
	wcSbjl VARCHAR(75) null,
	sfgyzbkg VARCHAR(75) null,
	jyzxfbxx VARCHAR(75) null,
	sgGkzbfb VARCHAR(75) null,
	sgjlGkzbfb VARCHAR(75) null,
	fxglxm VARCHAR(75) null,
	fxglxmJbr VARCHAR(75) null,
	fxglxmJbrdm VARCHAR(75) null,
	fxglxmJbrq VARCHAR(75) null,
	jsdwjgdm VARCHAR(75) null,
	szqy VARCHAR(75) null,
	ywxjfwjz VARCHAR(75) null,
	ywgbfwjg VARCHAR(75) null,
	gczh VARCHAR(100) null,
	zdcyyn VARCHAR(75) null,
	lxfl VARCHAR(75) null,
	ms1 VARCHAR(75) null,
	ms2 VARCHAR(75) null,
	ms3 VARCHAR(75) null,
	zdxmyn VARCHAR(75) null,
	dxjzsq VARCHAR(75) null,
	ywjzxzz VARCHAR(75) null,
	fgwjhm VARCHAR(75) null,
	zzbl VARCHAR(75) null,
	ChangeTime VARCHAR(75) null,
	PD_SW VARCHAR(75) null,
	bmpfrq VARCHAR(75) null,
	bmpfwh VARCHAR(200) null,
	bmpfwj VARCHAR(200) null,
	CertificateKey VARCHAR(75) null,
	dsjzmj VARCHAR(75) null,
	dxjzmj VARCHAR(75) null,
	gdzctzbh VARCHAR(75) null,
	jsxz_2011 VARCHAR(75) null,
	lhmj VARCHAR(75) null,
	lxjb_2011 VARCHAR(75) null,
	mfmj VARCHAR(75) null,
	other_qx VARCHAR(100) null,
	ProjectSlyj VARCHAR(200) null,
	qxbz VARCHAR(75) null,
	sfcysjkfq VARCHAR(75) null,
	sfmfss VARCHAR(75) null,
	szqx VARCHAR(75) null,
	tsgs VARCHAR(75) null,
	xmfl_2011 VARCHAR(75) null,
	xsjpw VARCHAR(75) null,
	xsjpzdw VARCHAR(75) null,
	zjlygc_10 VARCHAR(75) null,
	zjlygc_11 VARCHAR(75) null,
	zjlygc_xs_1 VARCHAR(75) null,
	zjlygc_xs_2 VARCHAR(75) null,
	zjlygc_xs_3 VARCHAR(75) null,
	zjlygc_xs_4 VARCHAR(75) null,
	zjlygc_1_2 VARCHAR(75) null,
	zjlygc_1_2_4 VARCHAR(75) null,
	ywptlh VARCHAR(75) null,
	gyyqbh VARCHAR(75) null,
	sfcyxm VARCHAR(75) null,
	zbxmfzrxm VARCHAR(75) null,
	zbxmfzrzjh VARCHAR(75) null,
	zbxmfzrzjlx VARCHAR(75) null,
	zbxmfzrqrsj VARCHAR(75) null,
	sflsjzbs VARCHAR(75) null,
	sjbs VARCHAR(75) null,
	yxbs VARCHAR(75) null,
	sfyjngz VARCHAR(75) null,
	sfsszpjz VARCHAR(75) null,
	zczxjgdmz VARCHAR(75) null,
	ischeckxmbm VARCHAR(75) null,
	zddtmj VARCHAR(75) null,
	sjjdYn VARCHAR(75) null,
	sgjdYn VARCHAR(75) null,
	yxjdYn VARCHAR(75) null,
	tdhtqdbh VARCHAR(75) null,
	tdhtqdrq VARCHAR(75) null,
	dkbh VARCHAR(75) null,
	zpsjzlsbl VARCHAR(75) null,
	zpsjzmj VARCHAR(75) null,
	dwyzzpl VARCHAR(75) null,
	zdh VARCHAR(75) null,
	sfgdcg VARCHAR(75) null,
	ptlhmj VARCHAR(75) null,
	bimjszxfy VARCHAR(75) null,
	bz VARCHAR(2000) null,
	sfzcxm VARCHAR(75) null,
	zcxmbm VARCHAR(75) null,
	sfzmqxm VARCHAR(75) null,
	printPDFTime VARCHAR(75) null,
	isBgPrint VARCHAR(75) null
);

create table cp_ProjectProfile (
	permitId LONG not null primary key,
	bjbh VARCHAR(75) null,
	jsdwmc VARCHAR(300) null,
	jsdwxz VARCHAR(75) null,
	jsdwdz VARCHAR(300) null,
	gcmc VARCHAR(300) null,
	jsdd VARCHAR(300) null,
	jsgcgm VARCHAR(500) null,
	fwjzmj VARCHAR(75) null,
	htjg VARCHAR(75) null,
	htgq INTEGER,
	fddbr VARCHAR(75) null,
	jsdwlxdh VARCHAR(75) null,
	jsdwlxr VARCHAR(75) null,
	jsdwsjh VARCHAR(75) null,
	jsgcghxkzbh VARCHAR(75) null,
	xckgqk VARCHAR(75) null,
	xmlx LONG,
	lxjb VARCHAR(75) null,
	xmxz LONG,
	ssqx VARCHAR(75) null,
	ywbm VARCHAR(75) null,
	jsddssqx LONG,
	jsgclb VARCHAR(75) null,
	jsgcsx LONG,
	gyzjbz VARCHAR(75) null,
	zbjg VARCHAR(75) null,
	xmtzgs VARCHAR(75) null,
	jhkg DATE null,
	jhjg DATE null,
	sfzftzl BOOLEAN,
	yzzpl1 VARCHAR(75) null,
	yzzpl2 VARCHAR(75) null,
	yzzpl3 VARCHAR(75) null,
	yzzpl4 VARCHAR(75) null,
	tjsj DATE null,
	gcnr VARCHAR(100) null,
	sgxkzsbz VARCHAR(75) null,
	tzly VARCHAR(75) null,
	gkpzhhzjghwh VARCHAR(75) null,
	pfhhzrq DATE null,
	cbsjpzjghwh VARCHAR(75) null,
	pfrq DATE null,
	pfgq INTEGER,
	pzjghwh VARCHAR(75) null,
	xmdw VARCHAR(75) null,
	xmfzr VARCHAR(75) null,
	xmfzrlxdh VARCHAR(75) null,
	zysjdw VARCHAR(300) null,
	sj_zbfs VARCHAR(75) null,
	sj_zbj VARCHAR(75) null,
	sj_zzdj VARCHAR(75) null,
	sj_zzdjzsbh VARCHAR(75) null,
	sj_xmfzr VARCHAR(75) null,
	sj_xmfzrzsbh VARCHAR(75) null,
	zyjldw VARCHAR(300) null,
	jl_zbfs VARCHAR(75) null,
	jl_zbj VARCHAR(75) null,
	jl_zzdj VARCHAR(75) null,
	jl_zzdjzsbh VARCHAR(75) null,
	jl_zj VARCHAR(75) null,
	jl_zjzsbh VARCHAR(75) null,
	zysgdw VARCHAR(300) null,
	sg_zbfs VARCHAR(75) null,
	sg_zbj VARCHAR(75) null,
	sg_zzdj VARCHAR(75) null,
	sg_zzdjzsbh VARCHAR(75) null,
	sg_xmjl VARCHAR(75) null,
	sg_xmjlzsbh VARCHAR(75) null,
	jszjjhlsqk VARCHAR(200) null,
	dcqwcqk VARCHAR(200) null,
	sgzbqk VARCHAR(200) null,
	sytdxgwj VARCHAR(200) null,
	gczljddjqk VARCHAR(200) null
);

create table cp_UnitProject (
	projectId LONG not null primary key,
	permitId LONG,
	bjbh VARCHAR(75) null,
	gcbh VARCHAR(75) null,
	gcmc VARCHAR(75) null,
	jsnr VARCHAR(75) null
);