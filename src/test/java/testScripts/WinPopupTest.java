package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WinPopupTest {
  @Test
  public void winPop() throws InterruptedException {
	  WebDriver driver  = new EdgeDriver();
	  Actions actions = new Actions(driver);
	  driver.manage().window().maximize();// to minimize the opened window in browser
	 
	  driver.get("https://demoqa.com/browser-windows");
	  String ParentWin = driver.getWindowHandle();
	  Thread.sleep(5000);
	  actions.scrollByAmount(100, 1200).perform();
	  System.out.println("Parent Win....."+ ParentWin);
	 
	  driver.findElement(By.id("tabButton")).click();
	  System.out.println("page title..."+ driver.getTitle());
	  
	  Set<String> wins =  driver.getWindowHandles();
	  System.out.println("No of windows..."+ wins.size());
	  
	  for(String child:wins) {
		  System.out.println("window handles..."+ child);
		  if(!child.equalsIgnoreCase(ParentWin)) {
			  driver.switchTo().window(child);
			  Thread.sleep(2000);
			  String h1Tagtext =   driver.findElement(By.cssSelector("h1#sampleHeading")).getText();
			  System.out.println("text in tab windows..."+ h1Tagtext);			
		  }		  
	  }
	  driver.close();
	  driver.switchTo().window(ParentWin);
	  driver.findElement(By.id("windowButton")).click();
	  
	  //winpops
//	  Set<String> winpops =  driver.getWindowHandles();
//	  System.out.println("No of windows..."+ winpops.size());
//	  
//	  for(String child:winpops) {
//		  System.out.println("window handles..."+ child);
//		  if(!child.equalsIgnoreCase(ParentWin)) {
//			  driver.switchTo().window(child);
//			  Thread.sleep(2000);
//			  String h1Tagtext =   driver.findElement(By.cssSelector("h1#sampleHeading")).getText();
//			  System.out.println("text in tab windows..."+ h1Tagtext);			
//		  }		  
//	  }
	 // driver.close();
	  driver.switchTo().newWindow(WindowType.WINDOW);
	  driver.get("https://testautomationpractice.blogspot.com/");
	  driver.quit();
  }
}
