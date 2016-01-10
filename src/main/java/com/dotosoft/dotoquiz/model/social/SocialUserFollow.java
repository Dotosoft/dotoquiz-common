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
@Table(name="sos_user_follow", catalog="dotoquiz")
public class SocialUserFollow implements java.io.Serializable {

	@Id
	protected String id;
	
	@ManyToOne
	@JoinColumn(name = "followerId")
	protected SecurityUser secUserByFollowerId;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	protected SecurityUser secUserByUserId;
	
	@Column(name="followDate", columnDefinition="DATETIME")
	protected Date followDate;

	public SocialUserFollow() {
	}

	public SocialUserFollow(String id) {
		this.id = id;
	}

	public SocialUserFollow(String id, SecurityUser secUserByFollowerId,
			SecurityUser secUserByUserId, Date followDate) {
		this.id = id;
		this.secUserByFollowerId = secUserByFollowerId;
		this.secUserByUserId = secUserByUserId;
		this.followDate = followDate;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SecurityUser getSecUserByFollowerId() {
		return this.secUserByFollowerId;
	}

	public void setSecUserByFollowerId(SecurityUser secUserByFollowerId) {
		this.secUserByFollowerId = secUserByFollowerId;
	}

	public SecurityUser getSecUserByUserId() {
		return this.secUserByUserId;
	}

	public void setSecUserByUserId(SecurityUser secUserByUserId) {
		this.secUserByUserId = secUserByUserId;
	}

	public Date getFollowDate() {
		return this.followDate;
	}

	public void setFollowDate(Date followDate) {
		this.followDate = followDate;
	}

}
