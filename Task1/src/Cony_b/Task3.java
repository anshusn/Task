package Cony_b;

public class Task3 {
	public static void main(String[] args) {
		//find average of even and odd number in one array
		int[] ar= {1,2,3,4,5,6,7,8};
		int even=0;
		int odd=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				even+=ar[i];
			}else if(ar[i]%2!=0) {
				odd+=ar[i];
			}
		}
		int avg=(even+odd)/2;
		System.out.println("the avergae of even and odd number in one array is "+avg);
	}
}
