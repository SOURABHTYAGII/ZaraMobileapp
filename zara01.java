package zara;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import bsh.Capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.internal.CapabilityHelpers;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class zara01 {
    AndroidDriver<WebElement> driver;
		
 @BeforeTest 
	public void Rider() throws MalformedURLException, InterruptedException {
			
			 DesiredCapabilities dc=new DesiredCapabilities();
			 dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
			 dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
			 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.inditex.zara");
			 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.inditex.zara.MainActivity");
			 driver =new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			 Thread.sleep(2000);
		  
	}
		@Test
		   public void Login() throws MalformedURLException, InterruptedException {
			 driver.findElement(MobileBy.id("com.inditex.zara:id/welocmeAccessButton")).click(); //com.inditex.zara:id/accountTab2
             Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
			 Thread.sleep(5000);
			 driver.findElement(MobileBy.id("com.inditex.zara:id/accountTab2")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@text='REGISTER']")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//*[@text='EMAIL.']")).sendKeys("mailatsourabh@gmail.com");//EMAIL.
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@text='PASSWORD.']")).sendKeys("Sourabh@123");//REPEAT PASSWORD.
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@text='REPEAT PASSWORD.']")).sendKeys("Sourabh@123");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@text='NAME.']")).sendKeys("Sourabh");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@text='LAST NAME.']")).sendKeys("Tyagi");
			 Thread.sleep(2000);
			 driver.findElement(MobileBy.id("com.inditex.zara:id/addressItemCheckbox")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@text='CREATE ACCOUNT']")).click();
}
}






