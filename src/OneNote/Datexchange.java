package OneNote;

public class Datexchange {

	public static void main(String[] args) {
		//input	08/03/2020
		//output 03/08/2020
		String  s="08/03/2020";
		String[] s1=s.split("/");
		String temp;
			temp=s1[0];
			s1[0]=s1[1];
			s1[1]=temp;
			for(int i=0;i<s1.length;i++) {	
				System.out.print(s1[i]);
				if(i<2) {
			System  .out.print( "/");
		}
		  }
	}
}
