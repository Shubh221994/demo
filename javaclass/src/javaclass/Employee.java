package javaclass;
import java.util.Scanner;

public class Employee {

	String name;
	int age;
	int empid;
	double salary;
	int deptno;
	static String company="TCS";
	
	Employee(String name,int age,int empid,double salary,int deptno)
	{
		this.name=name;
		this.age=age;
		this.empid=empid;
		this.salary=salary;
		this.deptno=deptno;
	}
	
	Employee(String name,int age,double salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	void eDetails()
	{
		System.out.println("Employee name is "+name);
		System.out.println("Employee age is "+age);
		System.out.println("Employee id is "+empid);
		System.out.println("Employee department number is "+deptno);
		System.out.println("Employee salary is "+salary);
		System.out.println("Company name is "+company);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		
		System.out.println("Enter empid: ");
		int empid=sc.nextInt();
		
		System.out.println("Enter salary: ");
		double salary=sc.nextDouble();
		
		System.out.println("Enter Dept. number: ");
		int deptno=sc.nextInt();
		
		Employee e =new Employee(name,age,empid,salary,deptno);
		sc.nextLine();
		System.out.println("Enter 2nd name: ");
		name=sc.nextLine();
		
		System.out.println("Enter age: ");
		age=sc.nextInt();
		
		System.out.println("Enter salary: ");
		salary=sc.nextDouble();
		
		Employee d=new Employee(name,age,salary);
		
		e.eDetails();
		d.eDetails();
		
	}
}
