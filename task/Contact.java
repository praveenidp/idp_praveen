package task.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Contact extends baseClass {
	@Test
	public void contactsearch() {
		ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement con = driver.findElement(By.xpath("//input[@class='slds-input']"));
		con.click();
		con.sendKeys("Contacts");
		driver.findElement(By.xpath("//mark")).click();
		driver.findElement(By.xpath("//div[text()='New']")).click();
        driver.findElement(By.xpath("//div[contains(@class,'slds-combobox__form-element slds-input-has-icon')]//button")).click();
        driver.findElement(By.xpath("//span[@title='Mr.']")).click();
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Praveen Bs");

        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//input[@name='Email']"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("praveenoupp@gmail.com");
        
        WebElement Element1 = driver.findElement(By.xpath("//div[@role='none']//input"));
        js.executeScript("arguments[0].scrollIntoView();", Element1);
        
        driver.findElement(By.xpath("//div[@role='none']//input")).click();
        driver.findElement(By.xpath("//span[@title='New Account']")).click();
        driver.findElement(By.xpath("//div[@data-aura-class='uiInput uiInputText uiInput--default uiInput--input']//input")).sendKeys("credits");
        driver.findElement(By.xpath("//button[@title='Save']//span[1]")).click();
         driver.findElement(By.xpath("//button[text()='Save']")).click();
			
	}
	

}
