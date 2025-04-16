package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginPagetest {
  @Test
  public void loginPage() {
	  WebDriver driver  = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicitWait
	  driver.manage().window().maximize(); //to maximize the opened window in browser
	  driver.get("https://the-internet.herokuapp.com/login");
	  driver.findElement(By.id("username")).sendKeys("tomsmith");//withouth the xpath
	  driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	  driver.findElement(By.className("radius")).click();
	  String strMsg =  driver.findElement(By.cssSelector("div.flash.success")).getText();
	  System.out.println(strMsg);
  }
}
