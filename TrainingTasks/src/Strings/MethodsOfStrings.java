package Strings;

public class MethodsOfStrings {

	public static void main(String[] args) {
		
		String string1="Datastructures";
		String string2="Algorithms";
		String string3="algorithms";
		String string4=new String("Heloo");
		
		String string5=string1.intern();
		System.out.println("intern(): "+string5);
		System.out.println(string2.startsWith("Algo"));
		
		//Returns the character at the specified index (position)
		char ch=string1.charAt(2);
		System.out.println(ch);
		
		//Compares two strings lexicographically
		System.out.println(string1.compareTo(string2));
		System.out.println(string1.compareTo(string1));
		System.out.println("comparing two strings of same values but differ in uppercase and lower case : "+string2.compareTo(string3));
		
		//An int value: 0 if the string is equal to the other string, ignoring case differences.
		System.out.println("comparing two strings of same values but differ in uppercase and lower case :"+string3.compareToIgnoreCase(string2));
		
		//equals method returns true /false
		System.out.println(string3.equals(string2));
		System.out.println("concatening two strings "+string3.concat(string1));
		
		//checks the character sequence
		System.out.println(string1.contains("stru"));
		
		//checks whether the string is ending with the given character sequence or not 
		System.out.println(string3.endsWith("hmsr"));
		System.out.println("length of the string: "+string3.length());
		
		
		
		
	}

}
