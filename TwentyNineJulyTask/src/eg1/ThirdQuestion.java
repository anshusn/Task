package eg1;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdQuestion {
		//3.in every word if it is not pallindrome then reverse it and print back the whole sentence
		public static String ConvertTitleCase(String s) {
			StringBuilder sb=new StringBuilder();
			StringBuilder sb1=new StringBuilder();
			
			String[] ar=s.split(" ");
			for(int i=0;i<ar.length;i++) {
				if(new StringBuilder(ar[i]).reverse().toString().equals(ar[i])) { 
					sb.append(ar[i]).append(" ");
				}else {
					sb1.append(ar[i]).reverse().append(" ");
					sb.append(sb1);
				}
				
			}
			return sb.toString().trim();
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your string: ");
			String s1=sc.nextLine();
			System.out.println(ConvertTitleCase(s1));
			}
		}
