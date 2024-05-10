package tester;

import static utils.StudentCollectionUtils.populateList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.core.Student;

import runnable_task.Dobsorter;
import runnable_task.GPAsorter;
import runnable_task.Subjectsorter;


public class TestingCollection {
	public static void main(String[]agrs) {
		try (Scanner sc=new Scanner(System.in)){
			List<Student>list=populateList();
			System.out.println("enter 3 filse name to store data");
			ArrayList<Thread>thread=new ArrayList<>();
			thread.add(new Thread(new GPAsorter(sc.next(),list)+"t1"));
			thread.add(new Thread(new Dobsorter(sc.next(),list)+"t2"));
			thread.add(new Thread(new Subjectsorter(sc.next(), list), "t3"));
			
			for (Thread t : thread)
				t.start();
			//runnable : 4
			System.out.println("Main waiting for child thrds to finish exec");
			for (Thread t : thread)
				t.join();
			System.out.println("main over.....");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
