import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSATest {

	
	@Test
	public void HomePageCheck1() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("firefox");
		//caps.setPlatform(Platform.);
		//caps.setCapability(CapabilityType, false);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.139:5555"), caps);
		driver.get("http://rahulshettyacademy.com");
		driver.get("http://youtube.com");
		driver.get("http://facebook.com");
		driver.get("http://facebook.com");
		driver.get("http://facebook.com");
		driver.get("http://facebook.com");
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	@Test
	public void HomePageCheck2() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("firefox");
		//caps.setPlatform(Platform.);
		//caps.setCapability(CapabilityType, false);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.139:5555"), caps);
		driver.get("http://rahulshettyacademy.com");
		driver.get("http://youtube.com");
		driver.get("http://facebook.com");
		driver.get("http://facebook.com");
		driver.get("http://facebook.com");
		driver.get("http://facebook.com");
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	@Test
	public void HomePageCheck3() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("firefox");
		//caps.setPlatform(Platform.);
		//caps.setCapability(CapabilityType, false);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.139:5555"), caps);
		driver.get("http://rahulshettyacademy.com");
		driver.get("http://youtube.com");
		driver.get("http://facebook.com");
		driver.get("http://facebook.com");
		driver.get("http://facebook.com");
		driver.get("http://facebook.com");
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	}
}
