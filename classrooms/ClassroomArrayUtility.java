package com.classrooms;

import java.util.Scanner;

public class ClassroomArrayUtility {
	public static void acceptClassroomDetail(Classroom[] carr) {
		Scanner in=new Scanner(System.in);
		for (int i=0;i<carr.length;i++) {
			System.out.println(" Enter classroom id ");
			int roomid = in.nextInt();
			System.out.println(" Enter name ");
			String name=in.next();
			System.out.println("Enter teacher id ");
			int teacherid=in.nextInt();
			System.out.println("Enter teacher name ");
			String tname= in.next();
			System.out.println("Enter choice 1:Prof 2:Ass_Prof ");
			int count=in.nextInt();
			Designation desg=null;
			switch(count)
			{
				case 1:desg=Designation.Prof;
				break;
				case 2: desg=Designation.Ass_prof;
				break;
				default : break;
			}
			carr[i]=new Classroom(roomid,name,new Teacher(teacherid,tname,desg));
		}
	}
	
	public static void displayClassroomDetail(Classroom[] carr) {
		for(int i=0;i<carr.length;i++) {
			System.out.println(carr[i]);
			
	}
}
	
}
