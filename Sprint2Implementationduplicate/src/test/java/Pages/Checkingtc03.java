package Pages;

import org.openqa.selenium.By;

import Browser.Browser;
import Locators.locators;

public class Checkingtc03 extends Browser{
public static  void validcredentials() throws Exception {
		
		locators.Testcase3().sendKeys(Readers.ReaderExcel.readExcel(3, 0));
		locators.Testcase301().sendKeys(Readers.ReaderExcel.readExcel(3, 1));
		locators.testcase102().click();
		
		
//		driver.findElement(By.id("Email")).sendKeys("jhaadarsh26@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("jhaadarsh26@gmail.com");
//		
	}
	public static void getclear() throws InterruptedException {
		locators.getcleartestcase().clear();
		locators.getcleartestcase1().clear();
		
//		driver.findElement(By.id("Email")).clear();
//		driver.findElement(By.id("Password")).clear();
//		Thread.sleep(5000);
	}
	
}
