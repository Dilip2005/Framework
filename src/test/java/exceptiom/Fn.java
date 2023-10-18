package exceptiom;

public final class Fn  extends LearnFinal{

	//final class
	
	
	//final variable
	final int x=20;
	
	
	public void num(int x) {
		
		System.out.println(x);
		//this.x=x;
	}
	
	public final void add() {
		System.out.println("numbers");
	}
	
	public final void add(int x) {
		System.out.println("numbers");
	}
	public static void main(String[] args) {
		
		Fn f= new Fn();
	System.out.println(f.x);
	f.num(3);
	}
}
