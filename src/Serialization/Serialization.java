package Serialization;

import java.io.Serializable;

class Student implements Serializable{
	
	private static final long serialverisionUID =1L; // this process to be added if we are implementing serializable
	
	private String name;
	private int age;
	private String address;
	
	public Student(String name, int age, String address) {
		
		this.setName(name); 
		this.setAge(age);
		this.setAddress(address);
		
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return ("Stuend name is" + this.getName() + ", age is:" + this.getAge() + " and address is: " + this.getAddress());
	}
	
}



public class Serialization {
	

}
