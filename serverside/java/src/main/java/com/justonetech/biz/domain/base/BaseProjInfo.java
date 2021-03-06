package com.justonetech.biz.domain.base;

import com.justonetech.core.entity.Auditable;
import com.justonetech.system.domain.SysCodeDetail;

import java.io.Serializable;
import java.sql.Date;


/**
 * This is an object that contains data related to the PROJ_INFO table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 * TableComment : 项目基本信息管理
 * SyncTemplatepatterns : list\w*
 * SyncDao : false
 * TableName : 项目基本信息管理
 * SyncBoolean : get
 * SyncJsp : true
 * Treeable : false
 * SubSystem : project
 * Projectable : false
 *
 * @hibernate.class
 *  table="PROJ_INFO"
 */

public abstract class BaseProjInfo  implements Serializable,Auditable {

	public static String REF = "ProjInfo";
	public static String PROP_JS_DEPT_PERSON = "jsDeptPerson";
	public static String PROP_PROPERTY = "property";
	public static String PROP_MAIN_CONTENT = "mainContent";
	public static String PROP_JS_DEPT = "jsDept";
	public static String PROP_YEAR = "year";
	public static String PROP_JL_DEPT_TEL = "jlDeptTel";
	public static String PROP_CREATE_USER = "createUser";
	public static String PROP_JL_DEPT = "jlDept";
	public static String PROP_START_DATE = "startDate";
	public static String PROP_JL_DEPT_PERSON = "jlDeptPerson";
	public static String PROP_ENGINEER_RANGE = "engineerRange";
	public static String PROP_MANAGER_ATTR = "managerAttr";
	public static String PROP_IS_MAJOR = "isMajor";
	public static String PROP_SG_DEPT_TEL = "sgDeptTel";
	public static String PROP_UPDATE_USER = "updateUser";
	public static String PROP_SG_DEPT_PERSON = "sgDeptPerson";
	public static String PROP_SG_DEPT = "sgDept";
	public static String PROP_FUNCTION = "function";
	public static String PROP_LOCATION = "location";
	public static String PROP_UPDATE_TIME = "updateTime";
	public static String PROP_NO = "no";
	public static String PROP_PROJ_NUM = "projNum";
	public static String PROP_PACKAGE_ATTR = "packageAttr";
	public static String PROP_NAME = "name";
	public static String PROP_CATEGORY = "category";
	public static String PROP_AREA_CODE = "areaCode";
	public static String PROP_PROJECT_SOURCE = "projectSource";
	public static String PROP_CREATE_TIME = "createTime";
	public static String PROP_BUILD_MILEAGE = "buildMileage";
	public static String PROP_JS_DEPT_TEL = "jsDeptTel";
	public static String PROP_ID = "id";
	public static String PROP_INTRO = "intro";
	public static String PROP_STAGE = "stage";
	public static String PROP_BJBH = "bjbh";


