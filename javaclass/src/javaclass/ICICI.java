package javaclass;
import java.util.Scanner;

public class ICICI extends RBI implements ATM {
private int pin;
public int getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = pin;
}


long acntno;
double balance;
String name;


   ICICI(int pin,long acntno,double balance,String name)
   {
	   this.pin=pin;
	   this.acntno=acntno;
	   this.balance=balance;
	   this.name=name;
   }
   


	public void withdrawnMoney() {
	     System.out.println(" Enter the PIN");
         Scanner sc = new Scanner(System.in); 
			int pin=sc.nextInt();
			 if(this.pin==pin) {
			  System.out.println("ENTER THE AMOUNT:");
			 double amount=sc.nextDouble();
              
			 if(amount<balance) {
			 balance=balance-amount;
			 System.out.println("Remaining balnce: "+ balance);}
			 else {
				 System.out.println("Insufficient balance");
			 }
			 }
			 else
				 System.out.println("ENTERED VALID PIN:");
		}
         
	

	@Override
	public void checkBalance() {
	System.out.println("ENTER PIN:");
	Scanner sc = new Scanner(System.in); 
		int pin=sc.nextInt();
		if(this.pin==pin)
		{
			System.out.println("AVAILABLE BALANCE IS: "+balance);
		}
		else
			System.out.println("ENTER VALID PIN");
	}
	
	

	@Override
	public void changePin() {
		System.out.println("ENTER YOUR OLD PIN:");
		Scanner sc = new Scanner(System.in);
			int pin=sc.nextInt();
			if(this.pin==pin)
			{
				System.out.println("ENTER NEW PIN:");
				int newpin=sc.nextInt();
			   this.pin=newpin;
			   
			   System.out.println("UPDATED SUCCESSFUL");
			}
			else
			{
				System.out.println("ENTER VALID PIN");
			}
		}
	

	@Override
	void showLoanInterestRate() {
		System.out.println("Interest Rate is 9.2%");
		
	}

	@Override
	void showDepositRate() {
		System.out.println("deposit rate is 7.2%");
		
	}
	

}
