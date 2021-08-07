package Cony_c;

public class Task4 {
	public static void main(String[] args) {
		//4.find the characters of a string which are in prime index position and print them in upper case 
		String st="youareacutekitty";
		StringBuilder sb=new StringBuilder();
		for(int i=2;i<st.length();i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
			if(count==2) {
				sb.append(Character.toUpperCase(st.charAt(i)));
			}
	}
		System.out.println(sb.toString());
	}
}
