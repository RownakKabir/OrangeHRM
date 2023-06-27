package OrangeHRM;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	BaseTest t = new BaseTest();

	@Test(dataProvider = "getData")
	public void ChromeStart(String username, String password) {

		BaseTest t = new BaseTest();
		t.User = username;
		t.Pass = password;
		t.Login();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		data[1][0] = "rgreg";
		data[1][1] = "admin123";
		data[2][0] = "Admin";
		data[2][1] = "fhbjff";

		return data;

	}

}
