package javaclass;

public class MethodOverloadi {

	public static void main(String[] args) 
		{
			add(10,2);
			add(13,2,5);
			add(10.0f);
		}
public static void add(int a,int b)
{
	System.out.println(a+b);
}
public static void add(int a,int b,int c) {
	System.out.println(a+b+c);
}
public static void add(int a) {
	System.out.println(a);
}
public static void add(float a) {
	System.out.println(a);
}
}
