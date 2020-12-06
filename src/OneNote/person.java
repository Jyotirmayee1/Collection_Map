package OneNote;

public class person implements Comparable<person> {
private String name;
private int id;
public person(String Name, int Id) {
super();
this.id=Id;
this.name=Name;
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
public int compareTo(person ps) {
	//compare the id between two student
if(id<ps.id)
	return -1;
	else if(id>ps.id)
	return 1;
	return 0;
		} 

	public String toString() {
		String result=" Person Name: "+name+" Id: "+id;
		return result;
		}
}
