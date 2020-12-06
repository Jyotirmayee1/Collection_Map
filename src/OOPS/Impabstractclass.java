package OOPS;

public class Impabstractclass extends  AbstractClass  {

@Override
public void sport() {
System.out.println("I like Cricket .");	
}
	public static void main(String[] args) {
		Impabstractclass Ia=new Impabstractclass();
	    Ia.dance();
	    Ia.sport();
	    Ia.food();
}
}