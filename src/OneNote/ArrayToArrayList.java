package OneNote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

public static void main(String[] args) {
//String arr[]= {"Apple","Orange","Grapes"};
		List<String>fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Grapes");
		//converting arraylist to array
		String []fruitsArr= fruits.toArray(new String[fruits.size()]);
		for(String list:fruitsArr) {
			System.out.println(list);
		}
		List<String>fruit2=new ArrayList<>();
		fruit2=Arrays.asList(fruitsArr);
		System.out.println(	fruit2);
	}

}
