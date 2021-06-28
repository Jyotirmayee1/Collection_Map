package OneNote;
import java.util.HashMap;
import java.util.Map;
public class occuranceOfSingleChar {
	
	public static void charcount(String input, char ch) {
		 //input="Sukhwinder Kaur";
		 int count=0;
		 for(int i=0;i<input.length();i++){
		 if(input.charAt(i)==ch){
			 count++; 
		 }
		 
	}System.out.println(count);
		 }
 
	public static void main(String[] args) {
		String str="Sukhwinder Kaur";
		String str1=str.toLowerCase();
		char ch='k';
		charcount(str1,ch);
	}

}

/* Diffrent approach
 * public static  void main(String[]arg) {
	//String s="Sukhwinder Kaur";
    String s="Jyotirmayee Naik";
	String s1=s.toLowerCase();
    int  count=0;
	for(int i=0;i<s1.length();i++) {
		if(	s1.charAt(i)=='e') {
	    count++;	
		}
	}
	System.out.println("e is presen "+count +" times");
 }
}
	*/
