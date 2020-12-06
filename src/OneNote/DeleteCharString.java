package OneNote;

class DeleteCharString {

	public static void main(String[] args) {
		/*String str1=" Hello, How are you?";
		str1=str1.substring(0, str1.length()-4);
		System.out.println(str1);*/
		
	    String s="Hello, How are you?";
	    String rev="";
	    String s1[]=s.split("");
	    for(int i=s1.length-1;i>=0;i--) {
	    	rev=rev+s1[i]+"";
	    }
	    System.out.println(rev);
	   String  rev1=rev.substring(0,rev.length()-6);
	   System.out.println(rev1);
	}
}
