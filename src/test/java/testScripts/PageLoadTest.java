package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PageLoadTest {
  @Test
  public void pageLoad() {
	//TODO auto generated method stub
	  WebDriver driver  = new ChromeDriver();
	  driver.manage().window().maximize();// to minimize the opened window in browser
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	  driver.get("http://uitestingplayground.com/");
	  driver.findElement(By.linkText("Load Delay")).click();
	  driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	    
  }
}
