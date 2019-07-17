import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_Sample1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Sumit_Selenium\\chromedriver_win32\\chromedriver.exe");
		//The chrome driver needs to be placed in the same location as the selenium server
		DesiredCapabilities d=new DesiredCapabilities().chrome();
		URL u= new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver r= new RemoteWebDriver(u, d);
		
		WebDriver A1=r;
		
		A1.get("https://facebook.com");
		A1.manage().window().maximize();
		System.out.println(A1.getCurrentUrl());
		A1.close();
	}

}
