package com.appium.AppiumDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumFirstTest {

	@Test
	public void test() throws MalformedURLException, InterruptedException
	{
		UiAutomator2Options option=new UiAutomator2Options();
		option.setDeviceName("Bhoomika2");
		option.setApp("C:\\Automation\\ApiDemos-debug.apk");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),option);
		Thread.sleep(3000);
		
		
		driver.quit();
		
				
	}
}
