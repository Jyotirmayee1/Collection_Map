package OneNote;

import java.util.Arrays;

public class createTwoArray2 {

	public static void main(String[] args) {
		//Create two int arrays, merge them and sort them into one array 
 int a1[]= {1,7,9,4,5};
 int a2[]= {6,7,11,8,9,13,12,10};
 int len1=a1.length;
 int len2=a2.length;
 int len3 =len1+len2;
 int c[]= new int[len1+len2];
//create  a loop n put the value of a1 in c
 for(int i=0;i<len1;i++) {
	c[i]=a1[i];
	
 }
 //create  a loop n put the value of a2 in c and c has already have the value of a1
 for(int i=0;i<len2;i++) {
		c[len1+i]=a2[i];
		
	 }
 //Create a for loop and print the value of C
 //for(int i=0;i<len3;i++) {
	//	System.out.print(c[i]+" ");
	
	//	 Arrays.sort(c);
 int temp;
 for(int i=0;i<c.length;i++) {
   	//compare between two index  
   	for(int j=0;j<c.length-1;j++) {
   		//swap the element if fast element is greater than element of 2nd index
   		if(c[j]>c[j+1]) {
   			temp=c[j];
   			c[j]=c[j+1];
   			c[j+1]=temp;
   		} 			
   	}
   
	    }
   	 for(int i=0;i<c.length;i++) {
   		System.out.print(c[i]+" ");}

	 }



}
