package OOPS;

public class EncapsulationDemo {
private String name;
private int Id;


public static void main(String[] args) {
	EncapsulationDemo ed= new EncapsulationDemo();
	String Name=ed.setName("Jyoti");
	int id=ed.setid(1);
	System.out.println("Name is "+Name);
	System.out.println("Id is "+id);

	}

@Override
public String toString() {
	return "EncapsulationDemo [name=" + name + ", Id=" + Id + "]";
}

public String getName() {
	return name;
}

public String setName(String name) {
	return this.name = name;
}
public int geId() {
	return Id;
}

public int setid(int id) {
	return this.Id = id;
}
}
