package basic.loopdemo;

public class Example3 {

	void processData() {
		int index=0;
		for(;index<5;index++)
			System.out.println(index);
		System.out.println("Hi");
		
	}
	
	
	public static void main(String[] args) {
		Example3 example2 = new Example3();
			example2.processData();	
	}
}
