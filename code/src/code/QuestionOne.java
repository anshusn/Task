package code;

public class QuestionOne {

	public static void main(String[] args) {
		int[] ar= {2,1,1,1,4};
		//int[] ar= {2,3,1,1,4};
		//int[] ar= {3,2,1,0,4};
		int N=5;
		int count=0;
		int x=ar[0];
		for(int i=1;i<=x;i++) {
				int y=i;
				if(y==4) {
					count++;
				}else {
				for(int j=1;j<ar[y];j++) {
						int z=j;
						if(y+z==4) {
							count++;
						}else {
						for(int k=1;k<ar[z];k++){
								int p=k;
								if(y+z+p==4) {
									count++;
								}else {
								for(int l=1;l<ar[p];l++) {
										int q=l;
										if(y+z+p+q==4) {
											count++;
										}
									}
								}
							}
						}
					}
				}
		}if(count>=1) {
		System.out.println("true");
	}
		else {
			System.out.println("false");
		}

}
}