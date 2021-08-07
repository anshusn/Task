package eg1;

public class Questionfour {

	public static void main(String[] args) {
		// 4)Find all prime numbers in array
		int[] ar= {2,4,5,3,6,7,11,8};
		int count;
		for(int i=0;i<ar.length;i++) {
			count=0;
			for(int j=1;j<=ar[i];j++) {
				if(ar[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(ar[i]+" is a prime number ");
			}
		}
		
	}
}
