package org.rhok.wcs.shared.model;

public class PatientInfo {

	private String name;
	private int age;
	private Gender gender;
	
	public PatientInfo() {
		name = "Default Patient Name";
		age = 0;
		gender = Gender.Other;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public static String getGenderString(Gender gender) {
		switch (gender) {
		case Male:
			return "Male";
		case Female:
			return "Female";
		case Transitional:
			return "Transitional";
		case Other:
			return "Other";
		default:
			// Should never happen.
			return "Unknown";
		}
	}
}
