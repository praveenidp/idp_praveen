package task.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	
	public void precondition(String url,String username,String password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-icon-waffle")).click();                
        driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		

	}

	
//	@AfterMethod
//	public void postcondition() {
//		
//		driver.close();
//	}
}
