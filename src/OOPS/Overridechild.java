package OOPS;

public class Overridechild extends Overideparent {

	public void dance() {
		super.dance();
		System.out.println(" I like hiphop");
		}
	public void sports() {
		super.sports();
			System.out.println(" I like Succer");
		}
public static void main(String[] args) {
	Overridechild Op= new Overridechild();
			Op.dance();
			Op.sports();
	
	}

	}


