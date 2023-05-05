package javaclass;

public class StudentObEx {
	
	int id;
	String name;
	
	StudentObEx(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		StudentObEx s1=new StudentObEx(101,"Ram");
		StudentObEx s2=new StudentObEx(102,"Sam");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
	}
	
	public String toString()
	{
		return name+" "+id;
		
	}
	
	public boolean equals(Object o)
	{
		StudentObEx ob=(StudentObEx)o;
		
		if(this.id==ob.id||this.name.equals(ob.name))
		{
			return true;
		}
		else
			return false;
	}

}
