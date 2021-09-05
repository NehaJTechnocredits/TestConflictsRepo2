package basic.loopdemo;

public class Example1 {
	void display(String name) {
		System.out.println(name);
		int index;
		for(index=1;index<=5;index++){
			System.out.println(name+" "+index);
		}
	}

	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.display("Parth");
	}
}
