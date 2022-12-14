package OffcAuto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Finalasse {
	
	public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
           ChromeOptions opt=new ChromeOptions();
           opt.addArguments("disable-notification");
           ChromeDriver driver = new ChromeDriver(opt);
           
           
           
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           
           
          
           driver.manage().window().maximize();
           
           
           driver.get("https://login.salesforce.com");
           driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
           driver.findElement(By.id("password")).sendKeys("Password$123");
           driver.findElement(By.id("Login")).click();             

           driver.findElement(By.className("slds-icon-waffle")).click();                
           driver.findElement(By.className("slds-button")).click();
           
           
           driver.findElement(By.xpath("//p[text()='Sales']")).click();
           driver.findElement(By.xpath("//a[@title='Opportunities']//parent::one-app-nav-bar-item-root")).click();
           driver.findElement(By.xpath("//div[text()='New']")).click();
           
           
           WebElement username = driver.findElement(By.xpath("//input[@name='Name']"));
           username.sendKeys("Salesforce - Praveen BS");
           String typed = username.getAttribute("value");
           System.out.println(typed);
           driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("8/03/2022");
           driver.findElement(By.xpath("//div[@role='none']/button")).click();
           driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
           driver.findElement(By.xpath("//button[text()='Save']")).click();
   }

}


