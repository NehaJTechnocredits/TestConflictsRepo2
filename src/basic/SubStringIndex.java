package basic;

public class SubStringIndex {
	
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Hello Hi";
		for(int i=0;i<input.length();i++) {
			
			if(i==input.indexOf("Hello"))
				System.out.println(i);
		}
		
	}

}
