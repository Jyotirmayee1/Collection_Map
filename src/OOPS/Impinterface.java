package OOPS;

public class Impinterface implements  InterfaceDemo, InterfaceDemo1 {
 

   int c;
	@Override
	public int add(int x, int y) {
	return c=x+y;
	
		
	}

	@Override
	public int substract(int x, int y) {
		return c=x-y;
		
	}

	@Override
	public int multiply(int x, int y) {
		return c=x*y;
		
	}

	@Override
	public int divide(int x, int y) {
		return c=x/y;
		
	}

public static void main(String[] args) {
	 InterfaceDemo ID=new Impinterface();
	int add= ID.add(10, 5);
	int sub= ID.substract(10, 5);
	int multi= ID.multiply(10, 5);
	int div= ID.divide(10, 5);
System.out.println(add+" "+sub+" "+multi+" "+div);
	}
	
}
