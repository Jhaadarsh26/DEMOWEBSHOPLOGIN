package Pages;

import org.openqa.selenium.By;

import Browser.Browser;
import Locators.locators;

public class Checkingvalidtc02 extends Browser{
	
	
public static void loginagain() throws Exception {
		
		locators.Testcase2().sendKeys(Readers.ReaderExcel.readExcel(2, 1));
		locators.Testcase201().click();
		Thread.sleep(5000);
		
//		driver.findElement(By.id("Password")).sendKeys("adarshjha");
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
	}
	
}