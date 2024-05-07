package com.classrooms;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classroom[] carr=new Classroom[2];
		ClassroomArrayUtility.acceptClassroomDetail(carr);
		ClassroomArrayUtility.displayClassroomDetail(carr);
	}
}
