package Locators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.Browser;

public class locators extends Browser {
	
	public static WebElement testcase1()
	{
		WebElement Email = driver.findElement(By.id("Email"));
		return Email;	
	}
	
	
	public static WebElement testcase101() {
		WebElement pass = driver.findElement(By.id("Password"));
		return pass;
	}
	
	
	public static WebElement testcase102() throws IOException {
		String fileLocation = System.getProperty("user.dir") + "\\src\\test\\resources\\Application_Config\\Confi.properties";
	    FileInputStream fis = new FileInputStream(fileLocation);
	    Properties prop = new Properties();
	    prop.load(fis);
	    String btn = prop.getProperty("loginbutton");
		WebElement clicklogin =driver.findElement(By.xpath(btn));
		return clicklogin;
		
	}
	
	
	
	
	public static WebElement logouttestcase1(){
		WebElement loggingout = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
		return loggingout;
		
	}
	
	public static WebElement logouttestcase101() {
	WebElement Againlogin = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	return Againlogin;
	}
	
	
	
	
	public static WebElement Testcase2() {
		WebElement loggingwithpassword =driver.findElement(By.id("Password"));
		return loggingwithpassword;
		
	}
	
	public static WebElement Testcase201() {
	WebElement loggingwithpassword1=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
	return loggingwithpassword1;
	
	}
	
	
	public static WebElement Testcase3() {
		WebElement same=driver.findElement(By.id("Email"));
		return same;
		
	}
	
	public static WebElement Testcase301() {
	WebElement same1 =driver.findElement(By.id("Password"));
	return same1;
	}
	
	public static WebElement getcleartestcase(){
		WebElement cl=driver.findElement(By.id("Email"));
		return cl;

	}

   public static WebElement getcleartestcase1() {
	WebElement cl1=driver.findElement(By.id("Password"));
	return cl1;
   }
	
	
	
	public static WebElement Testcase4() {
		WebElement wrongpass=driver.findElement(By.id("Email"));
		return wrongpass;
		
		
		
		
	}
	
	public static WebElement Testcase401() {
		WebElement wrongpass1=driver.findElement(By.id("Password"));
		return wrongpass1;
		
		
	}
	public static WebElement Testcase402() {
		WebElement wrongpassclick =driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		return wrongpassclick;
	}
	
	
	

}
