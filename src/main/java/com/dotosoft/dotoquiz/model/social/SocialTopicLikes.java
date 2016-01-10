package com.dotosoft.dotoquiz.model.social;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dotosoft.dotoquiz.model.data.DataTopics;
import com.dotosoft.dotoquiz.model.security.SecurityUser;

@Entity
@Table(name="sos_topic_likes", catalog="dotoquiz")
public class SocialTopicLikes implements java.io.Serializable {

	@Id
	protected String id;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	protected SecurityUser secUser;
	
	@ManyToOne
	@JoinColumn(name = "topicId")
	protected DataTopics datTopics;

	public SocialTopicLikes() {
	}

	public SocialTopicLikes(String id) {
		this.id = id;
	}

	public SocialTopicLikes(String id, SecurityUser secUser, DataTopics datTopics) {
		this.id = id;
		this.secUser = secUser;
		this.datTopics = datTopics;
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

	public DataTopics getSosTopics() {
		return this.datTopics;
	}

	public void setSosTopics(DataTopics datTopics) {
		this.datTopics = datTopics;
	}

}
