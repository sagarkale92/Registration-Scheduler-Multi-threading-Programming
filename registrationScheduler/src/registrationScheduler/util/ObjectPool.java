package registrationScheduler.util;

import java.util.ArrayList;

public class ObjectPool {
	private ArrayList<Course> availObjects = null;
	private ArrayList<Course> acquiredObjects = null;
	private static ObjectPool objectPoolInstance;
	
	/**
	 * Constructor of ObjectPool initializes data members.
	 */
	private ObjectPool(){
		setAvailObjects(new ArrayList<Course>());
		setAcquiredObjects(new ArrayList<Course>());
	}
	
	/**
	 * Returns the unique object of ObjectPool.
	 * @return ObjectPool
	 */
	public static ObjectPool getInstance(){
		if(objectPoolInstance == null){
			synchronized(ObjectPool.class){
				if(objectPoolInstance == null){
					objectPoolInstance = new ObjectPool();
				}
			}
		}
		return objectPoolInstance;
	}
	
	/**
	 * Creates and returns course Object.
	 * @param courseNumberIn
	 * @return Course
	 */
	protected Course create(int courseNumberIn){
		Course course = new Course(courseNumberIn);
		return course;
	}
	
	/**
	 * Adds course objects to the Available ArrayList.
	 * @param courseNumberIn
	 */
	public synchronized void addCourses(int courseNumberIn){
		Course course = null;
		course = create(courseNumberIn);
		this.getAvailObjects().add(course);
	}
	
	/**
	 * Checks if the Course Object available and returns.
	 * @param courseNumberIn
	 * @return Course
	 */
	public synchronized Course acquire(int courseNumberIn){
		Course course = null;
		for(Course c: this.getAvailObjects()){
			if(c.getCourseNumber() == courseNumberIn){
				course = c;
			}
		}
		return course;
	}
	
	/**
	 * Adds the returned course object to the ArrayList.
	 * @param course
	 */
	public synchronized void release(Course course){
		this.getAvailObjects().add(course);
		this.getAcquiredObjects().remove(course);
	}

	public ArrayList<Course> getAvailObjects() {
		return availObjects;
	}

	public void setAvailObjects(ArrayList<Course> availObjects) {
		this.availObjects = availObjects;
	}

	public ArrayList<Course> getAcquiredObjects() {
		return acquiredObjects;
	}

	public void setAcquiredObjects(ArrayList<Course> acquiredObjects) {
		this.acquiredObjects = acquiredObjects;
	}
}