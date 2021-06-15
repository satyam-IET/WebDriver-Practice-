package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//To maximize the browser 
		
		driver.manage().window().maximize();
		
		//To wait for 5 sec in every page
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
	    System.out.println("Total No of Rows :" + Rows.size() );
	  
        List<WebElement> Column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		
	    System.out.println("Total No of Column :" + Column.size() );
	    
        WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[1]"));
		
	    System.out.println("Data is  :" + data.getText());
	    
	    
	    //To Scroll the page till particular text 
	    
	    WebElement Scroll = driver.findElement(By.xpath("//h2[text()='HTML Table - Add a Border']"));
	    
	    JavascriptExecutor perform = (JavascriptExecutor)driver;
	    perform.executeScript("arguments[0].scrollIntoView();",Scroll);
	    
	    
	    //driver.close();
		
		
		
		

	}

}
