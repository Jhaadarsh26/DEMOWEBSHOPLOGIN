package Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import Browser.Browser;
import Locators.locators;

public class Checkingtc04 extends Browser {
	
	public static void validcredentials() throws IOException {
		
		locators.Testcase4().sendKeys(Readers.ReaderExcel.readExcel(4,0));
		locators.Testcase401().sendKeys(Readers.ReaderExcel.readExcel(4, 1));
//		driver.findElement(By.id("Email")).sendKeys("jhaadarsh26@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("adjha");
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
	}

}
