package OneNote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(2,2,1,3,4,5,6,1,78,5,8);
		Set<Integer>list1=new LinkedHashSet<>(list);
		System.out.println(list1);
		ArrayList<Integer>uniq=new ArrayList<>(list1);
		//Collections.sort(uniq);
		System.out.println(uniq);
}
}