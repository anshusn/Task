package eg1;

import java.util.Arrays;

public class Questiontwo {

	public static void main(String[] args) {
		//2)Take an array and remove all duplicates in it
		int[] ar= {1,2,2,3,2,4,5,6,7,4};
		System.out.println("Initial Array is: ");
		System.out.println(Arrays.toString(ar));
		int[] dp=new int[ar.length];
		int visited=-1;
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					dp[j]=visited;
				}
			}
			if(dp[i]!=visited) {
				dp[i]=ar[i];
			}
			
		}
		System.out.println("after removing the duplicates in array: ");
		System.out.println("________________________________________");
		for(int i=0;i<dp.length;i++) {
			if(dp[i]!=visited) {
			System.out.print(dp[i]+ ", ");
			}
		}
	}

}
