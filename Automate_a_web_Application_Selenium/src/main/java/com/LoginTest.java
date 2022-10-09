package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
        
        driver.manage().window().maximize();
        Thread.sleep(4000);
        
        driver.findElement(By.id("email")).sendKeys("suba@gmail.com");
        Thread.sleep(4000);
        
        driver.findElement(By.id("pass")).sendKeys("Suba@17");
        Thread.sleep(4000);
        driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(4000);
		
		 Alert alert = driver.switchTo().alert();		
	        
	        Thread.sleep(3000);
	        // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);
	        		
	        // Accepting alert		
	        alert.accept();	
	}	

}
