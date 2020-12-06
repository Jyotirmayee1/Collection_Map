package OneNote;

import java.util.ArrayList;
import java.util.List;

public class BoxMain {

	public static void main(String[] args)
	{
		Box box1= new Box(1,2,3);
		Box box2= new Box(3,4,5);
		Box box3 = new Box(6,7,8);
		List<Box> arr=new ArrayList<Box>();
		arr.add(box1);
		arr.add(box2);
		arr.add(box3);
		int sum=0;
		for(int i=0;i<arr.size();i++)
		{
			Box box=arr.get(i);
			sum=sum+(box.getLength()*box.getHeight()*box.getWidth());
		}
		System.out.println("Sum:"+sum);
	}
}
