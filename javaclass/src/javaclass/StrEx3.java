package javaclass;

public class StrEx3 {

	public static void main(String[] args) {
		
		String s="Thiruvanathapuram";
		
		//1-length()- finds length of the string
		System.out.println(s.length()); 
		
		//2-substring() method
		// to get the required spelling from the given index position
		System.out.println(s.substring(2));
		
		

		//3-charAt() method- returns character at required position
		System.out.println(s.charAt(5));
		
		//4-indexOf() - return position of a character
		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf('H')); // if the char is not present in string it will return -1.
		
		//5-substring(Start index,last index)
				//it is an overloaded method.
						//the last index will not print because of lastindex-1
				System.out.println(s.substring(1,5));
				
		//6-toUpperCase() method-convert full String in upper case
		System.out.println(s.toUpperCase());
		
		//7-toLowerCase() method-convert full String in lower case
		System.out.println(s.toLowerCase());
		
		
		String s1="utsav";
		String s2="Utsav";
		
		//8-equals() method-comparing one string to another string.
		System.out.println(s1.equals(s2)); //java is case sensitive language
		//9-equalsIgnoreCase() method -compare one string to another string but ignore alphabets case.
		System.out.println(s1.equalsIgnoreCase(s2));
	}

}
