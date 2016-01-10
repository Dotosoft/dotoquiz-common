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
@Table(name="sos_postings_likes", catalog="dotoquiz")
public class SocialPostingLikes implements java.io.Serializable {

	@Id
	protected String id;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	protected SecurityUser secUser;
	
	@ManyToOne
	@JoinColumn(name = "postingId")
	protected SocialPostings sosPostings;
	
	@Column(name="is_delete", length=1)
	protected String isDelete;
	
	@Column(name="created_dt", columnDefinition="DATETIME")
	protected Date createdDt;

	public SocialPostingLikes() {
	}

	public SocialPostingLikes(String id) {
		this.id = id;
	}

	public SocialPostingLikes(String id, SecurityUser secUser,
			SocialPostings sosPostings, String isDelete, Date createdDt) {
		this.id = id;
		this.secUser = secUser;
		this.sosPostings = sosPostings;
		this.isDelete = isDelete;
		this.createdDt = createdDt;
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

	public SocialPostings getSosPostings() {
		return this.sosPostings;
	}

	public void setSosPostings(SocialPostings sosPostings) {
		this.sosPostings = sosPostings;
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

}
