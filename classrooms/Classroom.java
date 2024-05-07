package com.classrooms;

public class Classroom {
	private int roomid;
	private String name;
	private Teacher teacher;
	
	public Classroom(int roomid,String name,Teacher teacher) {
		this.roomid=roomid;
		this.name=name;	
		this.teacher=teacher;
	}

	@Override
	public String toString() {
		return "Roomid id "+this.roomid+
				" name is "+this.name+
				teacher.toString();
	}
}
