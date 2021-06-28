package OneNote;

public class divisibleByInt {
//Java coding was there print number between 1 to 100 which are only devided by 3, 5,15,30 
public static void main(String args[]){ 
	int num=100;
	for(int i=1;i<=num;i++) {
		if((i%3==0)&& (i%5==0) &&(i%15==0)&&(i%30==0))
			System.out.println(i);
	}

}
}
