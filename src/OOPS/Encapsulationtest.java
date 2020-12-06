package OOPS;

public class Encapsulationtest {

	public static void main(String[] args) {
		EncapsulationDemo1 ED= new EncapsulationDemo1();
		ED.setname("Ishi");
		ED.setId(001);
		ED.setdept("Physics");
		ED.sethostelNo(2);
		System.out.print(ED.getname()+" "+ED.getnId()+" "+ED.getdept()+" "+ED.gethostelNo());
	}
}
