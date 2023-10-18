package exceptiom;

public class LearnStatic {

	//static variable
	static String companyName;
	
	//static method 
	public static void name(String name1) {
		System.out.println(name1);
	}
	
	//non static 
	public void data(String company) {
		companyName=company;
		
	}
	
	public void setdat() {
		System.out.println(companyName);
	}
	
	//static block
	static {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		
		//call only method name 
		name("TestLeaf");
	//static variable
		System.out.println(companyName);
		
		System.out.println("************************************");
		
		LearnStatic ls=new LearnStatic();
		ls.data("TestLeaf");
		ls.setdat();
		
		LearnStatic ls1=new LearnStatic();
		ls1.data("driver");
		ls1.setdat();
		ls.setdat();
		
		
		
		
	}
}
