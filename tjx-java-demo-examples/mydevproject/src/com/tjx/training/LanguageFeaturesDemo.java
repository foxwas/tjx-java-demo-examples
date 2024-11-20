package com.tjx.training;

public class LanguageFeaturesDemo {

	public static void main(String[] args) {
		
		byte b1=12;
		short s1=1221;
		
		int i1=1212111;
		long l1 = 111111111112221L;
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		
		float f1 = 3.1F;
		
		double d1 = 3.1;
		
		System.out.println(f1);
		System.out.println(d1);
		
		
		boolean isMale = false;
		boolean isEmployed = true;
		
		System.out.println(isMale);
		System.out.println(isEmployed);
		
		if(isEmployed) {
			//run payroll
		}
		
//		char c1 = 'B';
//		char c2 = '\u0042';
//		char c3 = 42;
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
		
		
		//char c4 = '\x'; Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )

		/*
		 * String name = "saravanan"; System.out.println(name);
		 * 
		 * String teacher = "sa\tra\nva\bna\nn"; System.out.println(teacher);
		 * 
		 * int decimal = 20; int octal = 020; int hexadecimal = 0x20; int binary= 011;
		 * 
		 * System.out.println(decimal); System.out.println(octal);
		 * System.out.println(hexadecimal); System.out.println(binary);
		 */


		String firstName = "Lisa";
		String lastName = "Cueva";

		String webAgeContact = firstName + " " + lastName;
		System.out.println(webAgeContact);

		
		
	String contact = new String ("Lisa Cueva");
	System.out.println(contact);
		
		
		
		
		
		

	}

}
