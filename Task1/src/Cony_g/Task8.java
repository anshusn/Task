package Cony_g;

import java.util.Arrays;

public class Task8 {
	public static void main(String[] args) {
		//8.remove all duplicate character from a string
		String str="ilovetotravel";
		
		char[] ch=str.toCharArray();
		int n=0;
		for(int i=0;i<ch.length;i++) {
			int j;
		for(j=0;j<i;j++) {
			if(ch[i]==ch[j]) {
				break;
				}
			}
		if(j==i) {
			ch[n++]=ch[i];
			}}
		System.out.println(String.valueOf(Arrays.copyOf(ch, n)));
	}
}
