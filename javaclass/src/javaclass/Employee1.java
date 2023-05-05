package javaclass;

public class Employee1 {
	
	int id;
	String name;
	
	public Employee1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	

	public static void main(String[] args) {
		Employee1 e1=new Employee1(101,"Salomi");
		Employee1 e2=new Employee1(102,"Shubham");
		
		System.out.println(e1);
		System.out.println(e2);
	}
	
	public String toString()
	{
		System.out.println("Hi");
		return name+" "+id;
		
	}
}
