package javaclass;

import java.util.Arrays;

public class ArrayStoreAndAccess {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[1]=10;
		a[2]=50;
		a[0]=80;
		a[3]=45;
		a[4]=55;
		System.out.println(a[3]);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		addOfArrayElements(a);
		multiplicationOfArrayElements(a);
		int rs=getBiggest(a);
		System.out.println("biggest element is big "+rs);
	
		
		int bp=getSmallest(a);
		System.out.println("smallest is "+bp);
		int ps=primeArrayElement(a);
		System.out.println(ps);
		
		

	}
	



	private static int primeArrayElement(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			boolean c=isPrimeNumber(a[i]);
			if(c==true)
			  count++;
		}
		return count;
	}




	private static boolean isPrimeNumber(int i) {
		for(int j=2;j<i/2;j++)
		{
			if(i%j==0)
				return false;
		}
		return true;
	}




	public static int getSmallest(int[] a) {
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		return small;
	}


	public static int getBiggest(int[] a) {
		int big=a[0];
		for(int i=1;i<a.length;i++)
		{
			
			if(a[i]>big)
			{
				big=a[i];
			}
		}
		return big;
	}


	public static void multiplicationOfArrayElements(int[] a) {
		int prod=1;
		for(int i=0;i<a.length;i++)
		{
			prod=prod*a[i];
		}
		System.out.println(prod);
		
	}


	public static void addOfArrayElements(int[] a) {
		int sum=0;
		for(int j=0;j<a.length;j++)
		{
			sum=sum+a[j];
		}
		System.out.println(sum);
		}

}
