package runnable_task;

import static java.lang.Thread.currentThread;
import static utils.IOUtils.storeStudentDetails;
import static utils.StudentCollectionUtils.sortStudentsBySubject;


import java.util.List;

import com.app.core.Student;

public class Subjectsorter implements Runnable {

	private String filename;
	private List<Student>studentList;

	public Subjectsorter(String filename,List<Student>studentList) {
		super();
		this.filename=filename;
		this.studentList=studentList;
		System.out.println("subject constr");
	}
	@Override
	public void run(){
		System.out.println(currentThread().getName()+"start");
		try {
			System.out.println("sub run");
			storeStudentDetails(sortStudentsBySubject(studentList),filename);
		}catch(Exception e) {
			System.out.println("error in thread"+currentThread().getName()+" "+e);
		}
		System.out.println(currentThread().getName()+"over");
	}
}
