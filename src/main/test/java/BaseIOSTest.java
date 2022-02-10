import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseIOSTest {

    public static void main (String [] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"14.2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT,50000);
        capabilities.setCapability("commandTimeouts","12000");
        capabilities.setCapability(MobileCapabilityType.APP,"Users/doru/Desktop/UICatalog.app");
        IOSDriver driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"),capabilities);
    }
}
