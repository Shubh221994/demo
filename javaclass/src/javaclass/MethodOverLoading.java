package javaclass;

public class MethodOverLoading {
	
	public static int add(int a,int b) {
		return (a+b);
	}
	
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		int x=add(2,3);
		System.out.println(x);
		add(2,3,4);
		add(2.0,4.0);
	}

}
