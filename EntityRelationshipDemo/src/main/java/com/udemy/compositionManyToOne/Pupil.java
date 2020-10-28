package com.udemy.compositionManyToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pupil {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pupilId;

	@Column(name = "pupil_name")
	private String pupilName;

	@ManyToOne
	@JoinColumn(name = "schoolId")
	private School school;

	public Pupil() {

	}

	public Pupil(String pupilName) {
		this.pupilName = pupilName;
	}

	public int getpupilId() {
		return pupilId;
	}

	public void setpupilId(int pupilId) {
		this.pupilId = pupilId;
	}

	public String getpupilName() {
		return pupilName;
	}

	public void setpupilName(String pupilName) {
		this.pupilName = pupilName;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}
