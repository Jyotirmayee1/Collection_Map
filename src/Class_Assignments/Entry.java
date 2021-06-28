package Class_Assignments;

public class Entry {

	public static void main(String[] args) {

		//Vihicle vh=new Vihicle();
		Bike b=new Bike();
		//b.Start(v);
		try {
		Car c=new  Car();
		c.Start(b);}
		catch(Exception e) {
		System.out.println("Error message");
		}
		finally {System.out.println("final block executed");}
	}

}
