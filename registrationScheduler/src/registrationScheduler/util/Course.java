package registrationScheduler.util;

public class Course{
	private int allocationCount = 0;
	private String courseName = "";
	private int courseNumber = 0;
	private String[] courses = {"","CourseA","CourseB","CourseC","CourseD", "CourseE", "CourseF", "CourseG"};
	
	/**
	 * Constructor of WorkerThread initializes data members.
	 * @param courseNumberIn
	 */
	public Course(int courseNumberIn){
		setCourseNumber(courseNumberIn);
		setCourseName(courses[courseNumberIn]);
	}
	
	/**
	 * Increments allocation count.
	 */
	public void increamentAllocation(){
		this.setAllocationCount(this.getAllocationCount()+1);
	}

	public int getAllocationCount() {
		return allocationCount;
	}

	public void setAllocationCount(int allocationCount) {
		this.allocationCount = allocationCount;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public synchronized void increamentCourseNumber(){
		this.setAllocationCount(this.getAllocationCount()+1);
	}

	public synchronized int getCourseNumber() {
		return courseNumber;
	}

	public synchronized void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
}