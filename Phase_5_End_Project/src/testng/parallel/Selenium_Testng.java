package testng.parallel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium_Testng 
{
		WebDriver driver;
	
		@Test(groups = "Chrome")
		public void LaunchChrome() 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    
		@Test(groups = "Chrome", dependsOnMethods = "LaunchChrome")
		public void executSessionOne() throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			System.out.println("Chrome Browser 1 :\n");
			
			String Title = "" ;
		    Title = driver.getTitle();
			System.out.println(Title) ;
			String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
			String subWindowHandler = null;
			Set<String> handles = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()){
			    subWindowHandler = iterator.next();
			}
			driver.switchTo().window(subWindowHandler);
			
			
			//Printing Load Time in seconds on console

			Long loadtime = (Long) ((JavascriptExecutor) driver)
					.executeScript("return performance.timing.loadEventEnd - performance.timing.navigationStart;");
			System.out.println("Load time of 1st website is :- " + loadtime/1000+" Seconds");

			//Searching IPhone 13 on search bar

			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			Thread.sleep(4000);
			driver.findElement(By.className("_3704LK")).sendKeys("Mobile");
			Thread.sleep(4000);
			driver.findElement(By.className("L0Z3Pu")).click();
			Thread.sleep(4000);
			WebElement txtUsername = driver.findElement(By.className("_3704LK"));
		    Thread.sleep(2000);
			
		    Actions builder = new Actions(driver);  // STEP-1
			
		   Thread.sleep(5000);
			Action seriesOfActions = builder    //STEP-2
				.moveToElement(txtUsername)
				.click()
				.doubleClick(txtUsername)
				.build();             //STEP-3
			
		    Thread.sleep(5000);
			seriesOfActions.perform(); 
		
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.findElement(By.className("_3704LK")).sendKeys("iPhone 13");
			Thread.sleep(4000);
			driver.findElement(By.className("L0Z3Pu")).click();
			Thread.sleep(4000);
			driver.findElement(By.partialLinkText("APPLE iPhone 13 (Starlight, 128 GB)")).click();
			Thread.sleep(6000);

			WebElement i = driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
			Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
					+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

			if (p) {
				System.out.println("Image is loaded\n");
			} else {
				System.out.println("Image not loaded\n");
			}
			try {
				long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

				while (true) {
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
					Thread.sleep(2000);

					long newHeight = (long) ((JavascriptExecutor) driver)
							.executeScript("return document.body.scrollHeight");
					if (newHeight == lastHeight) {
						break;
					}
					lastHeight = newHeight;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
        
		@Test(groups = "Chrome", dependsOnMethods = "LaunchChrome")
		public void executSessionTwo() throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			System.out.println("Chrome Browser 2 :\n");
			
			String Title = "" ;
		    Title = driver.getTitle();
			System.out.println(Title) ;
			String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
			String subWindowHandler = null;
			Set<String> handles = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()){
			    subWindowHandler = iterator.next();
			}
			driver.switchTo().window(subWindowHandler);
			
			
			//Printing Load Time in seconds on console

			Long loadtime = (Long) ((JavascriptExecutor) driver)
					.executeScript("return performance.timing.loadEventEnd - performance.timing.navigationStart;");
			System.out.println("Load time of 2nd website is :- " + loadtime/1000+" Seconds");

			//Searching IPhone 13 on search bar

			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			Thread.sleep(4000);
			driver.findElement(By.className("_3704LK")).sendKeys("Mobile");
			Thread.sleep(4000);
			driver.findElement(By.className("L0Z3Pu")).click();
			Thread.sleep(4000);
			WebElement txtUsername = driver.findElement(By.className("_3704LK"));
		    Thread.sleep(2000);
			
		    Actions builder = new Actions(driver);  // STEP-1
			
		   Thread.sleep(5000);
			Action seriesOfActions = builder    //STEP-2
				.moveToElement(txtUsername)
				.click()
				.doubleClick(txtUsername)
				.build();             //STEP-3
			
		    Thread.sleep(5000);
			seriesOfActions.perform(); 
		
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.findElement(By.className("_3704LK")).sendKeys("iPhone 13");
			Thread.sleep(4000);
			driver.findElement(By.className("L0Z3Pu")).click();
			Thread.sleep(4000);
			driver.findElement(By.partialLinkText("APPLE iPhone 13 (Starlight, 128 GB)")).click();
			Thread.sleep(6000);

			WebElement i = driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
			Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
					+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

			if (p) {
				System.out.println("Image is loaded\n");
			} else {
				System.out.println("Image not loaded\n");
			}
			try {
				long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

				while (true) {
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
					Thread.sleep(2000);

					long newHeight = (long) ((JavascriptExecutor) driver)
							.executeScript("return document.body.scrollHeight");
					if (newHeight == lastHeight) {
						break;
					}
					lastHeight = newHeight;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
        
		@Test(groups = "Chrome", dependsOnMethods = "LaunchChrome")
		public void executSessionThree() throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			System.out.println("Chrome Browser 3 :\n");
			
			String Title = "" ;
		    Title = driver.getTitle();
			System.out.println(Title) ;
			String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
			String subWindowHandler = null;
			Set<String> handles = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()){
			    subWindowHandler = iterator.next();
			}
			driver.switchTo().window(subWindowHandler);
			
			
			//Printing Load Time in seconds on console

			Long loadtime = (Long) ((JavascriptExecutor) driver)
					.executeScript("return performance.timing.loadEventEnd - performance.timing.navigationStart;");
			System.out.println("Load time of 3rd website is :- " + loadtime/1000+" Seconds");

			//Searching IPhone 13 on search bar

			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			Thread.sleep(4000);
			driver.findElement(By.className("_3704LK")).sendKeys("Mobile");
			Thread.sleep(4000);
			driver.findElement(By.className("L0Z3Pu")).click();
			Thread.sleep(4000);
			WebElement txtUsername = driver.findElement(By.className("_3704LK"));
		    Thread.sleep(2000);
			
		    Actions builder = new Actions(driver);  // STEP-1
			
		   Thread.sleep(5000);
			Action seriesOfActions = builder    //STEP-2
				.moveToElement(txtUsername)
				.click()
				.doubleClick(txtUsername)
				.build();             //STEP-3
			
		    Thread.sleep(5000);
			seriesOfActions.perform(); 
		
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.findElement(By.className("_3704LK")).sendKeys("iPhone 13");
			Thread.sleep(4000);
			driver.findElement(By.className("L0Z3Pu")).click();
			Thread.sleep(4000);
			driver.findElement(By.partialLinkText("APPLE iPhone 13 (Starlight, 128 GB)")).click();
			Thread.sleep(6000);

			WebElement i = driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
			Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
					+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

			if (p) {
				System.out.println("Image is loaded");
			} else {
				System.out.println("Image not loaded");
			}
			try {
				long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

				while (true) {
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
					Thread.sleep(2000);

					long newHeight = (long) ((JavascriptExecutor) driver)
							.executeScript("return document.body.scrollHeight");
					if (newHeight == lastHeight) {
						break;
					}
					lastHeight = newHeight;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}       
}
