package registrationScheduler.threadMgmt;

import java.util.ArrayList;

import registrationScheduler.store.Results;
import registrationScheduler.util.CourseAllocation;
import registrationScheduler.util.FileProcessor;
import registrationScheduler.util.Logger;
import registrationScheduler.util.Student;
import registrationScheduler.util.StudentAlloc;

public class WorkerThread implements Runnable{
	private FileProcessor fp = null;
	private Results re = null;
	
	/**
	 * Constructor of WorkerThread initializes data members.
	 * @param fpIn
	 * @param reIn
	 */
	public WorkerThread(FileProcessor fpIn, Results reIn){
		super();
		Logger.writeOutput("Constructor of WorkerThread class is called.", 4);
		setFp(fpIn);
		setRe(reIn);
	}
	
	/**
	 * Reads line from input file, run algorithm to assign courses.
	 */
	public void run(){
		try{
			Logger.writeOutput("Run method of Thread is called.", 3);
			String line ="";
			ArrayList<Student> students = new ArrayList<Student>();
			Student s = null;
			while((line = fp.readLine())!=null){
				s = new Student("",0,0,0,0,0,0,0);
				String[] lineArray = line.split("\\s+");
				StudentAlloc salloc = new StudentAlloc();
				s.setSname(lineArray[0]);
				salloc.setSname(lineArray[0]);
				for(int i=1; i<8; i++){
					switch(lineArray[i]){
					case "1": s.setPref1(i);
						break;
					case "2": s.setPref2(i);
						break;
					case "3": s.setPref3(i);
						break;
					case "4": s.setPref4(i);
						break;
					case "5": s.setPref5(i);
						break;
					case "6": s.setPref6(i);
						break;
					case "7": s.setPref7(i);
						break;
					default:
					}
				}
				
				students.add(s);
				re.updateResults(salloc);
			}
			
			CourseAllocation ca = new CourseAllocation(re);
			
			ca.allocatePref(students, 1);
			ca.allocatePref(students, 2);
			ca.allocatePref(students, 3);
			ca.allocatePref(students, 4);
			ca.allocatePref(students, 5);
			
		}catch(Exception e){
			e.printStackTrace();
			System.exit(-1);
		}
		finally{
			
		}
	}

	public FileProcessor getFp() {
		return fp;
	}

	public void setFp(FileProcessor fp) {
		this.fp = fp;
	}

	public Results getRe() {
		return re;
	}

	public void setRe(Results re) {
		this.re = re;
	}
}