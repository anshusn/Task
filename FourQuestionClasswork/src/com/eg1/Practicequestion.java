package com.eg1;
import java.lang.Math;
import java.util.Scanner;

public class Practicequestion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		//1.Given a website address as a string, extract the domain name. For example, 
		//if the website address is "https://en.wikipedia.org/wiki/Main_Page", 
		//then it should return "en.wikipedia.org" as the domain name.

		String s="https://en.wikipedia.org/wiki/Main_Page";
		s=s.replaceAll("https://","");
		s=s.replaceAll("/wiki/Main_Page","");
		System.out.println(s);
		
		//4. Given a right angle triangle with sides a, b and c. As per Pythagoras theorem the
		//hypotenuse side c can be calculated as square root of a square plus b square. Write a
		//program to compute the hypotenuse, when a and b are provided.
		System.out.println("Enter the numbers: ");
		int a=Integer.parseInt(sc.nextLine());
		int b=Integer.parseInt(sc.nextLine());
		int c=(int) Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println(c);
		
		//3. Mass of earth is 5.972 x 10 power 24. Represent this value in a variable and print the same.
		float d1=(float)Math.pow(10, 24);
	    float d=(float)5.972 *d1;
		System.out.printf("%.0f",d);
		System.out.println();
		
		//2. Given a website address as a string, find out if the website is secure or not.
		//A website address starting with "http" is not secure and a website with "https" is secure.

		System.out.println("enter a site to check if it is secure or not: ");
		String s1=sc.nextLine();
		if(s1.startsWith("https")) {
			System.out.println("secure");
		}else if(s1.startsWith("http")) {
			System.out.println("not secure");
		}
	
	}

}
