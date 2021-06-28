package OneNote;

import java.util.ArrayList;

public class LambdaExpression {

	public static void main(String[] args) {
	ArrayList<Integer>li=new ArrayList<>();
	li.add(1);
	li.add(2);
	li.add(3);
	li.add(4); 
	//print number using lambda expression
   li.forEach((n)->{System.out.println(n);});

	}

}
