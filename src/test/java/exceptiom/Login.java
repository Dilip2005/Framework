package exceptiom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		try {
			driver.findElement(By.id("usernam")).sendKeys("DemoCsr");
		}
		
		catch (Exception e) {
			System.out.println(e);
			//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		}
		try {
			driver.findElement(By.id("password")).sendKeys("crmsfa");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
		} catch (Exception e) {
			System.out.println(e);
		}

		
	}

}
