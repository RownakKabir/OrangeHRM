package OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdminTest extends BaseTest {
	@Test
	public void BaseLogin() {

		BaseTest t = new BaseTest();
		t.User = "Admin";
		t.Pass = "admin123";
		driver = t.Login();
		driver.findElement(By.linkText("Admin")).click();
	}

	@Test(dependsOnMethods = { "BaseLogin" })
	public void UserCreate() throws InterruptedException {

		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")).click();
		WebElement Status = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div"));
		Status.click();
		Thread.sleep(3000);

		List<WebElement> myElements = driver.findElements(By.xpath("//div[contains(@class, 'oxd-select-dropdown')]"));
		for (WebElement e : myElements) {
			if (e.getText().contains("Admin")) {
				e.click();
			}
		}

		WebElement Status1 = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div"));
		Status1.click();
		Thread.sleep(3000);

		List<WebElement> myElements1 = driver.findElements(By.xpath("//div[contains(@class, 'oxd-select-dropdown')]"));
		for (WebElement e1 : myElements1) {

			if (e1.getText().contains("Enabled")) {
				e1.click();
			}
		}

		driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys("J");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Johan");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("admin123");
		/// driver.findElement(By.cssSelector("button[type=submit]")).click();
	}

	public void EditUser() {

			////not done yet
	}

}
