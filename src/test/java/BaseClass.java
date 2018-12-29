import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseClass {

	@Test
	public void Jorge() {

		System.setProperty("webdriver.chrome.driver",
				"src\\test\\resources\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com/";
		driver.get(url);
		String title = driver.getTitle();

		Assert.assertEquals("Google", title);

		driver.quit();
	}

}
