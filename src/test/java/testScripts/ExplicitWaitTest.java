package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitTest {
	public final String expValue = "JjavaScript";
	@Test
  
  public void explicitWait() {
	  //TODO auto generated method stub
	  WebDriver driver  = new ChromeDriver();
	  driver.manage().window().maximize();// to minimize the opened window in browser
	  driver.get("http://uitestingplayground.com/ajax/");
	  WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
	  driver.findElement(By.id("ajaxButton")).click();
	 // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div#content"))));
	  wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("div#content")),"Data loaded with AJAX get request."));
	  String strTxt = driver.findElement(By.cssSelector("div#content")).getText();
	  System.out.println(strTxt);
  }
}
