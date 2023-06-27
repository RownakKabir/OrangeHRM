package OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
 public String User;
 public String Pass;
 public WebDriver driver;

public WebDriver Login() {
	 System.setProperty("Webdriver.chrome.driver","C:\\Users\\LEADS Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.cssSelector("input[name=username]")).sendKeys(User);	  
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys(Pass);
		driver.findElement(By.cssSelector("button[type=submit]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));	

		return driver;		
 }
}
