package javaclass;

public class Q extends P{
	float a=15.2f;
	
	public void print() {
		int a=111;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(P.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		Q q=new Q();
		q.print();
	}

}
