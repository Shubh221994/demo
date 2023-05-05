package javaclass;

public class X {
	private double a;
	private float b;
	private String name;
	private int c;
	private long d;
	
	X(double a,float b,String name,int c,long d)
	{
		this.a=a;
		this.b=b;
		this.name=name;
		this.c=c;
		this.d=d;
	}
	
	void xdetails()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
		System.out.println(c);
		System.out.println(d);
	}
	
	public double getA()
	{
		return a;
	}
	
	public void setA(double a)
	{
		this.a=a;
	}
	
	public float getB()
	{
		return b;
	}
	
	public void setB(float b)
	{
		this.b=b;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getC()
	{
		return c;		
	}
	
	public void setC(int c)
	{
		this.c=c;
	}
	
	public long getD()
	{
		return d;
	}
	
	public void setD(long d)
	{
		this.d=d;
	}
	
}
