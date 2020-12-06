package OneNote;

import java.util.Arrays;

public class Duplicatenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1, 8,3, 2, 8, 3, 10};
		Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		System.out.println("duplicate num");
		for(int i=0;i<a.length-1;i++) 
			if(a[i]==a[i+1]) 
				System.out.println(a[i]);
	}

}
