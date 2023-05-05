package javaclass;
import java.util.Scanner;

public class ExecutionIcici {

	public static void main(String[] args) {
		
		ICICI ob=new ICICI(1234,33991509649l,900000d,"Rupesh bhumihar");
		
		//ICICI oc=new ICICI(1235,4391509649l,100000d,"Salomi");
		Scanner sc = new Scanner(System.in);
			do {
				System.out.println("enter your option: 1.Withdrawl  2.Balance enquiry  3.Pin change");
				int option=sc.nextInt();
				
				switch(option)
				{
				case 1:ob.withdrawnMoney();
				      // oc.withdrawnMoney();
				break;
				case 2:ob.checkBalance();
				     //  oc.checkBalance();
				break;
				case 3:ob.changePin();
				      // oc.changePin();
				break;
				default: 
					System.out.println("invalid option");
				}
			}while(true);
		}	

	}


