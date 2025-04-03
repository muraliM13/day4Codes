package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoCompleteTest {
	public final String expValue = "JjavaScript";
  @Test
  public void autoComplete() throws InterruptedException {
	  //TODO auto generated method stub
	  WebDriver driver  = new EdgeDriver();
	 // Actions actions = new Actions(driver);
	  driver.manage().window().maximize();// to minimize the opened window in browser
	  driver.get("https://jqueryui.com/autocomplete/");
	  WebElement frame1 = driver.findElement(By.cssSelector(".demo-frame"));
	  driver.switchTo().frame(frame1);
	  WebElement inp = driver.findElement(By.cssSelector("#tags"));
	  inp.sendKeys("as");
	 // Thread.sleep(2000);
	 List<WebElement> items =  driver.findElements(By.cssSelector("ul#ui-id-1"));
	 //to know the no of matching items
	 System.out.println("no of matching items"+items.size());
	 //to get the text of eaxh item
	 for(WebElement item:items) {
		 System.out.println(item.getText());
		 //to select expected value
		 if(item.getText().equalsIgnoreCase(expValue)) {
			 item.click();
			 break;
		 }
	 }
  }
}
