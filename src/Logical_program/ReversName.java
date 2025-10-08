package Logical_program;

public class ReversName {

	public static void main(String[] args) {
		// String revers program logical
		String name = "shabaz";
		int leng = name.length();
		String rev="";
		for(int i = leng-1 ;i >= 0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}

