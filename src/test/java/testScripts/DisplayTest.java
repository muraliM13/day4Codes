package testScripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DisplayTest {
  @Test
  public void DisplayElementtest() throws InterruptedException, IOException {
  
	  //ChromeOptions options = new ChromeOptions();
	  WebDriver driver  = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicitWait
	  driver.manage().window().minimize();// to minimize the opened window in browser
	  driver.get("https://automationbookstore.dev/");
	  driver.findElement(By.id("searchBar")).sendKeys("Test");
	  Thread.sleep(5000);
	  WebElement closeIcon = driver.findElement(By.cssSelector("a[title = clear text]"));
	  System.out.println(closeIcon.isDisplayed());
	  if(closeIcon.isDisplayed())
	  {
		  closeIcon.click();
	  }
  
	  
	  /*  
	  //Take screenshot of entire page of code
	  
	  ChromeOptions options = new ChromeOptions();
	  WebDriver driver  = new ChromeDriver();
	  driver.manage().window().minimize();// to minimize the opened window in browser
	  driver.get("https://automationbookstore.dev/");
	  //to take entire page screenshot
	  
	  TakesScreenshot screen = (TakesScreenshot)driver;
	  File src = screen.getScreenshotAs(OutputType.FILE);
	  String path = System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png";
	  FileUtils.copyFile(src, new File(path));
	  
	  WebElement closeIcon = driver.findElement(By.cssSelector("a[title = clear text]"));
	  System.out.println(closeIcon.isDisplayed());
	  if(closeIcon.isDisplayed())
	  {
		  closeIcon.click();
	  }
 	  
	  //to take single element
	  
	 // ChromeOptions options = new ChromeOptions();
	  WebDriver driver  = new ChromeDriver();
	  driver.manage().window().minimize();// to minimize the opened window in browser
	  driver.get("https://automationbookstore.dev/");
	  //to take entire page screenshot
	  WebElement closeIcon = driver.findElement(By.cssSelector("a[title = clear text]"));
	  driver.findElement(By.id("searchBar")).sendKeys("Test");
	  Thread.sleep(5000);
	  File srcImg = closeIcon.getScreenshotAs(OutputType.FILE);
	  String path1 = System.getProperty("user.dir")+"/screenshots"+System.currentTimeMillis()+".png";
	  FileUtils.copyFile(srcImg, new File(path1));
	  
	  System.out.println(closeIcon.isDisplayed());
	  if(closeIcon.isDisplayed())
	  {
		  closeIcon.click();
	  }
 	  
	  */
	  
	  
	  
	  
	  
	  
  }
}
