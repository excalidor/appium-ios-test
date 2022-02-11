import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseIOSTest {

    public static void main (String [] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.4");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT,1000000);
        capabilities.setCapability("commandTimeouts","1000000");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"1000000");
        capabilities.setCapability(MobileCapabilityType.APP,"Users/doru/Documents/GitHub/appium-ios-test/src/main/test/java/UICatalog.app");
        capabilities.setCapability(IOSMobileCapabilityType.WDA_CONNECTION_TIMEOUT,1000000);
        capabilities.setCapability(IOSMobileCapabilityType.WDA_LAUNCH_TIMEOUT,1000000);
        IOSDriver driver = new IOSDriver<>(new URL("http://0.0.0.0:4725/wd/hub"),capabilities);

        driver.findElementByName("Action Sheets").click();
        driver.findElementByName("Okay / Cancel").click();
        driver.findElementByName("OK").click();
        driver.findElementByName("UICatalog").click();
        System.out.println(driver.getPageSource());
        System.out.println("***********************************");
        driver.navigate().back();
        driver.findElementByName("Activity Indicators").click();
        driver.navigate().back();
        driver.findElementByName("Alert Views").click();
        driver.findElementByName("Simple").click();
        System.out.println(driver.getPageSource());
        driver.findElementByName("OK").click();
        driver.findElementByName("Okay / Cancel").click();
        driver.findElementByName("OK").click();
        driver.navigate().back();
        driver.findElementByName("Buttons").click();
        driver.navigate().back();
        driver.findElementByName("Date Picker").click();
        driver.navigate().back();
        driver.findElementByName("Image View").click();

    }
}
