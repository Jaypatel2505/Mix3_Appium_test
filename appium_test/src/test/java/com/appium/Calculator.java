package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class Calculator {
	@Test
	public void cal() throws InterruptedException, MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Nexus 5X API 28");
		cap.setCapability("udid","emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9.0");
//		cap.setCapability( "appPackage","com.transsion.calculator");
//		cap.setCapability("appActivity","com.transsion.calculator.Calculator");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url = new URL("http://127.0.0.1:4723/");
		
		AppiumDriver driver = new AppiumDriver(url, cap);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		

	}
}
