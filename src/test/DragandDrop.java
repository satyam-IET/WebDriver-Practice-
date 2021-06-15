package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://Demo.guru99.com/test/drag_drop.html");
		
		//To maximize the browser 
		
		driver.manage().window().maximize();
		
		//To wait for 5 sec in every page
		
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    
	    // To Drag and drop
		
		WebElement from = driver.findElement(By.xpath("//li[@id='credit2']/a"));
		
		WebElement To = driver.findElement(By.xpath("//ol[@id='bank']/li"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(from, To).build().perform();

		
		

	}

}
