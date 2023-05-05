package javaclass;
import java.util.Scanner;

public class TwoDimensionalEx1 {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements");
		
		int a[][] = new int[3][4];
		
		for(int i=0;i<a.length;i++)  //outer for loop for rows
		{
			for(int j=0;j<a[i].length;j++)  //inner for loop for columns
			{
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("printing array to output window");
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
