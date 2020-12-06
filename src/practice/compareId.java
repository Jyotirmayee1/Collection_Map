package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class compareId {

	public static void main(String[] args) {
		
		List<Person>personDetails= new ArrayList<>();
		personDetails.add(new Person("Jyoti",3));
		personDetails.add(new Person("Rakhi",2));
		personDetails.add(new Person("Ishi",1));

	System.out.println(" Person details : ");
	
	Comparator<Person>comp=  new Comparator<Person>() {

		@Override
		public int compare(Person p1, Person p2) {
		if(p1.getId()<p2.getId()) 	
		return -1;
			return 1;
		}	
	};
	Collections.sort(personDetails,comp);
	for(Person p: personDetails) {
		System.out.println(p);
	}
	
	}

}