	// constructors
	public BaseProjInfo () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseProjInfo (Long id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Long id;

	// fields
    /*报建编号*/
    /*报建编号*/
	private String bjbh;

    // fields
    /*项目名称*/
    /*项目名称*/
	private String name;

    /*年份*/
    /*年份*/
	private Integer year;

    /*项目序号*/
    /*项目序号*/
	private Integer no;

    /*建设里程*/
    /*建设里程*/
	private String buildMileage;

    /*起讫地点*/
    /*起讫地点*/
	private String location;

    /*开工日期*/
    /*开工日期*/
	private java.sql.Date startDate;

	/*完工日期*/
    /*完工日期*/
	private java.sql.Date endDate;

    /*工程简介*/
    /*工程简介*/
	private String intro;

    /*创建时间*/
    /*创建时间*/
	private java.sql.Timestamp createTime;

    /*更新时间*/
    /*更新时间*/
	private java.sql.Timestamp updateTime;

    /*创建人*/
    /*创建人(记录帐号）*/
	private String createUser;

    /*更新人*/
    /*更新人(记录帐号）*/
	private String updateUser;

    /*功能作用*/
    /*功能作用*/
	private String function;

    /*工程范围*/
    /*工程范围*/
	private String engineerRange;

    /*主要内容*/
    /*主要内容*/
	private String mainContent;

    /*是否重大*/
    /*是否重大*/
	private Boolean isMajor;

    /*所属区县*/
    /*所属区县*/
	private String areaCode;

    /*打包属性*/
    /*打包属性*/
	private String packageAttr;

	/*项目号*/
    /*项目号*/
	private String projNum;

	private Double ghhx;//规划红线（宽度m）

	/*开工节点*/
    /*开工节点*/
	private java.sql.Date kgjd;

	/*完工节点*/
    /*完工节点*/
	private java.sql.Date wgjd;

	/*计划开工日期*/
    /*计划开工日期*/
	private java.sql.Date planStartDate;

	/*计划完工日期*/
    /*计划完工日期*/
	private java.sql.Date planEndDate;

	private Double planTotalInvest;//计划总投资
	private Double gkpfTotalInvest;//工可批复总投资
	private Double gkpfPreInvest;//工可批复前期费用
	private Double gkpfJaInvest;//工可批复建安费用
	private Double csTotalInvest;//初设批复总投资
	private Double csPreInvest;//初设批复前期费用
	private Double csJaInvest;//初设批复建安费用

	private String projContent;//项目相关信息


	// many to one
	private com.justonetech.system.domain.SysCodeDetail property;
	private com.justonetech.system.domain.SysCodeDetail stage;
	private com.justonetech.system.domain.SysCodeDetail category;
	private com.justonetech.system.domain.SysCodeDetail managerAttr;
	private com.justonetech.system.domain.SysCodeDetail projectSource;
	private com.justonetech.system.domain.SysCodeDetail roadGrade;
	private com.justonetech.system.domain.SysCodeDetail roadTecGrade;
	private com.justonetech.system.domain.SysCodeDetail projProperty;

	// collections
	private java.util.Set<com.justonetech.biz.domain.ProjBid> projBids;
	private java.util.Set<com.justonetech.biz.domain.ProjRelatePerson> projRelatePersons;
	private java.util.Set<com.justonetech.biz.domain.ProjRelateDept> projRelateDepts;
	private java.util.Set<com.justonetech.biz.domain.DataNodeReport> dataNodeReports;
	private java.util.Set<com.justonetech.biz.domain.DataStageReport> dataStageReports;
	private java.util.Set<com.justonetech.biz.domain.DataStageReportDoc> dataStageReportDocs;
	private java.util.Set<com.justonetech.biz.domain.ProjInfoArea> projInfoAreas;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="com.justonetech.core.orm.hibernate.LongIdGenerator"
     *  column="ID"
     */
	public Long getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 * @deprecated
	 */
	public void setId (Long id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}

    public String getBjbh() {
        return bjbh;
    }

    public void setBjbh(String bjbh) {
        this.bjbh = bjbh;
    }

    /**
	 * Return the value associated with the column: NAME
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: NAME
	 * @param name the NAME value
	 */
	public void setName (String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: YEAR
	 */
	public Integer getYear () {
		return year;
	}

	/**
	 * Set the value related to the column: YEAR
	 * @param year the YEAR value
	 */
	public void setYear (Integer year) {
		this.year = year;
	}


	/**
	 * Return the value associated with the column: NO
	 */
	public Integer getNo () {
		return no;
	}

	/**
	 * Set the value related to the column: NO
	 * @param no the NO value
	 */
	public void setNo (Integer no) {
		this.no = no;
	}


	/**
	 * Return the value associated with the column: BUILD_MILEAGE
	 */
	public String getBuildMileage () {
		return buildMileage;
	}

	/**
	 * Set the value related to the column: BUILD_MILEAGE
	 * @param buildMileage the BUILD_MILEAGE value
	 */
	public void setBuildMileage (String buildMileage) {
		this.buildMileage = buildMileage;
	}


	/**
	 * Return the value associated with the column: LOCATION
	 */
	public String getLocation () {
		return location;
	}

	/**
	 * Set the value related to the column: LOCATION
	 * @param location the LOCATION value
	 */
	public void setLocation (String location) {
		this.location = location;
	}


	/**
	 * Return the value associated with the column: START_DATE
	 */
	public java.sql.Date getStartDate () {
		return startDate;
	}

	/**
	 * Set the value related to the column: START_DATE
	 * @param startDate the START_DATE value
	 */
	public void setStartDate (java.sql.Date startDate) {
		this.startDate = startDate;
	}


	/**
	 * Return the value associated with the column: INTRO
	 */
	public String getIntro () {
		return intro;
	}

	/**
	 * Set the value related to the column: INTRO
	 * @param intro the INTRO value
	 */
	public void setIntro (String intro) {
		this.intro = intro;
	}

	/**
	 * Return the value associated with the column: CREATE_TIME
	 */
	public java.sql.Timestamp getCreateTime () {
		return createTime;
	}

	/**
	 * Set the value related to the column: CREATE_TIME
	 * @param createTime the CREATE_TIME value
	 */
	public void setCreateTime (java.sql.Timestamp createTime) {
		this.createTime = createTime;
	}


	/**
	 * Return the value associated with the column: UPDATE_TIME
	 */
	public java.sql.Timestamp getUpdateTime () {
		return updateTime;
	}

	/**
	 * Set the value related to the column: UPDATE_TIME
	 * @param updateTime the UPDATE_TIME value
	 */
	public void setUpdateTime (java.sql.Timestamp updateTime) {
		this.updateTime = updateTime;
	}


	/**
	 * Return the value associated with the column: CREATE_USER
	 */
	public String getCreateUser () {
		return createUser;
	}

	/**
	 * Set the value related to the column: CREATE_USER
	 * @param createUser the CREATE_USER value
	 */
	public void setCreateUser (String createUser) {
		this.createUser = createUser;
	}


	/**
	 * Return the value associated with the column: UPDATE_USER
	 */
	public String getUpdateUser () {
		return updateUser;
	}

	/**
	 * Set the value related to the column: UPDATE_USER
	 * @param updateUser the UPDATE_USER value
	 */
	public void setUpdateUser (String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * Return the value associated with the column: FUNCTION
	 */
	public String getFunction () {
		return function;
	}

	/**
	 * Set the value related to the column: FUNCTION
	 * @param function the FUNCTION value
	 */
	public void setFunction (String function) {
		this.function = function;
	}


	/**
	 * Return the value associated with the column: ENGINEER_RANGE
	 */
	public String getEngineerRange () {
		return engineerRange;
	}

	/**
	 * Set the value related to the column: ENGINEER_RANGE
	 * @param engineerRange the ENGINEER_RANGE value
	 */
	public void setEngineerRange (String engineerRange) {
		this.engineerRange = engineerRange;
	}


	/**
	 * Return the value associated with the column: MAIN_CONTENT
	 */
	public String getMainContent () {
		return mainContent;
	}

	/**
	 * Set the value related to the column: MAIN_CONTENT
	 * @param mainContent the MAIN_CONTENT value
	 */
	public void setMainContent (String mainContent) {
		this.mainContent = mainContent;
	}


	/**
	 * Return the value associated with the column: IS_MAJOR
	 */
	public Boolean getIsMajor () {
		return isMajor;
	}

	/**
	 * Set the value related to the column: IS_MAJOR
	 * @param isMajor the IS_MAJOR value
	 */
	public void setIsMajor (Boolean isMajor) {
		this.isMajor = isMajor;
	}


	/**
	 * Return the value associated with the column: AREA_CODE
	 */
	public String getAreaCode () {
		return areaCode;
	}

	/**
	 * Set the value related to the column: AREA_CODE
	 * @param areaCode the AREA_CODE value
	 */
	public void setAreaCode (String areaCode) {
		this.areaCode = areaCode;
	}


	/**
	 * Return the value associated with the column: PACKAGE_ATTR
	 */
	public String getPackageAttr () {
		return packageAttr;
	}

	/**
	 * Set the value related to the column: PACKAGE_ATTR
	 * @param packageAttr the PACKAGE_ATTR value
	 */
	public void setPackageAttr (String packageAttr) {
		this.packageAttr = packageAttr;
	}

    public String getProjNum() {
        return projNum;
    }

    public void setProjNum(String projNum) {
        this.projNum = projNum;
    }

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Double getGhhx() {
		return ghhx;
	}

	public void setGhhx(Double ghhx) {
		this.ghhx = ghhx;
	}

	public Date getKgjd() {
		return kgjd;
	}

	public void setKgjd(Date kgjd) {
		this.kgjd = kgjd;
	}

	public Date getWgjd() {
		return wgjd;
	}

	public void setWgjd(Date wgjd) {
		this.wgjd = wgjd;
	}

	public Date getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(Date planStartDate) {
		this.planStartDate = planStartDate;
	}

	public Date getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(Date planEndDate) {
		this.planEndDate = planEndDate;
	}

	public Double getPlanTotalInvest() {
		return planTotalInvest;
	}

	public void setPlanTotalInvest(Double planTotalInvest) {
		this.planTotalInvest = planTotalInvest;
	}

	public Double getGkpfTotalInvest() {
		return gkpfTotalInvest;
	}

	public void setGkpfTotalInvest(Double gkpfTotalInvest) {
		this.gkpfTotalInvest = gkpfTotalInvest;
	}

	public Double getGkpfPreInvest() {
		return gkpfPreInvest;
	}

	public void setGkpfPreInvest(Double gkpfPreInvest) {
		this.gkpfPreInvest = gkpfPreInvest;
	}

	public Double getGkpfJaInvest() {
		return gkpfJaInvest;
	}

	public void setGkpfJaInvest(Double gkpfJaInvest) {
		this.gkpfJaInvest = gkpfJaInvest;
	}

	public Double getCsTotalInvest() {
		return csTotalInvest;
	}

	public void setCsTotalInvest(Double csTotalInvest) {
		this.csTotalInvest = csTotalInvest;
	}

	public Double getCsPreInvest() {
		return csPreInvest;
	}

	public void setCsPreInvest(Double csPreInvest) {
		this.csPreInvest = csPreInvest;
	}

	public Double getCsJaInvest() {
		return csJaInvest;
	}

	public void setCsJaInvest(Double csJaInvest) {
		this.csJaInvest = csJaInvest;
	}

	public String getProjContent() {
		return projContent;
	}

	public void setProjContent(String projContent) {
		this.projContent = projContent;
	}

	public SysCodeDetail getRoadGrade() {
		return roadGrade;
	}

	public void setRoadGrade(SysCodeDetail roadGrade) {
		this.roadGrade = roadGrade;
	}

	public SysCodeDetail getRoadTecGrade() {
		return roadTecGrade;
	}

	public void setRoadTecGrade(SysCodeDetail roadTecGrade) {
		this.roadTecGrade = roadTecGrade;
	}

	public SysCodeDetail getProjProperty() {
		return projProperty;
	}

	public void setProjProperty(SysCodeDetail projProperty) {
		this.projProperty = projProperty;
	}

	/**
	 * Return the value associated with the column: PROPERTY_ID
	 */
	public com.justonetech.system.domain.SysCodeDetail getProperty () {
		return property;
	}

	/**
	 * Set the value related to the column: PROPERTY_ID
	 * @param property the PROPERTY_ID value
	 */
	public void setProperty (com.justonetech.system.domain.SysCodeDetail property) {
		this.property = property;
	}


	/**
	 * Return the value associated with the column: STAGE_ID
	 */
	public com.justonetech.system.domain.SysCodeDetail getStage () {
		return stage;
	}

	/**
	 * Set the value related to the column: STAGE_ID
	 * @param stage the STAGE_ID value
	 */
	public void setStage (com.justonetech.system.domain.SysCodeDetail stage) {
		this.stage = stage;
	}


	/**
	 * Return the value associated with the column: CATEGORY_ID
	 */
	public com.justonetech.system.domain.SysCodeDetail getCategory () {
		return category;
	}

	/**
	 * Set the value related to the column: CATEGORY_ID
	 * @param category the CATEGORY_ID value
	 */
	public void setCategory (com.justonetech.system.domain.SysCodeDetail category) {
		this.category = category;
	}


	/**
	 * Return the value associated with the column: MANAGER_ATTR_ID
	 */
	public com.justonetech.system.domain.SysCodeDetail getManagerAttr () {
		return managerAttr;
	}

	/**
	 * Set the value related to the column: MANAGER_ATTR_ID
	 * @param managerAttr the MANAGER_ATTR_ID value
	 */
	public void setManagerAttr (com.justonetech.system.domain.SysCodeDetail managerAttr) {
		this.managerAttr = managerAttr;
	}


	/**
	 * Return the value associated with the column: PROJECT_SOURCE_ID
	 */
	public com.justonetech.system.domain.SysCodeDetail getProjectSource () {
		return projectSource;
	}

	/**
	 * Set the value related to the column: PROJECT_SOURCE_ID
	 * @param projectSource the PROJECT_SOURCE_ID value
	 */
	public void setProjectSource (com.justonetech.system.domain.SysCodeDetail projectSource) {
		this.projectSource = projectSource;
	}


	/**
	 * Return the value associated with the column: projBids
	 */
	public java.util.Set<com.justonetech.biz.domain.ProjBid> getProjBids () {
		return projBids;
	}

	/**
	 * Set the value related to the column: projBids
	 * @param projBids the projBids value
	 */
	public void setProjBids (java.util.Set<com.justonetech.biz.domain.ProjBid> projBids) {
		this.projBids = projBids;
	}


	/**
	 * Return the value associated with the column: projRelatePersons
	 */
	public java.util.Set<com.justonetech.biz.domain.ProjRelatePerson> getProjRelatePersons () {
		return projRelatePersons;
	}

	/**
	 * Set the value related to the column: projRelatePersons
	 * @param projRelatePersons the projRelatePersons value
	 */
	public void setProjRelatePersons (java.util.Set<com.justonetech.biz.domain.ProjRelatePerson> projRelatePersons) {
		this.projRelatePersons = projRelatePersons;
	}


	/**
	 * Return the value associated with the column: projRelateDepts
	 */
	public java.util.Set<com.justonetech.biz.domain.ProjRelateDept> getProjRelateDepts () {
		return projRelateDepts;
	}

	/**
	 * Set the value related to the column: projRelateDepts
	 * @param projRelateDepts the projRelateDepts value
	 */
	public void setProjRelateDepts (java.util.Set<com.justonetech.biz.domain.ProjRelateDept> projRelateDepts) {
		this.projRelateDepts = projRelateDepts;
	}


	/**
	 * Return the value associated with the column: dataNodeReports
	 */
	public java.util.Set<com.justonetech.biz.domain.DataNodeReport> getDataNodeReports () {
		return dataNodeReports;
	}

	/**
	 * Set the value related to the column: dataNodeReports
	 * @param dataNodeReports the dataNodeReports value
	 */
	public void setDataNodeReports (java.util.Set<com.justonetech.biz.domain.DataNodeReport> dataNodeReports) {
		this.dataNodeReports = dataNodeReports;
	}


	/**
	 * Return the value associated with the column: dataStageReports
	 */
	public java.util.Set<com.justonetech.biz.domain.DataStageReport> getDataStageReports () {
		return dataStageReports;
	}

	/**
	 * Set the value related to the column: dataStageReports
	 * @param dataStageReports the dataStageReports value
	 */
	public void setDataStageReports (java.util.Set<com.justonetech.biz.domain.DataStageReport> dataStageReports) {
		this.dataStageReports = dataStageReports;
	}


	/**
	 * Return the value associated with the column: dataStageReportDocs
	 */
	public java.util.Set<com.justonetech.biz.domain.DataStageReportDoc> getDataStageReportDocs () {
		return dataStageReportDocs;
	}

	/**
	 * Set the value related to the column: dataStageReportDocs
	 * @param dataStageReportDocs the dataStageReportDocs value
	 */
	public void setDataStageReportDocs (java.util.Set<com.justonetech.biz.domain.DataStageReportDoc> dataStageReportDocs) {
		this.dataStageReportDocs = dataStageReportDocs;
	}


	/**
	 * Return the value associated with the column: projInfoAreas
	 */
	public java.util.Set<com.justonetech.biz.domain.ProjInfoArea> getProjInfoAreas () {
		return projInfoAreas;
	}

	/**
	 * Set the value related to the column: projInfoAreas
	 * @param projInfoAreas the projInfoAreas value
	 */
	public void setProjInfoAreas (java.util.Set<com.justonetech.biz.domain.ProjInfoArea> projInfoAreas) {
		this.projInfoAreas = projInfoAreas;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.justonetech.biz.domain.ProjInfo)) return false;
		else {
			com.justonetech.biz.domain.ProjInfo projInfo = (com.justonetech.biz.domain.ProjInfo) obj;
			if (null == this.getId() || null == projInfo.getId()) return false;
			else return (this.getId().equals(projInfo.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		org.apache.commons.lang.builder.ToStringBuilder builder = new org.apache.commons.lang.builder.ToStringBuilder(this);
		builder.append(id);
		builder.append(bjbh);
		builder.append(name);
		builder.append(year);
		builder.append(no);
		builder.append(buildMileage);
		builder.append(location);
		builder.append(startDate);
		builder.append(intro);
		builder.append(createTime);
		builder.append(updateTime);
		builder.append(createUser);
		builder.append(updateUser);
		builder.append(function);
		builder.append(engineerRange);
		builder.append(mainContent);
		builder.append(isMajor);
		builder.append(areaCode);
		builder.append(packageAttr);
		builder.append(projNum);
		return builder.toString();
	}


}
