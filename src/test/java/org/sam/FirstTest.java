package org.sam;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class FirstTest {
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		cap.setCapability("deviceName", "vivo Y20G");
		cap.setCapability("udid", "9633117090001PV");
		cap.setCapability("appPackage", "com.vivo.calculator");
		cap.setCapability("appActivity", "com.vivo.calculator.ExchangeActivity");
		URL url= new URL("http://0.0.0.0:4723/wd/hub");
		 driver= new AndroidDriver(url,cap);

	}

}
