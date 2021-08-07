package Cony_h;

public class Task9 {
	public static void main(String[] args) {
		//9.print the number which is occurring highest number of times in array
		//10.print the 2nd highest number in array (there will be duplicates)
		int[] arr= {1,2,3,2,4,2,5,5,5,5,5};
		int[] fr=new int[arr.length];
		int visited=-1;
		for(int i=0;i<arr.length;i++) {
		int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited){
				fr[i]=count;
			}
		}int max=fr[0];
		int num=arr[0];
		for(int i=0;i<fr.length;i++) {
			if(fr[i]!=visited) {
				if(fr[i]>max) {
					max=fr[i];
					num=arr[i];
				}}}
				System.out.println("the number "+num+" appeared highest number of times in the given array");
		//10.	
		for(int i=0;i<fr.length-1;i++) {
			for(int j=i+1;j<fr.length;j++) {
				if(fr[i]<fr[j]) {
					int temp=fr[i];
					fr[i]=fr[j];
					fr[j]=temp;
					int temp1=arr[i];
					arr[i]=arr[j];
					arr[j]=temp1;
					}
				}
			}
			System.out.println("the number which appear 2nd highest number of times in given array is: "+arr[1]);
		
}
}