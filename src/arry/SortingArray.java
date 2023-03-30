package arry;

public class SortingArray {
public static void main(String[] args) {
int arr[]= {2,1,4,3,6,5,8,7};
for(int i=0;i<arr.length;i++) {//1st curser
	for(int j=i+1;j<arr.length;j++) {//2nd curser
		if(arr[i]>arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
}
}
