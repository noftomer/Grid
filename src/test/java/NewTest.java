import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  DesiredCapabilities chromeDC=DesiredCapabilities.chrome();
  	  browser( chromeDC);
  }
  private void browser(DesiredCapabilities desiredCap) {
	  WebDriver driver=null;
		try {
			driver=new RemoteWebDriver(new URL("http://192.168.1.5:4444/wd/hub"), desiredCap);
//			System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
//			driver=new ChromeDriver();
			
			driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(desiredCap.toString()+" id="+Thread.currentThread().getId());
		if(driver!=null) {
			driver.quit();
		}
  }
}
