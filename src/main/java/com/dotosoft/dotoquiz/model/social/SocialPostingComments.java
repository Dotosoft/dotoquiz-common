package com.dotosoft.dotoquiz.model.social;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dotosoft.dotoquiz.model.security.SecurityUser;

@Entity
@Table(name="sos_postings_comments", catalog="dotoquiz")
public class SocialPostingComments implements java.io.Serializable {

	@Id
	protected String id;
	
	@ManyToOne
	protected SecurityUser secUser;
	
	@ManyToOne
	protected SocialPostings sosPostings;
	
	@Column(name="comments")
	protected String comments;
	
	@Column(name="created_dt", length=19)
	protected Date createdDt;

	public SocialPostingComments() {
	}

	public SocialPostingComments(String id) {
		this.id = id;
	}

	public SocialPostingComments(String id, SecurityUser secUser,
			SocialPostings sosPostings, String comments, Date createdDt) {
		this.id = id;
		this.secUser = secUser;
		this.sosPostings = sosPostings;
		this.comments = comments;
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

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

}
