package OneNote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MergeTwoCollection {

	public static void main(String[] args) {
	/*List<Integer>l1=new ArrayList<>();
    l1.add(8);
    l1.add(18);
    l1.add(28);
    List<Integer>l2=new ArrayList<>();
    l1.add(7);
    l1.add(17);
    l1.add(27);
    List<Integer>l=new ArrayList<>();
    l.addAll(l1);
    l.addAll(l2);
    for(Integer all: l) {
    	System.out.println(all);
    	*/
	int a1[]= {5,6,4,2,3};
	int a2[]= {51,62,14,12,377};
	 List<Integer>l1=Arrays.asList(5,6,4,2,3);
	 List<Integer>l2=Arrays.asList(51,62,14,12,377);
	 List<Integer>list =new ArrayList<>();
	 list.addAll(l1);
	 list.addAll(l2);
	 Collections.sort(list);
	 for(Integer merge: list) {  
		 System.out.print(merge+" ");
	 }
	
  	  }
		}


