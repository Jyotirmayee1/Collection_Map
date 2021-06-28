  package practice;

public class Person implements Comparable<Person>{
	private String name;
	private int id;
	public Person(String name, int id) {
		this.id=id;
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
 

@Override
public int compareTo(Person ps) {
	if(id<ps.id)
	return -1;
	if(id>ps.id)
		return 1;
	return 0;
}

public String toString() {
	String Result="Person Name: "+name+" & Id: "+id;
	return Result;}
}
