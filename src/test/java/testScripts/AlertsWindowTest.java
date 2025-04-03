package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertsWindowTest {
  @Test
  public void AlertsWindow() {
	  WebDriver driver  = new EdgeDriver();
	  driver.manage().window().maximize();// to minimize the opened window in browser
	//  Actions actions = new Actions(driver);
	  SoftAssert softassert = new SoftAssert();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  driver.findElement(By.id("alertBtn")).click();
	  Alert alert = driver.switchTo().alert();
	  System.out.println(alert.getText());
//	  Assert.assertEquals(alert.getText(), "I am an alert box!");
	  softassert.assertEquals(alert.getText(), "I am an alert box");
	  alert.accept();
	  
	  driver.findElement(By.id("confirmBtn")).click();
	  Alert confirm = driver.switchTo().alert();
	  System.out.println(confirm.getText());
	 // Assert.assertEquals(alert.getText(), "Press a button!");//expected one Hard assert
	  softassert.assertEquals(alert.getText(), "Press a button");
	  confirm.dismiss();
	  
	  driver.findElement(By.id("promptBtn")).click();
	  Alert prompt = driver.switchTo().alert();
	  System.out.println(prompt.getText());
	  prompt.sendKeys("Hello welcome");
	  prompt.accept();
	  
	  softassert.assertAll();
  }
}
