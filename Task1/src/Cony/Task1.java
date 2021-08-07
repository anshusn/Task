package Cony;

public class Task1 {
	public static void main(String[] args) {
		//1.find all the palindrome in one array
		int[] ar= {121,345543,675,323,767,878};
		int d=0;
		int a,b;
		for(int i=0;i<ar.length;i++) {
			a=ar[i];
			while(a>0){
			b=a%10;
			a=a/10;
			d=(d*10)+b;
			}
			if(ar[i]==d) {
				System.out.println(ar[i]+" is a palindrome");
			}
			b=0;
			d=0;
		}
	}
}

