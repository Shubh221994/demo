package javaclass;
import java.util.Scanner;

public class MainStr2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String st=sc.nextLine();
		String rv=reverse(st);
		System.out.println("reverse of the string:"+rv);// TODO Auto-generated method stub
     
	}
static String reverse(String str)
{
	String rev="";
	for(int i=0; i<str.length();i++)
{
		rev=str.charAt(i)+rev;
}
	return rev;
}
}