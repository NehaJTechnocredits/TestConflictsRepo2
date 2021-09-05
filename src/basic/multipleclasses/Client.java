package basic.multipleclasses;

public class Client {
	static Consultant consultant=new Consultant();
	Consultant consultant1=new Consultant();
	static void m3() {
		System.out.println("Hi I am in client");
	}
	public static void main(String[] args) {
	consultant.m3();
	Consultant consultant1=new Consultant(); //local object is not used
	Client client=new Client();
	client.consultant1.m3();
		m3();
		
	}
}
