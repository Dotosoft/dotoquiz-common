package com.dotosoft.dotoquiz.model.parameter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mt_country", catalog="dotoquiz")
public class ParameterCountry implements java.io.Serializable {

	@Id
	protected String id;
	
	@Column(name="name", length=100)
	protected String name;
	
	@Column(name="description")
	protected String description;
	
	@Column(name="is_delete", length=1)
	protected String isDelete;
	
	@Column(name="created_dt", length=19)
	protected Date createdDt;
	
	@Column(name="created_by", length=50)
	protected String createdBy;

	public ParameterCountry() {
	}

	public ParameterCountry(String id) {
		this.id = id;
	}

	public ParameterCountry(String id, String name, String description,
			String isDelete, Date createdDt, String createdBy) {
		this.id = id;
		this.name = name;
		this.description = description;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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
