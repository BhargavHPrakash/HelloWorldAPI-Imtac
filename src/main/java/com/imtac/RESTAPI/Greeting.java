package com.imtac.RESTAPI;

public class Greeting {
	private final long id;
	private final String content;
//	private final String empName;
//	private final String roll;
	
	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
//		this.empName = empName;
//		this.roll = roll;
	}
//	, String empName, String roll
	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
	
//	public String getEmpName() {
//		return empName;
//	}
//	
//	public String getRoll() {
//		return roll;
//	}
	
	public String companyName() {
		return "Imtac";
	}
}
