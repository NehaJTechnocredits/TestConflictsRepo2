package basic;

/*Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4*/
public class Assignmnt25pg1Refactoring {
	int sumOfConsecutiveDigits(String str) {
		int sum = 0;
		String numStr = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				numStr += ch;
				if(index== str.length()-1) {
					sum += Integer.parseInt(numStr);
				}
			} else if (numStr != "") {
				sum += Integer.parseInt(numStr);
				numStr = "";
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignmnt25pg1Refactoring assignment25pg1 = new Assignmnt25pg1Refactoring();
		String strInput = "te12ch33no3credit4s100";
		System.out.println("Sum of consecutive digits is: " + assignment25pg1.sumOfConsecutiveDigits(strInput));
	}
}
