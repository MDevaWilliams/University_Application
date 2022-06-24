package com.Springboot.examMs3.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UniversityApplication {
	@Id
	private int id;
	private String universityname;
	private int totalclgs;
	public int getId() {
		return id;
	}
	
	public String getUniversityname() {
		return universityname;
	}
	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}
	public int getTotalclgs() {
		return totalclgs;
	}
	public void setTotalclgs(int totalclgs) {
		this.totalclgs = totalclgs;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UniversityApplication(int id, String universityname, int totalclgs) {
		super();
		this.id = id;
		this.universityname = universityname;
		this.totalclgs = totalclgs;
	}
	public UniversityApplication() {
		super();

	}
	
	System.out.println("hello");

}
