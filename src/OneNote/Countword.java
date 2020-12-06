package OneNote;

import java.util.HashMap;
import java.util.Map;

public class Countword {
	public static void countword(String input) {
		Map<String,Integer> count=new HashMap<>();
		String str[]=input.split(" ");
		for(String s:str) {
			if(count.containsKey(s)) {
			 count.put(s,count.get(s)+1);
			}
			else count.put(s,1);
		}
System.out.println(count);
	}
	public static void main(String[] args) {
		countword("this this is is new");
	}
}
