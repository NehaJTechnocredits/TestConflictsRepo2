package basic;

import java.util.Scanner;

public class ScannerPractice {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter next numbers: ");
	/*scanner.nextInt();
	scanner.nextInt();*/
	
	int numCount= scanner.nextInt();
	System.out.println(numCount);
	System.out.println("Enter your complete name: ");
	
	scanner.nextLine();
	scanner.next();
}
}
