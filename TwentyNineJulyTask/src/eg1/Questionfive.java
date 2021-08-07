package eg1;

import java.util.Scanner;

public class Questionfive {

	public static void main(String[] args) {
		//5)Take array as input remove the digits where the first value and last value is same
		 // eg [101,22,344,699]-> in this 101 and 22 should be removed because the first digit and last is same
		 //so output will be [344,699]
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter an array: ");
		String ar[]=new String[n];
		for(int w=0;w<n;w++) {
			ar[w]=sc.nextLine();	
		}
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ar.length;i++) {
			if(ar[i].charAt(0)==ar[i].charAt(ar[i].length()-1)) {}
			else {
			sb.append(ar[i]).append(" ");
		}
		}
	 System.out.println(sb.toString().trim());
	}

}
