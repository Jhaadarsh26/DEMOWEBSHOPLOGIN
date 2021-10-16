package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Browser.Browser;
import Locators.locators;

public class checkingValidtc01 extends Browser {
	
public static void validcredentials() throws Exception {
		
		locators.testcase1().sendKeys(Readers.ReaderExcel.readExcel(1,0));
		locators.testcase101().sendKeys(Readers.ReaderExcel.readExcel(1, 1));
		locators.testcase102().click();
		
		
//		driver.findElement(By.id("Email")).sendKeys("jhaadarsh26@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("adarshjha");
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
//			
	}

	public static void logout() throws InterruptedException {
		
		locators.logouttestcase1().click();
		Thread.sleep(5000);
		locators.logouttestcase101().click();
		
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
//		Thread.sleep(5000);
		
		
	}
}
	