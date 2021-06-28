package OneNote;

public class SumINT {
	public static void main(String[] args) {
		//sum of two int =12
		int arr[]= {5,6,7,23,2,0,8,4};

		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==12) {
				System.out.println(arr[i]+" "+arr[j]);
			}
			}
		}
	}}

