package Register;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Driver properties 
		System.setProperty("webdriver.chrome.driver","E:\\Chrome\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     String Url="https://opensource-demo.orangehrmlive.com/";
	     // invoking the URL
	     driver.get(Url);
	    
	     //Enter the username and password  
	     driver.findElement(By.xpath("//input[@name='txtUsername']/../span")).sendKeys("Admin"); 
	     
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("//input[@name='txtPassword']/../span")).sendKeys("admin123");
	     
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	      
	     System.out.println("Successfully login into OrangeHRM application");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     driver.close();
	     
	     
	}

}
