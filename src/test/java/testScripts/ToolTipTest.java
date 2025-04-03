package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTipTest {
  @Test
  public void ToolTip() {
	  WebDriver driver  = new EdgeDriver();
	  Actions actions = new Actions(driver);
	  driver.manage().window().maximize();// to minimize the opened window in browser
	  driver.get("https://jqueryui.com/tooltip/");
	  driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
	  driver.findElement(By.id("age")).sendKeys(Keys.ARROW_DOWN);
	  actions.moveToElement(driver.findElement(By.id("age"))).perform();
	  String strTxt = driver.findElement(By.className("ui-tooltip-content")).getText();
	  System.out.println("Tooltip text is..."+strTxt);
	  Assert.assertEquals(strTxt, "We ask for your age only for statistical purposes.");
	  driver.findElement(By.id("age")).sendKeys("20");
	  driver.switchTo().defaultContent();
	  String strHeader = driver.findElement(By.tagName("h1")).getText();
	  System.out.println(strHeader);
  }
}
