package javaclass;
import java.util.Scanner;

public class MainStr1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String st=sc.nextLine();
		int sp=countSpecial(st);
		System.out.println("no. of special character:"+sp);// TODO Auto-generated method stub
     
	}
static int countSpecial(String str)
{
	int count =0;
	for(int i=0; i<str.length(); i++)
	{
		char ch=str.charAt(i);
		if (ch>='A'&& ch<='Z'|| ch>='a'&& ch<='z'|| ch>=0 && ch<=9)
		continue;
		else
			count++;
		
	}
	return count;
}
}