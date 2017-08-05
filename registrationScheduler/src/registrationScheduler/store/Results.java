package registrationScheduler.store;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import registrationScheduler.util.FileProcessor;
import registrationScheduler.util.Logger;
import registrationScheduler.util.StudentAlloc;

public class Results implements StdoutDisplayInterface, FileDisplayInterface {
	private Map<String, StudentAlloc> studentsalloc = new HashMap<String, StudentAlloc>();
	private FileProcessor fp;
	private int attendence=0;
	
	private String[] Courses = {"","A","B","C","D", "E", "F", "G"};
	
	/**
	 * Constructor of Results initializes data members.
	 * @param fpIn
	 */
	public Results(FileProcessor fpIn){
		Logger.writeOutput("Constructor of Results class is called.", 4);
		fp = fpIn;
	}

	/**
	 * Writes the contents of data structure in the store to file.
	 */
	@Override
	public void writeSchedulestoFile() {
		TreeSet<StudentAlloc> saTree = new TreeSet<StudentAlloc>();
		int OveralltotalPref = 0;
		for(String key: studentsalloc.keySet()){
			saTree.add(studentsalloc.get(key));
		}
		
		for (StudentAlloc sa: saTree) 
		{
			if(sa != null){
				OveralltotalPref+= sa.getTotal_preference();
				fp.writeLine(sa.getSname()+" "+Courses[sa.getAlloc1()]+" "+Courses[sa.getAlloc2()]+" "+Courses[sa.getAlloc3()]+" "+Courses[sa.getAlloc4()]+" "+Courses[sa.getAlloc5()]+" "+sa.getTotal_preference());
				fp.writeLine("\n");
			}
		}
		fp.writeLine("\n");
		
		fp.writeLine("Average Preference Score is "+String.format("%.2f", (((double)OveralltotalPref/80))));
		fp.terminateInputFile();
		fp.terminateOutputFile();
	}
	
	/**
	 * Writes the contents of data structure in the store to screen.
	 */
	@Override
	public void writeSchedulesToScreen() {
		
		TreeSet<StudentAlloc> saTree = new TreeSet<StudentAlloc>();
		int OveralltotalPref = 0;
		for(String key: studentsalloc.keySet()){
			saTree.add(studentsalloc.get(key));
		}
		
		for (StudentAlloc sa: saTree) 
		{
			if(sa != null){
				OveralltotalPref+= sa.getTotal_preference();
				Logger.writeOutput(sa.getSname()+" "+Courses[sa.getAlloc1()]+" "+Courses[sa.getAlloc2()]+" "+Courses[sa.getAlloc3()]+" "+Courses[sa.getAlloc4()]+" "+Courses[sa.getAlloc5()]+" "+sa.getTotal_preference(), 1);
			}
		}
		Logger.writeOutput("\n", 1);
		
		Logger.writeOutput("Average Preference Score is "+String.format("%.2f", (((double)OveralltotalPref/80))),1);
		Logger.writeOutput("Average Preference Score is "+String.format("%.2f", (((double)OveralltotalPref/80))),0);
		
	}
	
	/**
	 * Updates the data member studentsalloc. 
	 * @param sa
	 */
	public synchronized void updateResults(StudentAlloc sa){
		studentsalloc.put(sa.getSname(), sa);
		Logger.writeOutput("Entry is added to the Result", 2);
	}
	
	public synchronized StudentAlloc getStudentAlloc(String key){
		StudentAlloc sa = null;
		sa = studentsalloc.get(key);
		return sa;
	}

	public synchronized Map<String, StudentAlloc> getStudentsalloc() {
		return studentsalloc;
	}

	public synchronized void setStudentsalloc(Map<String, StudentAlloc> studentsalloc) {
		this.studentsalloc = studentsalloc;
	}

	public synchronized int getAttendence() {
		return attendence;
	}

	public synchronized void setAttendence(int attendence) {
		this.attendence = attendence;
	}
}
