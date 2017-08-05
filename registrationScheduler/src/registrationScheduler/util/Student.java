package registrationScheduler.util;

public class Student{
	private String sname;

	private int pref1;
	private int pref2;
	private int pref3;
	private int pref4;
	private int pref5;
	private int pref6;
	private int pref7;
	
	/**
	 * Constructor of Student initializes data members.
	 * @param snameIn
	 * @param p1In
	 * @param p2In
	 * @param p3In
	 * @param p4In
	 * @param p5In
	 * @param p6In
	 * @param p7In
	 */
	public Student(String snameIn, int p1In, int p2In, int p3In, int p4In, int p5In, int p6In, int p7In){
		this.setSname(snameIn);
		this.setPref1(p1In);
		this.setPref2(p2In);
		this.setPref3(p3In);
		this.setPref4(p4In);
		this.setPref5(p5In);
		this.setPref6(p6In);
		this.setPref7(p7In);
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getPref1() {
		return pref1;
	}

	public void setPref1(int pref1) {
		this.pref1 = pref1;
	}

	public int getPref2() {
		return pref2;
	}

	public void setPref2(int pref2) {
		this.pref2 = pref2;
	}

	public int getPref3() {
		return pref3;
	}

	public void setPref3(int pref3) {
		this.pref3 = pref3;
	}

	public int getPref4() {
		return pref4;
	}

	public void setPref4(int pref4) {
		this.pref4 = pref4;
	}

	public int getPref5() {
		return pref5;
	}

	public void setPref5(int pref5) {
		this.pref5 = pref5;
	}

	public int getPref6() {
		return pref6;
	}

	public void setPref6(int pref6) {
		this.pref6 = pref6;
	}

	public int getPref7() {
		return pref7;
	}

	public void setPref7(int pref7) {
		this.pref7 = pref7;
	}
}