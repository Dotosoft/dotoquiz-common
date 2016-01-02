package com.dotosoft.dotoquiz.model.social;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dotosoft.dotoquiz.model.security.SecurityUser;

@Entity
@Table(name="sos_friends", catalog="dotoquiz")
public class SocialFriends implements java.io.Serializable {

	@Id
	protected String id;
	
	@ManyToOne
	protected SecurityUser secUserByUserId;
	
	@ManyToOne
	protected SecurityUser secUserByFriendId;
	
	@Column(name="created_dt", length=19)
	protected Date createdDt;

	public SocialFriends() {
	}

	public SocialFriends(String id) {
		this.id = id;
	}

	public SocialFriends(String id, SecurityUser secUserByUserId,
			SecurityUser secUserByFriendId, Date createdDt) {
		this.id = id;
		this.secUserByUserId = secUserByUserId;
		this.secUserByFriendId = secUserByFriendId;
		this.createdDt = createdDt;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SecurityUser getSecUserByUserId() {
		return this.secUserByUserId;
	}

	public void setSecUserByUserId(SecurityUser secUserByUserId) {
		this.secUserByUserId = secUserByUserId;
	}

	public SecurityUser getSecUserByFriendId() {
		return this.secUserByFriendId;
	}

	public void setSecUserByFriendId(SecurityUser secUserByFriendId) {
		this.secUserByFriendId = secUserByFriendId;
	}

	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

}
