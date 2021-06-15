package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		//To maximize the browser 
		
		driver.manage().window().maximize();
		
		//To wait for 5 sec in every page
		
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    
	    WebElement CusID = driver.findElement(By.xpath("//input[@name='cusid']"));
	    
	    CusID.sendKeys("123456");
	    
        WebElement Sub = driver.findElement(By.xpath("//input[@name='submit']"));
	    Sub.click();
	    
	    Alert alrt = driver.switchTo().alert();
	    
	    alrt.accept();
	    
	}

	
	

}
