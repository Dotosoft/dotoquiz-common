package com.dotosoft.dotoquiz.model.social;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dotosoft.dotoquiz.model.security.SecurityUser;

@Entity
@Table(name="sos_notifications_user", catalog="dotoquiz")
public class SocialNotificationUsers implements java.io.Serializable {

	@Id
	protected String id;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	protected SecurityUser secUser;
	
	@ManyToOne
	@JoinColumn(name = "notificationId")
	protected SocialNotifications sosNotifications;
	
	@Column(name="isRead", length=1)
	protected String isRead;
	
	@Column(name="updated_dt", columnDefinition="DATETIME")
	protected Date updatedDt;
	
	@Column(name="updated_by", length=50)
	protected String updatedBy;

	public SocialNotificationUsers() {
	}

	public SocialNotificationUsers(String id) {
		this.id = id;
	}

	public SocialNotificationUsers(String id, SecurityUser secUser,
			SocialNotifications sosNotifications, String isRead, Date updatedDt,
			String updatedBy) {
		this.id = id;
		this.secUser = secUser;
		this.sosNotifications = sosNotifications;
		this.isRead = isRead;
		this.updatedDt = updatedDt;
		this.updatedBy = updatedBy;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SecurityUser getSecUser() {
		return this.secUser;
	}

	public void setSecUser(SecurityUser secUser) {
		this.secUser = secUser;
	}

	public SocialNotifications getSosNotifications() {
		return this.sosNotifications;
	}

	public void setSosNotifications(SocialNotifications sosNotifications) {
		this.sosNotifications = sosNotifications;
	}

	public String getIsRead() {
		return this.isRead;
	}

	public void setIsRead(String isRead) {
		this.isRead = isRead;
	}

	public Date getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}
