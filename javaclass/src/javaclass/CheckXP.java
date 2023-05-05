package javaclass;
import java.util.Scanner;

public class CheckXP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		String st = isCheckXP(n);
		if(st.equals("Xylem"))
			System.out.println("it is a xylem number");
		else
			System.out.println("it is a phloem number");
		
	}
	
	static String isCheckXP(int n) {
		int as=0;
		int ms=0;
		as=n%10;
		n=n/10;
		
		while(n>9)
		{
			
			
			ms=ms+n%10;
			n=n/10;
		}
		as=as+n;
		
		if(ms==as)
			return "Xylem";
		
		else
			return "phloem";
	}

}
