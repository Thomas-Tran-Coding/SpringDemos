package com.udemy.inheritance;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
// persistence.xml auf "create" stellen

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class Car extends Vehicle {

	private int speed;

	public Car() {

	}

	public Car(String name, int speed) {
		super(name);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
