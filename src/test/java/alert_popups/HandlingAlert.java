package alert_popups;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base_class.DriverSetup;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;

public class HandlingAlert extends DriverSetup{
	@Test
	public void Alert() throws NoAlertPresentException, InterruptedException {

		// Alert Message handling
		driver.get("http://demo.automationtesting.in/Alerts.html");

		//Open Alert
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();

		// Switching to Alert
		Alert alert = driver.switchTo().alert();

		// Capturing alert message.
		String alertMessage = driver.switchTo().alert().getText();

		// Displaying alert message
		System.out.println(alertMessage);
		Thread.sleep(5000);

		// Accepting alert
		alert.accept();
		
		Thread.sleep(2000);
	}

}
