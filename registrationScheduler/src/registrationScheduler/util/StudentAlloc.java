package registrationScheduler.util;

public class StudentAlloc implements Comparable<StudentAlloc>{
	private String sname;
	private int alloc1;
	private int alloc2;
	private int alloc3;
	private int alloc4;
	private int alloc5;
	
	private int total_preference=0;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAlloc1() {
		return alloc1;
	}
	public void setAlloc1(int alloc1) {
		this.alloc1 = alloc1;
	}
	public int getAlloc2() {
		return alloc2;
	}
	public void setAlloc2(int alloc2) {
		this.alloc2 = alloc2;
	}
	public int getAlloc3() {
		return alloc3;
	}
	public void setAlloc3(int alloc3) {
		this.alloc3 = alloc3;
	}
	public int getTotal_preference() {
		return total_preference;
	}
	public void setTotal_preference(int total_preference) {
		this.total_preference = total_preference;
	}
	public int getAlloc4() {
		return alloc4;
	}
	public void setAlloc4(int alloc4) {
		this.alloc4 = alloc4;
	}
	public int getAlloc5() {
		return alloc5;
	}
	public void setAlloc5(int alloc5) {
		this.alloc5 = alloc5;
	}
	
	/**
	 * Compares student names.
	 */
	@Override
	public int compareTo(StudentAlloc sa) {
		String s1 = this.getSname();
		String s2 = sa.getSname();
		s1 = s1.replaceAll("\\D+","");
		s2 = s2.replaceAll("\\D+","");

		return (Integer.parseInt(s1) - Integer.parseInt(s2));
	}
	
	/**
	 * Checks if course is allocated previously.
	 * @param courseNumber
	 * @return boolean
	 */
	public synchronized boolean isNotContains(int courseNumber){
		if(this.getAlloc1() == courseNumber){
			return false;
		}
		if(this.getAlloc2() == courseNumber){
			return false;
		}
		if(this.getAlloc3() == courseNumber){
			return false;
		}
		if(this.getAlloc4() == courseNumber){
			return false;
		}
		if(this.getAlloc5() == courseNumber){
			return false;
		}
		return true;
	}
}
