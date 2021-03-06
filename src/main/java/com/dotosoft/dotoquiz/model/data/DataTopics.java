package com.dotosoft.dotoquiz.model.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedNativeQueries({
	@NamedNativeQuery(name="quiz#questions.getByTopicId", query="SELECT topicQuestions.datQuestions FROM DataTopicsQuestions topicQuestions WHERE topicQuestions.datQuestions.isDelete = 'N' AND topicQuestions.datTopics.id = :topicId"),
	@NamedNativeQuery(name="quiz#questions.getRandomByTopicId", query="SELECT * FROM dat_topics_questions p where p.datTopics_id = :topicId ORDER BY RAND() LIMIT :limit"),
})
@NamedQueries({
	@NamedQuery(name="quiz#questions.findByQuestionId", query="FROM DataTopicsQuestions WHERE datQuestions.id = :questionId"),
	@NamedQuery(name="quiz#achievements.getALL", query="FROM ParameterAchievements WHERE isDelete = 'N'"),
	@NamedQuery(name="quiz#topics.getALL", query="FROM DataTopics WHERE isDelete = 'N'"),
	@NamedQuery(name="quiz#loggamequiz.findByGameAndUser", query="FROM LogPlayQuiz log WHERE log.logGameCreated.id = :gameId and log.securityUser.id = :userId"),
})
@Table(name = "dat_topics", catalog = "dotoquiz")
public class DataTopics implements java.io.Serializable {
	public DataTopics(String id, String picasaId, String imagePicasaUrl,
			String name, String description,
			String imageUrl, String isDelete, Date createdDt, String createdBy) {
		this.id = id;
		this.picasaId = picasaId;
		this.imagePicasaUrl = imagePicasaUrl;
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
		this.isDelete = isDelete;
		this.createdDt = createdDt;
		this.createdBy = createdBy;
	}

	@Id
	protected String id;

	@Column(name = "picasaId", length = 100)
	protected String picasaId;

	@Column(name = "imagePicasaUrl", columnDefinition="TEXT")
	protected String imagePicasaUrl;

	@ManyToOne
	protected DataTopics datTopics;

	@Column(name = "name", length = 100)
	protected String name;

	@Column(name = "description", columnDefinition="TEXT")
	protected String description;

	@Column(name = "image_url", length = 200)
	protected String imageUrl;

	@Column(name = "is_delete", length = 1)
	protected String isDelete;

	@Column(name = "created_dt", columnDefinition="DATETIME")
	protected Date createdDt;

	@Column(name = "created_by", length = 50)
	protected String createdBy;

	public DataTopics() {
	}

	public DataTopics(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DataTopics getSosTopics() {
		return this.datTopics;
	}

	public void setSosTopics(DataTopics datTopics) {
		this.datTopics = datTopics;
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

	public String getPicasaId() {
		return picasaId;
	}

	public void setPicasaId(String picasaId) {
		this.picasaId = picasaId;
	}

	public String getImagePicasaUrl() {
		return imagePicasaUrl;
	}

	public void setImagePicasaUrl(String imagePicasaUrl) {
		this.imagePicasaUrl = imagePicasaUrl;
	}

	public DataTopics getDatTopics() {
		return datTopics;
	}

	public void setDatTopics(DataTopics datTopics) {
		this.datTopics = datTopics;
	}

	@Override
	public String toString() {
		return "DataTopics [id=" + id + ", picasaId=" + picasaId
				+ ", imagePicasaUrl=" + imagePicasaUrl + ", datTopics="
				+ datTopics + ", name=" + name + ", description=" + description
				+ ", imageUrl=" + imageUrl + ", isDelete=" + isDelete
				+ ", createdDt=" + createdDt + ", createdBy=" + createdBy
				+ "]";
	}

}
