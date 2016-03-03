package com.justonetech.biz.domain.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the AREA_SG_UNIT_PROJ table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 * TableComment : 区县单位工程列表
 * SyncTemplatepatterns : list\w*
 * SyncDao : false
 * TableName : 区县单位工程列表
 * SyncBoolean : get
 * SyncJsp : true
 * Treeable : false
 * SubSystem : area
 * Projectable : false
 *
 * @hibernate.class
 *  table="AREA_SG_UNIT_PROJ"
 */

public abstract class BaseAreaSgUnitProj  implements Serializable {

	public static String REF = "AreaSgUnitProj";
	public static String PROP_CREATE_USER = "createUser";
	public static String PROP_SG_PERMIT = "sgPermit";
	public static String PROP_NUM = "num";
	public static String PROP_CREATE_TIME = "createTime";
	public static String PROP_UPDATE_TIME = "updateTime";
	public static String PROP_ID = "id";
	public static String PROP_PROJECT_INDEX = "projectIndex";
	public static String PROP_UNIT_PROJ_CODE = "unitProjCode";
	public static String PROP_UNIT_PROJ_TYPE = "unitProjType";
	public static String PROP_UPDATE_USER = "updateUser";
	public static String PROP_UNIT_PROJ_NAME = "unitProjName";


	// constructors
	public BaseAreaSgUnitProj () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAreaSgUnitProj (java.lang.Long id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long id;

	// fields
    /*序号*/
    /*序号*/
	private java.lang.Integer num;
	
    /*单位工程编号*/
    /*单位工程编号*/
	private java.lang.String unitProjCode;
	
    /*单位工程名称*/
    /*单位工程名称*/
	private java.lang.String unitProjName;
	
    /*工程指标*/
    /*工程指标*/
	private java.lang.String projectIndex;
	
    /*创建时间*/
    /*创建时间*/
	private java.sql.Timestamp createTime;
	
    /*创建用户名*/
    /*创建用户名*/
	private java.lang.String createUser;
	
    /*更新时间*/
    /*更新时间*/
	private java.sql.Timestamp updateTime;
	
    /*更新用户名*/
    /*更新用户名*/
	private java.lang.String updateUser;
	

	// many to one
	private com.justonetech.biz.domain.AreaSgPermit sgPermit;
	private com.justonetech.system.domain.SysCodeDetail unitProjType;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="com.justonetech.core.orm.hibernate.LongIdGenerator"
     *  column="ID"
     */
	public java.lang.Long getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 * @deprecated
	 */
	public void setId (java.lang.Long id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: NUM
	 */
	public java.lang.Integer getNum () {
		return num;
	}

	/**
	 * Set the value related to the column: NUM
	 * @param num the NUM value
	 */
	public void setNum (java.lang.Integer num) {
		this.num = num;
	}


	/**
	 * Return the value associated with the column: UNIT_PROJ_CODE
	 */
	public java.lang.String getUnitProjCode () {
		return unitProjCode;
	}

	/**
	 * Set the value related to the column: UNIT_PROJ_CODE
	 * @param unitProjCode the UNIT_PROJ_CODE value
	 */
	public void setUnitProjCode (java.lang.String unitProjCode) {
		this.unitProjCode = unitProjCode;
	}


	/**
	 * Return the value associated with the column: UNIT_PROJ_NAME
	 */
	public java.lang.String getUnitProjName () {
		return unitProjName;
	}

	/**
	 * Set the value related to the column: UNIT_PROJ_NAME
	 * @param unitProjName the UNIT_PROJ_NAME value
	 */
	public void setUnitProjName (java.lang.String unitProjName) {
		this.unitProjName = unitProjName;
	}


	/**
	 * Return the value associated with the column: PROJECT_INDEX
	 */
	public java.lang.String getProjectIndex () {
		return projectIndex;
	}

	/**
	 * Set the value related to the column: PROJECT_INDEX
	 * @param projectIndex the PROJECT_INDEX value
	 */
	public void setProjectIndex (java.lang.String projectIndex) {
		this.projectIndex = projectIndex;
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
	 * Return the value associated with the column: CREATE_USER
	 */
	public java.lang.String getCreateUser () {
		return createUser;
	}

	/**
	 * Set the value related to the column: CREATE_USER
	 * @param createUser the CREATE_USER value
	 */
	public void setCreateUser (java.lang.String createUser) {
		this.createUser = createUser;
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
	 * Return the value associated with the column: UPDATE_USER
	 */
	public java.lang.String getUpdateUser () {
		return updateUser;
	}

	/**
	 * Set the value related to the column: UPDATE_USER
	 * @param updateUser the UPDATE_USER value
	 */
	public void setUpdateUser (java.lang.String updateUser) {
		this.updateUser = updateUser;
	}


	/**
	 * Return the value associated with the column: SG_PERMIT_ID
	 */
	public com.justonetech.biz.domain.AreaSgPermit getSgPermit () {
		return sgPermit;
	}

	/**
	 * Set the value related to the column: SG_PERMIT_ID
	 * @param sgPermit the SG_PERMIT_ID value
	 */
	public void setSgPermit (com.justonetech.biz.domain.AreaSgPermit sgPermit) {
		this.sgPermit = sgPermit;
	}


	/**
	 * Return the value associated with the column: UNIT_PROJ_TYPE_ID
	 */
	public com.justonetech.system.domain.SysCodeDetail getUnitProjType () {
		return unitProjType;
	}

	/**
	 * Set the value related to the column: UNIT_PROJ_TYPE_ID
	 * @param unitProjType the UNIT_PROJ_TYPE_ID value
	 */
	public void setUnitProjType (com.justonetech.system.domain.SysCodeDetail unitProjType) {
		this.unitProjType = unitProjType;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.justonetech.biz.domain.AreaSgUnitProj)) return false;
		else {
			com.justonetech.biz.domain.AreaSgUnitProj areaSgUnitProj = (com.justonetech.biz.domain.AreaSgUnitProj) obj;
			if (null == this.getId() || null == areaSgUnitProj.getId()) return false;
			else return (this.getId().equals(areaSgUnitProj.getId()));
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
		builder.append(num);
		builder.append(unitProjCode);
		builder.append(unitProjName);
		builder.append(projectIndex);
		builder.append(createTime);
		builder.append(createUser);
		builder.append(updateTime);
		builder.append(updateUser);
		return builder.toString();
	}


}