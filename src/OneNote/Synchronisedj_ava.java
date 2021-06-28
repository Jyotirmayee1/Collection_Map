package OneNote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Synchronisedj_ava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>Flist=new ArrayList<>();
		Flist.add("Mango");
		Flist.add("Apple");
		Flist.add("Grapes");
		Flist.add("Banana");
		Flist.add("Kiwi");
		System.out.println(Flist);
	 Flist=Collections.synchronizedList(Flist);
	// we must use synchronize block to avoid non-deterministic behavior  
	  synchronized(Flist){
		  Iterator<String>it=Flist.iterator();
		  while(it.hasNext()) {
			  System.out.println(it.next()); 
		  }
		 
	 }
	}


}
