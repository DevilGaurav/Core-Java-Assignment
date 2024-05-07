package com.classrooms;

public class Teacher {

	private int teacherid;
	private String tname;
	private Designation desg;
	
	public Teacher (int teacherid,String tname,Designation desg) {
		this.teacherid=teacherid;
		this.tname=tname;
		this.desg=desg;
	}
	public int getteacherid() {
		return teacherid;
	}
	public void setteacherid(int teacherid) {
		this.teacherid=teacherid;
	}
	public String getname() {
		return tname;
	}
	public void setname(String name) {
		this.tname=name;
	}
	public Designation getdesg() {
		return desg;
	}
	public void setdesg(Designation desg) {
		this.desg=desg;
	}
	@Override
	public String toString () {
		return "teacher id is " + this.teacherid+
				" name is "+ this.tname+
				" designation is "+ this.desg;
	}
}
