package com.justonetech.system.domain.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the SYS_DEPT_USER table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 * TableComment : 单位用户
 * SyncTemplatepatterns : list\w*
 * SyncDao : false
 * TableName : 单位用户
 * SyncBoolean : get
 * SyncJsp : true
 * Treeable : false
 * SubSystem : sys
 * Projectable : false
 *
 * @hibernate.class
 *  table="SYS_DEPT_USER"
 */

public abstract class BaseSysDeptUser  implements Serializable{

	public static String REF = "SysDeptUser";
	public static String PROP_DEPT = "dept";
	public static String PROP_USER = "user";
	public static String PROP_ID = "id";


	// constructors
	public BaseSysDeptUser () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseSysDeptUser (Long id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseSysDeptUser (
		Long id,
		com.justonetech.system.domain.SysDept dept,
		com.justonetech.system.domain.SysUser user) {

		this.setId(id);
		this.setDept(dept);
		this.setUser(user);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Long id;

	// many to one
	private com.justonetech.system.domain.SysDept dept;
	private com.justonetech.system.domain.SysUser user;



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




	/**
	 * Return the value associated with the column: DEPT_ID
	 */
	public com.justonetech.system.domain.SysDept getDept () {
		return dept;
	}

	/**
	 * Set the value related to the column: DEPT_ID
	 * @param dept the DEPT_ID value
	 */
	public void setDept (com.justonetech.system.domain.SysDept dept) {
		this.dept = dept;
	}


	/**
	 * Return the value associated with the column: USER_ID
	 */
	public com.justonetech.system.domain.SysUser getUser () {
		return user;
	}

	/**
	 * Set the value related to the column: USER_ID
	 * @param user the USER_ID value
	 */
	public void setUser (com.justonetech.system.domain.SysUser user) {
		this.user = user;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.justonetech.system.domain.SysDeptUser)) return false;
		else {
			com.justonetech.system.domain.SysDeptUser sysDeptUser = (com.justonetech.system.domain.SysDeptUser) obj;
			if (null == this.getId() || null == sysDeptUser.getId()) return false;
			else return (this.getId().equals(sysDeptUser.getId()));
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
		return builder.toString();
	}


}