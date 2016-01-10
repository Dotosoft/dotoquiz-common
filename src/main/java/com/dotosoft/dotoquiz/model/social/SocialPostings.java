package com.dotosoft.dotoquiz.model.social;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dotosoft.dotoquiz.model.security.SecurityUser;

@Entity
@Table(name="sos_postings", catalog="dotoquiz")
public class SocialPostings implements java.io.Serializable {

	@Id
	protected String id;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	protected SecurityUser secUser;
	
	@Column(name="title", length=100)
	protected String title;
	
	@Column(name="description", columnDefinition="TEXT")
	protected String description;
	
	@Column(name="image_url", columnDefinition="TEXT")
	protected String imageUrl;
	
	@Column(name="is_delete", length=1)
	protected String isDelete;
	
	@Column(name="created_dt", columnDefinition="DATETIME")
	protected Date createdDt;
	
	@Column(name="created_by", length=50)
	protected String createdBy;

	public SocialPostings() {
	}

	public SocialPostings(String id) {
		this.id = id;
	}

	public SocialPostings(String id, SecurityUser secUser, String title,
			String description, String imageUrl, String isDelete,
			Date createdDt, String createdBy) {
		this.id = id;
		this.secUser = secUser;
		this.title = title;
		this.description = description;
		this.imageUrl = imageUrl;
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

	public SecurityUser getSecUser() {
		return this.secUser;
	}

	public void setSecUser(SecurityUser secUser) {
		this.secUser = secUser;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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
