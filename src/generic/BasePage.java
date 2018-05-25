package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage extends BaseTest {
	public void Elementpresent(WebElement element)
	{
		try
		{
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not present",true);	
		}
	}
	public void VerifyElement(String title)
	{
		try
		{
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.titleIs(title));
		Reporter.log("Element is verified",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not verified",true);	
	

}
	}
}
