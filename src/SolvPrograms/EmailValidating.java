package SolvPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmailValidating {
	
	public static void main(String[] args) {
		
		List<String> lststr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
			int slt;
		
		do {
			System.out.println("-> 1 Add More Employee Email\n-> 2 Search Employee email");
			System.out.println("-> 3 Exit");
			
			slt = sc.nextInt();
			
		switch(slt) {
		
		case 1 :
		{
		while(true) {
			System.out.println("Enter Employee Email(For Exit use word Stop)");
			String st = sc.next();
		
			if(st.equalsIgnoreCase("stop"))
			break;
			
			lststr.add(st);
		}
		
		System.out.println("---------------------");
		
		Iterator itr = lststr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------------------");
		break;
		}
		
		
		case 2:
		{
		System.out.println("Enter Email to Search");
		Scanner sce = new Scanner(System.in);
		
		
		String stt = sc.next();
		
		if(lststr.contains(stt))
			System.out.println(stt + " Email Are Existed ");
		else
			System.out.println(stt + "This Email are not Existed");
			break;
			}
		
		case 3:
			System.out.println("Exit From App");
			
		
		}
	
	
		}while(slt!=3);
		
	}

}
