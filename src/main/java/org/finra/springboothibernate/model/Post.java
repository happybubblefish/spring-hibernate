package org.finra.springboothibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Post")
@Table(name = "post")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String title;
	
	@OneToOne(mappedBy = "post", cascade = CascadeType.ALL)
	public PostDetails details;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public PostDetails getDetails() {
		return details;
	}

	public void setDetails(PostDetails details) {
        if (details == null) {
            if (this.details != null) {
                this.details.setPost(null);
            }
        }
        else {
            details.setPost(this);
        }
        this.details = details;
    }
}
