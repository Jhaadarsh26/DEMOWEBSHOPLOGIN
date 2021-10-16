package Browser;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver driver;
	
	public static void setDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADARSHJH\\eclipse-workspace\\Sprint2Implementation\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}

public static void url(){
	try {

		String fileLocation = System.getProperty("user.dir") + "\\src\\test\\resources\\Application_Config\\Confi.properties";
	    FileInputStream fis = new FileInputStream(fileLocation);
	    Properties prop = new Properties();
	    prop.load(fis);

	driver.get(prop.getProperty("url")); //http://demowebshop.tricentis.com/
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}catch(Exception e)
	{
	System.out.println("URL Method");
	}
	}
	public static void main(String[] args) throws Exception {
	Browser.setDriver();
	Browser.url();
	}
	



}
	
//	
//	public void validcredentials() {
//		driver.findElement(By.id("Email")).sendKeys("jhaadarsh26@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("adarshjha");
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
//		
//	}
//	
//	public void logout() {
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
//	}
//	
//	public void loginagain() {
//		driver.findElement(By.id("Password")).sendKeys("adarshjha");
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
