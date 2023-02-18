package SolvPrograms;

import java.util.Scanner;

public class Arithmetic_Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int fc1 = sc.nextInt();
		int fc2 = sc.nextInt();
		
		System.out.println("Enter Any one Calculation Method( / , * , + , - )");
		
		String cls = sc.nextLine();
		int result = 0;
		
		switch(cls) {
		
		case "/" :
			result = fc1/fc2;
			System.out.println(fc1 + "/" + fc2 + "=" + result );
			
		case "*" :
			result = fc1*fc2;
			System.out.println(fc1 + "*" + fc2 + "=" + result );
		
		
		
		
		}
		

	}

}
