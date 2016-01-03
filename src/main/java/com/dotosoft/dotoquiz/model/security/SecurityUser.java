package com.dotosoft.dotoquiz.model.security;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sec_user", catalog="dotoquiz")
public class SecurityUser implements java.io.Serializable {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	protected String id;
	
	@Column(name="is_login", length=1)
	protected String isLogin;
	
	@Column(name="status", length=100)
	protected String status;
	
	@Column(name="is_delete", length=1)
	protected String isDelete;
	
	@Column(name="created_dt", length=19)
	protected Date createdDt;
	
	@Column(name="updated_dt", length=19)
	protected Date updatedDt;
	
	@OneToOne
	@JoinColumn(name = "id", insertable=false, updatable=false)
	private SecurityData securityData;
	
	@OneToOne
	@JoinColumn(name = "id", insertable=false, updatable=false)
	private SecurityUserPass securityUserPass;

	public SecurityUser() {
	}

	public SecurityUser(String id) {
		this.id = id;
	}

	public SecurityUser(String id, String isLogin, String status, String isDelete,
			Date createdDt, Date updatedDt, SecurityData secData, 
			SecurityUserPass secUserPass) {
		this.id = id;
		this.isLogin = isLogin;
		this.status = status;
		this.isDelete = isDelete;
		this.createdDt = createdDt;
		this.updatedDt = updatedDt;
		this.securityData = secData;
		this.securityUserPass = secUserPass;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIsLogin() {
		return this.isLogin;
	}

	public void setIsLogin(String isLogin) {
		this.isLogin = isLogin;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public Date getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	public SecurityData getSecurityData() {
		return this.securityData;
	}

	public void setSecurityData(SecurityData securityData) {
		this.securityData = securityData;
	}

	public SecurityUserPass getSecurityUserPass() {
		return this.securityUserPass;
	}

	public void setSecurityUserPass(SecurityUserPass securityUserPass) {
		this.securityUserPass = securityUserPass;
	}

}
