package com.sapient.vo;

public class Emp {

	private int eid;
	private String ename;
	private double sal;
	
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getPf() {
		return sal * 0.12;
	}
	public double getNetpay() {
		return sal-getPf();
	}
	
	
	
	
}
