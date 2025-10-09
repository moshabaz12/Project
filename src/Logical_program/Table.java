package Logical_program;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
try (//		Multiple table in java
		Scanner s = new Scanner(System.in)) {
			System.out.println("Enter_no");
			int no = s.nextInt();
			for (int i = 2; i <= 10; i++) {
				System.out.println(no + "*" + i + "=" + no * i);
			}
		}
	}


}
