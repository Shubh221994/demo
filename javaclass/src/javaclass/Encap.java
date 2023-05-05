package javaclass;

public class Encap {
	
	private String name;
	private long phno;
	String address;
	
	public Encap(String name, long phno, String address) {
		this.name = name;
		this.phno = phno;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	
	void printDetails() {
		System.out.println(name);
		System.out.println(phno);
		System.out.println(address);
	}

}
