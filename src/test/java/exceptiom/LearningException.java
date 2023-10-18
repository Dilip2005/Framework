package exceptiom;

public class LearningException {

	public static void main(String[] args) {
		
		int x=10;
		int y=0;
		
		int[] num= {2,4,6,1,7,5};
		try {
			System.out.println(num[6]);
		}	
		
		catch (ArithmeticException e) {
			
			System.out.println(x/5);
		}
		catch(Exception d) {
			System.out.println(d);
			System.out.println(num[3]);
		}
		
		finally {
			System.out.println("end the code");
		}
		
		System.out.println("done");

	}

}
