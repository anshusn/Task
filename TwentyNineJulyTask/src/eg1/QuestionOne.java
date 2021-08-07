package eg1;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionOne {
    //.1)Find Nth  max in array, remember it will have duplicates
	public static int NthMaxInArray(int[] ar,int a) {
	int[] fr=new int[ar.length];
	int visited=-1;
	for(int i=0;i<ar.length;i++) {
	int count=1;
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]==ar[j]) {
				count++;
				fr[j]=visited;
			}
		}
		if(fr[i]!=visited){
			fr[i]=count;
		}
	}int max=fr[0];
	int num=ar[0];
	for(int i=0;i<fr.length;i++) {
		if(fr[i]!=visited) {
			if(fr[i]>max) {
				max=fr[i];
				num=ar[i];
			}}}
			//System.out.println("the number "+num+" appeared highest number of times in the given array");
			for(int i=0;i<fr.length-1;i++) {
				for(int j=i+1;j<fr.length;j++) {
					if(fr[i]<fr[j]) {
						int temp=fr[i];
						fr[i]=fr[j];
						fr[j]=temp;
						int temp1=ar[i];
						ar[i]=ar[j];
						ar[j]=temp1;
						}
					}
				}
				//System.out.println("the number which appear 2nd highest number of times in given array is: "+arr[1]);
			return ar[a-1];
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,7,7,6,6,7,4,7,5,5,5,5,5};
		System.out.println("the given array is: "+Arrays.toString(arr));
		System.out.println("enter nth value: ");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("the number which is "+n+"th max in array is: "+NthMaxInArray(arr,n));

	}

	}
