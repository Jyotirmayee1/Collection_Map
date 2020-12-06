package OneNote;

public class Elseifarray {
	public static void main(String[] arg ) {
		//Write code: array of int from 1 to 20 ; if element can be divided by 3 -print -x;if divided by 5 ;
		//print y; if divided by 5 and 3 print xy; intfor other print element 
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	     for(int i=0;i<a.length;i++) {
	    	 
	    	 if (a[i]%3==0 && a[i]%5==0 ){ 
	    		 
	     		System.out.println(a[i]+" = xy");}
	    	 else if(a[i]%3==0) {
	    		System.out.println(a[i]+" = x");}
	    	
	    	else if(a[i]%5==0) {
	    		System.out.println(a[i]+" = y");}
	    	else System.out.println(a[i]+"= none");
	
	     }

		  }
}
