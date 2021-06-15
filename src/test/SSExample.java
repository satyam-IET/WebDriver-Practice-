package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://Demo.guru99.com/test/drag_drop.html");
		
		//To maximize the browser 
		
		driver.manage().window().maximize();
		
		//To wait for 5 sec in every page
		
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    
	    // To Deal with Screen shot , we need to download jar file (https://mvnrepository.com/artifact/commons-io/commons-io/2.6)
	
	    
	    
	   TakesScreenshot ss = (TakesScreenshot)driver;
	   
	   File myFile = ss.getScreenshotAs(OutputType.FILE);

	   
	   try {
			FileUtils.copyFile(myFile,  new File("test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
