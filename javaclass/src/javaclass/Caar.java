package javaclass;
//super class
public class Caar {
	public String wheelStatus;
	public int noOfWheels;
	
	// the Car class has one constructor
	public Caar(String wheelStatus, int noOfWheels) {
		this.wheelStatus=wheelStatus;
		this.noOfWheels=noOfWheels;
	}
	
	// the Car class has three methods
	public void applyBrake() {
		wheelStatus= "Stop";
		System.out.println("Stop the car using the Brake");
	}
	
	// toString() method to print info of Car
	public String toString() {
		return ("No. of whells" + noOfWheels + "\n" + "Status of wheels" + wheelStatus);
	}
	

}
