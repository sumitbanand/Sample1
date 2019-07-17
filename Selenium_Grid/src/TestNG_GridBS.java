import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class TestNG_GridBS {
			WebDriver A1;
  @Test
  public void f() {
	  A1.findElement(By.id("email")).sendKeys("Sumit Anand");
	  A1.findElement(By.id("pass")).sendKeys("Sumit Anand");
  }
  @BeforeMethod
  public void beforeMethod() throws Exception{
	  		DesiredCapabilities d=new DesiredCapabilities();
	  		d.setCapability("os","WINDOWS");
	  		d.setCapability("os_version","7");
	  		d.setCapability("browser","Chrome");
	  		d.setCapability("browser_version","14");
	  		d.setCapability("browserstack.debug" ,true);	    		
	  		URL u=new URL("https://sumitanand3:hsF4c3fQzpysVQ8R6Snn@hub-cloud.browserstack.com/wd/hub");	  		
	  		RemoteWebDriver r=new RemoteWebDriver(u, d);
	  		A1=r;	  		
	  		A1.get("http://facebook.com");
	  		A1.manage().window().maximize();
	  		A1.quit();
  }

  @AfterMethod
  public void afterMethod() {
	  		A1.close();
  }
  

}
