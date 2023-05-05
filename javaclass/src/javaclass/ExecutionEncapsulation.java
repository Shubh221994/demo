package javaclass;

public class ExecutionEncapsulation {

	public static void main(String[] args) {
		EXecution e=new EXecution(10);
		System.out.println(e.getValue());
		e.setValue(25);
		System.out.println(e.getValue());

	}

}
