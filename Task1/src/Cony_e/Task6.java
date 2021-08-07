package Cony_e;

public class Task6 {
	static boolean Task(String s) {
		//6.find if all the vowels in a proper order of aeiou is present in string or not		
		
		int n=s.length();
		char c=(char)64;
		for(int i=0;i<n;i++) 
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'
			|| s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				if(s.charAt(i)<c) 
				{
					return false;
				}else
				{
					c=s.charAt(i); 
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s="trhdaekyigonut";
		if(Task(s))
		{
			System.out.println("yes all vowels are in proper order of aeiou in the string.");
	    }else
	    {
		System.out.println("no all vowels are not in proper order of aeiou in the string.");
	    }
	}
}
