package com.udemy.mapped;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractStudentPerson {

	protected String drivingLicense;

	public AbstractStudentPerson() {

	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	
	
}
