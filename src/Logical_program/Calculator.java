package Logical_program;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter_First");
			int no1 =s.nextInt();
			System.out.println("Enter_Secound");
			
			int no2=s.nextInt();
			System.out.println("Select Seymbol(+,-,*,/,%)");
			String sym=s.next();
			int res;
			switch(sym) {
			case "+": res=no1+no2;
			System.out.println(res);
			break;
			case "-":res = no1-no2;
			System.out.println(res);
			break;
			
			case "*":res = no1*no2;
			System.out.println(res);
break;
			case "/": res = no1/no2;
			System.out.println(res);
			break;
			case "%": res = no1 %no2;
			System.out.println(res);
			break;
			
			
			}
		} 

		
	}

	}

