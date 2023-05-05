package javaclass;

public abstract class PhonePe {
	long accno;
	int pin;
	double balance;
	
	PhonePe(long accno,int pin,double balance)
	{
		this.accno = accno;
		this.pin = pin;
		this.balance =  balance;
	}
	 
	abstract void view();

}
