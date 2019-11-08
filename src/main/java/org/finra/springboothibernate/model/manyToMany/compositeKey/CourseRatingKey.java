package org.finra.springboothibernate.model.manyToMany.compositeKey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CourseRatingKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "student_id")
	private Long studentId;
	
	@Column(name = "course_id")
	private Long courseId;
	
	@Column(name = "teacher_id")
	private Long teacherId;
	
	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result += 31 * result + (int)this.studentId.longValue();
		result += 31 * result + (int)this.courseId.longValue(); 
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		
		if(!(obj instanceof CourseRatingKey)) {
			return false;
		}
		
		CourseRatingKey crk = (CourseRatingKey)obj;
		
		return crk.getStudentId() == this.studentId && crk.getCourseId() == this.courseId;
	}
}
