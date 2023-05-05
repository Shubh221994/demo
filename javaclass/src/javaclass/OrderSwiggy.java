package javaclass;

public class OrderSwiggy {
	String custName;
	String food;
	String drink;
	String grocery;
	
	OrderSwiggy(String custName, String food, String drink, String grocery){
		this.custName=custName;
		this.food=food;
		this.drink=drink;
		this.grocery=grocery;
	}
	
	OrderSwiggy(String custName, String food, String grocery){
		this(custName, food, null, grocery);
	}
	
	OrderSwiggy(String custName, String drink){
		this(custName, null, drink, null);
	}
	void display() {
		System.out.println(custName);
		System.out.println(food);
		System.out.println(drink);
		System.out.println(grocery);
	}
	
	public static void main(String[] args) {
		OrderSwiggy o1=new OrderSwiggy("Ram", "Paratha", "OldMonk", "Aata");
		OrderSwiggy o2=new OrderSwiggy("Rama", "AloParatha", "CornAata");
		OrderSwiggy o3=new OrderSwiggy("Ramas", "OldMonk");
		o1.display();
		o2.display();
		o3.display();
	}

}
