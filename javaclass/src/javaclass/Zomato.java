package javaclass;

public class Zomato extends PhonePe implements GoogleMap {
	
	String username;
	long contact;
	Zomato(String username,long contact,long accno,int pin,double balance)
	{
		super(accno,pin,balance);
		this.username = username;
		this.contact = contact;
	}
	
 


	void payment() {
		System.out.println("payment");
	}



	@Override
	public
	void view() {
		System.out.println(username);
		System.out.println(contact);
     		
		
	}
	

}
