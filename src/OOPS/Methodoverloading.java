package OOPS;

public class Methodoverloading {
	int c;
public int add(int x,int y){
	return c=x+y;
}
public int add(int x,int y,int z){
	return c=x+y+z;
}
public static void main(String[] args) {
	Methodoverloading  Mo=new Methodoverloading ();
	int a=Mo.add(5, 5);
	int c=Mo.add(15, 5);
	int b=Mo.add(5,10,5);
	System.out.println(a+" "+c);
	System.out.println(b);

	}
}
