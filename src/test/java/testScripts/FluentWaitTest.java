package testScripts;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class FluentWaitTest {
  @Test
  public void fluentWait() {
	  WebDriver driver  = new ChromeDriver();
	  Actions actions = new Actions(driver);
	  driver.manage().window().maximize();// to maximize the opened window in browser
	  WebElement srcBox =  driver.findElement(By.id("search"));
	  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			  .withTimeout(Duration.ofSeconds(30))
			  .pollingEvery(Duration.ofSeconds(5))
			  .ignoring(NoSuchElementException.class);
	  wait.until(ExpectedConditions.elementToBeClickable(srcBox));
	    
  }
}
