package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//To maximize the browser 
		
		driver.manage().window().maximize();
		
		//To wait for 5 sec in every page
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.linkText("English (UK)")).click();

		
		WebElement Login = driver.findElement(By.xpath("//input[@name='email']"));
		Login.sendKeys("satyam@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='pass']"));
		Password.sendKeys("satyam");
		
	    //WebElement Login1 = driver.findElement(By.xpath("//button[@name='login']"));
		//Login1.click();
		
		WebElement CreateNew = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CreateNew.click();
		
		WebElement Dob = driver.findElement(By.xpath(null));
		
		
		
		//driver.close();
		

	}

}
