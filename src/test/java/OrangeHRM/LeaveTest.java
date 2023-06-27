package OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LeaveTest extends BaseTest {
	@Test
	public void BaseLogin() {

		BaseTest t = new BaseTest();
		t.User = "Admin";
		t.Pass = "admin123";
		driver = t.Login();
		driver.findElement(By.linkText("Leave")).click();
	}

@Test(dependsOnMethods = { "BaseLogin" })
public void AssignLeave() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[6]/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Assign Leave")).click();
	driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys("J");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys(Keys.ENTER);

	WebElement Status = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[1]"));
	Status.click();
	Thread.sleep(3000);

	List<WebElement> myElements = driver.findElements(By.xpath("//div[contains(@class, 'oxd-select-dropdown')]"));
	for (WebElement e : myElements) {

		if (e.getText().contains("CAN - Personal")) {
			e.click();
		}
	}
	
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div")).click();
	Thread.sleep(3000);
    List<WebElement> Dates = driver.findElements(By.cssSelector("div[class='oxd-calendar-date']"));
  	for (WebElement e : Dates) {
  		
  	if (e.getText().contains("5")) {
 		e.click();
 		break;
	}
	}
  	   driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/div/div")).click();
  	   Thread.sleep(3000);
       List<WebElement> Dates1 = driver.findElements(By.cssSelector("div[class='oxd-calendar-date']"));    
         for (WebElement e : Dates1) {
     	if (e.getText().contains("9")) {
     	e.click();
 		break;
	}
}
    	
         
         driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div[2]/div/div")).click();
    	   Thread.sleep(3000);
         List<WebElement> Partial = driver.findElements(By.cssSelector("div[class='oxd-select-option']"));    
           for (WebElement e : Partial) {
  		System.out.println(e.getText());
       	if (e.getText().contains("All Days")) {
       	e.click();
   		break;
  	}
  }
           driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/div/div[2]/div/div")).click();
    	   Thread.sleep(3000);
         List<WebElement>Duration = driver.findElements(By.cssSelector("div[class='oxd-select-option']"));    
           for (WebElement e : Duration) {
  		System.out.println(e.getText());
       	if (e.getText().contains("Half Day - Morning")) {
       	e.click();
   		break;
  	}}
    	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div/div/div[2]/textarea")).sendKeys("Test");	
    	driver.findElement(By.cssSelector("button[type=submit]")).click();

	
	
	
	
}	
public void SearchLeave() {
	
	///not done yet
}		
	
		

}
