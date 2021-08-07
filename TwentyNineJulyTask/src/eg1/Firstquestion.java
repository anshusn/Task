package eg1;

import java.util.Scanner;

public class Firstquestion {

	public static void main(String[] args) {
		//1.convert everyword last letter to upper case
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1=sc.nextLine();
		System.out.println(LastLetterUpperCase(s1));
		}
	public static String LastLetterUpperCase(String s) {
		StringBuilder sb=new StringBuilder();
		String ar[]=s.split(" ");
		for(int i=0;i<ar.length;i++) {
			sb.append(ar[i].substring(0,ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
		}
		return sb.toString().trim();
	}
}
