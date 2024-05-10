package runnable_task;

import static utils.IOUtils.storeStudentDetails;
import static utils.StudentCollectionUtils.sortStudentsByGPA;

import static java.lang.Thread.*;

import java.util.List;

import com.app.core.Student;


public class GPAsorter implements Runnable {
	private String filename;
	private List<Student>studentList;
	
	public GPAsorter(String filename,List<Student>studentlist) {
		super();
		this.filename=filename;
		this.studentList=studentlist;
		System.out.println("gpa constr");
	}
	@Override
	public void run(){
		System.out.println(currentThread().getName()+"started");
		try {
			System.out.println("gpa run");
			storeStudentDetails(sortStudentsByGPA(studentList),filename);
		}catch(Exception e) {
			System.out.println("error in thread"+currentThread().getName()+" "+e);
		}
		System.out.println(currentThread().getName()+"over");
	}

}
