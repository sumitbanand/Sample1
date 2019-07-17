import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//Browser stack is used to test my code manually as well as automate them on different OS,browsers and their versions
public class Grid_BrowserStack1 {

	public static void main(String[] args) throws Exception{

		DesiredCapabilities d=new DesiredCapabilities();
/*		d.setCapability("os","WINDOWS");
		d.setCapability("os_version","7");
		d.setCapability("browser","Chrome");
		d.setCapability("browser_version","14");
		d.setCapability("browserstack.debug" ,true);*/
	
		d.setCapability("platform","MAC");
		d.setCapability("browserName","safari");
		d.setCapability("version","12");
		d.setCapability("browserstack.debug" ,true);
		
		URL u=new URL("https://sumitanand3:hsF4c3fQzpysVQ8R6Snn@hub-cloud.browserstack.com/wd/hub");
		
		RemoteWebDriver r=new RemoteWebDriver(u, d);
		
		WebDriver A1=r;
		
		A1.get("http://facebook.com");
		A1.manage().window().maximize();
		A1.quit();
	}

}
