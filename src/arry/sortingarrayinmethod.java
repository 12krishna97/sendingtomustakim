package arry;

import java.util.Scanner;

public class sortingarrayinmethod {
	
	public static int[] method(int b[]) {
		for(int k=0;k<b.length;k++) {
			for(int j=k+1;j<b.length;j++) {
				if(b[k]>b[j]) {
			 int temp =b[k];
				b[k]=b[j];
				b[j]=temp;
				}
			}
		}
		return b;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("enter the values: ");
		for(int i = 0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	int result[]=	method(arr);
	for(int i=0;i<result.length;i++) {
		System.out.print(result[i]+" ");
	}
	}

}
