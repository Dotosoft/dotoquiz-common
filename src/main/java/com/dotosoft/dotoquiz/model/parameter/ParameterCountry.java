package com.dotosoft.dotoquiz.model.parameter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mt_country", catalog = "dotoquiz")
public class ParameterCountry implements java.io.Serializable {

	public ParameterCountry(String id) {
		this.id = id;
	}

	public ParameterCountry(String id, String url, String name,
			double latitude, double longitude) {
		this.id = id;
		this.url = url;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Id
	protected String id;

	@Column(name = "url", length = 50)
	protected String url;

	@Column(name = "name", length = 50)
	protected String name;

	@Column(name = "latitude", columnDefinition="DOUBLE")
	protected double latitude;

	@Column(name = "longitude", columnDefinition="DOUBLE")
	protected double longitude;

	public ParameterCountry() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "ParameterCountry [id=" + id + ", url=" + url + ", name=" + name
				+ ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}

}
