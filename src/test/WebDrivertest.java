package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivertest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://simplilearn.com/");
		
		//To maximize the browser 
		
		driver.manage().window().maximize();
		
		//To wait for 5 sec in every page
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		// To click on any tab
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		
		LoginLink.click();
		
		//to enter email / to enter any name in webpage
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		
		UserName.sendKeys("satyam.shukla16133iet@gmail.com");
		
		// Enter Password
		
		WebElement UserPassword = driver.findElement(By.name("user_pwd"));
		
		UserPassword.sendKeys("Mplgaming33");
		
		//Click on Remember me check box
		
		WebElement RememberMe =driver.findElement(By.className("rememberMe"));
		RememberMe.click();
		
		WebElement LoginName = driver.findElement(By.name("btn_login"));
		LoginName.click();
		
		//Check Login error Text
		
		WebElement Error =driver.findElement(By.id("msg_box"));
		String Actmsg = Error.getText();
		
		String ClassName = Error.getAttribute("class");
		String TagName = Error.getTagName();
		
		String expectmsg = "The email or password you have entered is invalid.";
		
		if(Actmsg.equals(expectmsg)) {
			System.out.println("Test Case Pass");
			
		}else {
			System.out.println("Test Case Failed");
			System.out.println("Class Name :" + ClassName);
			System.out.println("Tag Name :" + TagName);
		}
		
		List<WebElement> InPutTag = driver.findElements(By.tagName("input"));
		
		System.out.println("Total Input Tags :" + InPutTag.size());
		
        List<WebElement> Link = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Link Tags :" + Link.size());
		
		/*for ( int i= 1 ; i <= Link.size() ; i++) {
			
			System.out.println(Link.get(i).getText());
		}*/
		
		driver.close();
 
		
		
		
	}

}
