package eg1;

import java.util.Scanner;

public class SecondQuestion {
		//2.if the word is of odd length then convert middle letter to upper case else convert first letter to upper case
	    public static String ConvertTitleCase(String s) {
	    	String ar[]=s.split(" ");
	    	StringBuilder sb=new StringBuilder();
	    	for(int i=0;i<ar.length;i++) {
	    		if(ar[i].length()%2!=0) {
	    		sb.append(ar[i].substring(0,ar[i].length()/2)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()/2))).
	    		append(ar[i].substring(ar[i].length()/2+1,ar[i].length())).append(" ");
	    		}else {
	    		sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
	    	   }
	    	}
	        	return sb.toString().trim();
	        }
	    	public static void main(String[] args) {
	    		Scanner sc=new Scanner(System.in);
	    		System.out.println("Enter your String: ");
	    		String s1=sc.nextLine();
	    		System.out.println(ConvertTitleCase(s1));
	    		
	    	}

	}
