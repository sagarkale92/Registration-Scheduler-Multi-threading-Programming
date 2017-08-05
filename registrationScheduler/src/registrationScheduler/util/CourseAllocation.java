package registrationScheduler.util;

import java.util.ArrayList;

import registrationScheduler.store.Results;

public class CourseAllocation {
	
	private Results re = null;
	
	/**
	 * Constructor of CourseAllocation initializes data members.
	 * @param reIn
	 */
	public CourseAllocation(Results reIn){
		Logger.writeOutput("Constructor of CourseAllocation class is called.", 4);
		re = reIn;
	}
	
	/**
	 * Loops on the students and run the algorithm.
	 * @param students
	 * @param preference
	 */
	public synchronized void allocatePref(ArrayList<Student> students, int preference){
		Student s = null;
		for(int i=0; i<students.size();i++){
			s = students.get(i);
			StudentAlloc salloc = re.getStudentAlloc(s.getSname());
			salloc = allocateHelper(s, salloc, preference);
			re.updateResults(salloc);
		}
		
		re.setAttendence(re.getAttendence()+1);
	}
	
	/**
	 * Runs the algorithm and Stores the results in the Results data structure.
	 * @param s
	 * @param salloc
	 * @param preference
	 * @return StudentAlloc
	 */
	public synchronized StudentAlloc allocateHelper(Student s, StudentAlloc salloc, int preference){
		int[] Preferences = {0, s.getPref1(), s.getPref2(), s.getPref3(), s.getPref4(), s.getPref5(), s.getPref6(), s.getPref7()};
		ObjectPool coursePool = ObjectPool.getInstance();
		Course course = null;
		try{
			for(int i=preference; i<=7; i++){
				do{
					course = coursePool.acquire(Preferences[i]);
				}
				while(null==course);
				
				if(course.getAllocationCount() < 60 && salloc.isNotContains(Preferences[i])){
					switch(preference){
					case 1:salloc.setAlloc1(Preferences[i]);
					break;
					case 2:salloc.setAlloc2(Preferences[i]);
					break;
					case 3:salloc.setAlloc3(Preferences[i]);
					break;
					case 4:salloc.setAlloc4(Preferences[i]);
					break;
					case 5:salloc.setAlloc5(Preferences[i]);
					break;
						default:
					}
					salloc.setTotal_preference(salloc.getTotal_preference()+i);
					course.increamentCourseNumber();
					return salloc;
				}
			}
		}
		catch(Exception e){
			course = null;
		}
		finally{
			if(null != course){
				coursePool.release(course);
			}
		}
		
		return salloc;
	}
	
	public Results getRe() {
		return re;
	}

	public void setRe(Results re) {
		this.re = re;
	}
}
