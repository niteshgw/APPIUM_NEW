package appiumTest;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
	
		try {
			openCalcultor();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	public static void openCalcultor() throws Exception{
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName","Vivo1793");
		cap.setCapability("udid","45c99707");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","9.0");
		
		cap.setCapability("appPackage","com.android.bbkcalculator");
		cap.setCapability("appActivity","com.android.bbkcalculator.Calculator");
	//	cap.setCapability("automationName", "UiAutomator2");
		
		
	    URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application Started");
	}

}
