package org.finra.springboothibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Postdetails")
@Table(name = "post_details")
public class PostDetails {

	@Id
//	@GeneratedValue
	public Long id;

	@Column(name = "created_on")
	private Date createdOn;

	@Column(name = "created_by")
	private String createdBy;

//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "post_id")
	@OneToOne
	@MapsId
	private Post post;
	
	public PostDetails() {
		super();
	}

	public PostDetails(String createdBy) {
		super();
		this.createdOn = new Date();
		this.createdBy = createdBy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
}
