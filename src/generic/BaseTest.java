package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constant {
	@BeforeMethod
	public void open()
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		WebDriver driver=new ChromeDriver();
	}
	

}
