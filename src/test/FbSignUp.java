package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver", "chromedriver");
				
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				//To maximize the browser 
				
				driver.manage().window().maximize();
				
				//To wait for 5 sec in every page
				
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
				
				driver.findElement(By.linkText("English (UK)")).click();
				
				
				//Click on create new account
				
				WebElement CreateNew = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
				CreateNew.click();
				
				WebElement FirstName =driver.findElement(By.xpath("//input[@name='firstname']"));
				FirstName.sendKeys("satyam");
				
				WebElement LastName = driver.findElement(By.xpath("//input[@name= 'lastname']"));
				LastName.sendKeys("shukla");
				
				WebElement RegEmail = driver.findElement(By.xpath("//input[@name= 'reg_email__']"));
				RegEmail.sendKeys("9555281463");
				
				WebElement Pass = driver.findElement(By.xpath("//input[@id= 'password_step_input']"));
				
                Pass.sendKeys("satyam@123");
				
				WebElement Dob = driver.findElement(By.xpath("//select[@name= 'birthday_day']"));
				
				Select ddDob = new Select(Dob);
				
				ddDob.selectByVisibleText("10");
				
                WebElement Bom = driver.findElement(By.xpath("//select[@name='birthday_month']"));
				
				Select ddBom = new Select(Bom);
				
				ddBom.selectByValue("1");
				
               WebElement Year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
				
				Select ddYear = new Select(Year);
				
				ddYear.selectByValue("1997");
				
				
				
				//ddDob.selectByIndex("9");
				
				WebElement male = driver.findElement(By.xpath("//input[@type='radio' and @value ='2']"));
				male.click();

				
				WebElement Signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
				Signup.click();
				
				//driver.close();

	}

}
