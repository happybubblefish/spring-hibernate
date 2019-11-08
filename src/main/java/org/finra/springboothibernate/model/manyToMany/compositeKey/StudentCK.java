package org.finra.springboothibernate.model.manyToMany.compositeKey;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "StudentCK")
@Table(name = "student_ck")
public class StudentCK {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "studentCK")
	private Set<CourseRating> ratings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<CourseRating> getRatings() {
		return ratings;
	}

	public void setRatings(Set<CourseRating> ratings) {
		this.ratings = ratings;
	}
}
