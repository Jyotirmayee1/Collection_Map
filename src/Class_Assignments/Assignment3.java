package Class_Assignments;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[]a=new int[size];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int x:a) {
			sum=sum+x;
		}
		System.out.println(sum);
}
}