package code;

public class ArrayQuestion {

	public static void main(String[] args) {
		/*
		 * You are given an integer array nums. You are initially positioned at the
		 * array's first index, and each element in the array represents your maximum
		 * jump length at that position.Return true if you can reach the last index, or
		 * false otherwise. Example 1: Input: nums = [2,3,1,1,4] Output: true
		 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
		 * Example 2: Input: nums = [3,2,1,0,4] Output: false Explanation: You will
		 * always arrive at index 3 no matter what. Its maximum jump length is 0, which
		 * makes it impossible to reach the last index.
		 */
		int N = 5;
		int[] ar = { 2, 3, 1, 1, 4 };
		//int[] ar= {3,2,1,0,4};
		int x = ar[0];
		int count = 0;
		for (int i = 1; i <= x; i++) {
			if (i < N) {
				int y = ar[i];
				if(y==ar[N-1]) {
					count++;
				}
				for (int j = 1; j <= y; j++) {
					if (i+j < N) {
						int z = ar[i + j];
						if (z == ar[N - 1]) {
							count++;
						}
					}
				}
			}
		}
		if (count >= 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}