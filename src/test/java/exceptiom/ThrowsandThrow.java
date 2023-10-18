package exceptiom;

import org.testng.annotations.Test;

public class ThrowsandThrow {

	@Test
	public void createLead() {
		System.out.println("createlead");
		throw new RuntimeException("kindly check it");
	}
	
@Test(dependsOnMethods = "createLead")
public void editLead() throws InterruptedException {
	System.out.println("editlead");
	
	Thread.sleep(200);
}
}
