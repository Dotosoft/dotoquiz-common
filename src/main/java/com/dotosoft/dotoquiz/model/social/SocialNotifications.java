package com.dotosoft.dotoquiz.model.social;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sos_notifications", catalog="dotoquiz")
public class SocialNotifications implements java.io.Serializable {

	@Id
	protected String id;
	
	@Column(name="message", columnDefinition="TEXT")
	protected String message;
	
	@Column(name="is_delete", length=1)
	protected String isDelete;
	
	@Column(name="created_dt", columnDefinition="DATETIME")
	protected Date createdDt;
	
	@Column(name="created_by", length=50)
	protected String createdBy;

	public SocialNotifications() {
	}

	public SocialNotifications(String id) {
		this.id = id;
	}

	public SocialNotifications(String id, String message, String isDelete,
			Date createdDt, String createdBy) {
		this.id = id;
		this.message = message;
		this.isDelete = isDelete;
		this.createdDt = createdDt;
		this.createdBy = createdBy;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
