package acti;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo 
{
	
@Test
public void test() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("http://localhost/login.do");
	Pom p=new Pom(driver);
	p.Click();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	p.Click();

}
}
