package Cony_d;

public class Task5 {
	public static void main(String[] args) {
		//5.find if all vowels are present in string or not
		String st="You are eating mango";
		st.toLowerCase();
		StringBuffer sb=new StringBuffer(st);
		char[] vowels= {'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<sb.length();i++) {
			for(int j=0;j<vowels.length;j++) {
			if(vowels[j]==(sb.charAt(i))){
				count++;
			}
		}}
		if(count>=5) {
			System.out.println("yes all vowels are present in string.");
		}else {
			System.out.println("no not all vowels are present in string.");
		}
	}
}
