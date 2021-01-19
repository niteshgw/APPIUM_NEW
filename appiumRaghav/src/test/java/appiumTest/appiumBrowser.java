package appiumTest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.sun.glass.ui.View.Capability;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class appiumBrowser {
	
	static AndroidDriver<MobileElement> driver;

	@BeforeTest
	public void setup(){
		
try{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Vivo1793");
		cap.setCapability(MobileCapabilityType.UDID,"45c99707");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"30");
	//	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		
		cap.setCapability(MobileCapabilityType.FORCE_MJSONWP, true);
		cap.setCapability("appium:chromeOptions",ImmutableMap.of("w3c","false"));
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
	    cap.setCapability(MobileCapabilityType.BROWSER_VERSION,"81.0.4044");
	    cap.setCapability("ChromedriverExecutable","C:/Users/nitesh/Downloads/Selenium_Browser_Drivers/Chrome81.0.4044.138/chromedriver.exe");
	//Before run,run this cmd ->	// appium --chromedriver-executable "C:/Users/nitesh/Downloads/Selenium_Browser_Drivers/Chrome81.0.4044.138/chromedriver.exe"
		
		//cap.setCapability(MobileCapabilityType.APP,"C:/Users/nitesh/Downloads/Android-Demo-Omprakash/ApiDemos-debug.apk");
		
	  //  cap.setCapability("appPackage","com.android.bbkcalculator");
	//cap.setCapability("appActivity","com.android.bbkcalculator.Calculator");
	//	cap.setCapability("automationName", "UiAutomator2");
		
	    URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AndroidDriver<MobileElement>(url,cap);
		
}
	catch(Exception e){
		
		System.out.println(e.getMessage());
		e.printStackTrace();
	}	 
	
	}
	
	@Test
	public void OpenGoogleTest(){
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		System.out.println("test one done");
		
	}
	
	@Test
	public void OpenChromeTest(){
		
		driver.get("www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		System.out.println("test one done");
		
	}

	
	public void TearDown(){
		
       driver.close();
       driver.quit();
	}

}
