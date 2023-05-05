package javaclass;
import java.util.Scanner;


public class VendingDriver {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice 1 for coffee or 2 for tea");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			VendingMachine ob = new CoffeeVending(); //upcasted
			ob.addIngredient();
			ob.printProduct();
			CoffeeVending c = (CoffeeVending)ob; //downcasted
			c.wishC();
		}
		break;
		case 2:
		{
			VendingMachine x=new TeaVending(); //upcasted
			x.addIngredient();
			x.printProduct();
			TeaVending t = (TeaVending)x;  //downcasted
		    t.wishT();
		}
		break;
		default:System.out.println("invalid choice");
		}
		
		}

}
