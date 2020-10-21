package OneNote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapPerson {

	public static void main(String[] args) {
//2. Create a Person Class with name and id. Use collections to add data then sort them using id or name. 
	 List<person> personInfo=new ArrayList<>();
	 personInfo.add(new person("Aaa",2));
	 personInfo.add(new person("Bbb",3));
	 personInfo.add(new person("Ccc",1));
	 System.out.println("print the information details: "); 
/* Iterator<person>it= personInfo.iterator();
	 while(it.hasNext()) {
	 System.out.println(it.next());}*/
	 Comparator<person>com=new Comparator<person>() {

		@Override
		public int compare(person p1, person p2) {
			// TODO Auto-generated method stub
			if(p1.getId()<p2.getId())
				return -1;
			return 1;
			
			
		}
		};
		Collections.sort(personInfo,com ) ;
		for(person P:personInfo) {
			System.out.println(P); 
	}
		}
	}

	

