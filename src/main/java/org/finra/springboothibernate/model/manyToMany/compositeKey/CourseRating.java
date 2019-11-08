package org.finra.springboothibernate.model.manyToMany.compositeKey;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity(name = "CourseRating")
@Table(name = "course_rating")
public class CourseRating {

	@EmbeddedId
	private CourseRatingKey id;
	
	@ManyToOne
	@MapsId("student_id")
	@JoinColumn(name = "student_id")
	private StudentCK studentCK;
	
	@ManyToOne
	@MapsId("course_id")
	@JoinColumn(name = "course_id")
	private CourseCK courseCK;
	
	@ManyToOne
	@MapsId("teacher_id")
	@JoinColumn(name = "teacher_id")
	private TeacherCK teacherCK;
	
	private int rating;

	public CourseRatingKey getId() {
		return id;
	}

	public void setId(CourseRatingKey id) {
		this.id = id;
	}

	public StudentCK getStudentCK() {
		return studentCK;
	}

	public void setStudentCK(StudentCK studentCK) {
		this.studentCK = studentCK;
	}

	public CourseCK getCourseCK() {
		return courseCK;
	}

	public void setCourseCK(CourseCK courseCK) {
		this.courseCK = courseCK;
	}

	public TeacherCK getTeacherCK() {
		return teacherCK;
	}

	public void setTeacherCK(TeacherCK teacherCK) {
		this.teacherCK = teacherCK;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
