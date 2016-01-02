package com.dotosoft.dotoquiz.model.social;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dotosoft.dotoquiz.model.data.DataTopics;
import com.dotosoft.dotoquiz.model.security.SecurityUser;

@Entity
@Table(name="sos_topic_likes", catalog="dotoquiz")
public class SocialTopicLikes implements java.io.Serializable {

	@Id
	protected int id;
	
	@ManyToOne
	protected SecurityUser secUser;
	
	@ManyToOne
	protected DataTopics datTopics;

	public SocialTopicLikes() {
	}

	public SocialTopicLikes(int id) {
		this.id = id;
	}

	public SocialTopicLikes(int id, SecurityUser secUser, DataTopics datTopics) {
		this.id = id;
		this.secUser = secUser;
		this.datTopics = datTopics;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
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
