package com.udemy.compositionManyToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int schoolId;
	
	@Column(name="school_Name")
	private String schoolName;
	
	@OneToMany(mappedBy = "school")
	private List<Pupil> pupils;
	
	public School() {
		this.pupils = new ArrayList<Pupil>();
	}

	// in order to avoid null pointer exception
	public School(String schoolName) {
		this();
		this.schoolName = schoolName;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public List<Pupil> getPupils() {
		return pupils;
	}

	public void setPupils(List<Pupil> pupils) {
		this.pupils = pupils;
	}
	
	public void addPupil(Pupil pupil) {
		this.pupils.add(pupil);
	}
}
