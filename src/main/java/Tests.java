import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class Tests {
    private AndroidDriver driver;

    public Tests() throws MalformedURLException {
        driver = DriverManager.get();
    }

    @Test
    public void main() {
        Assert.assertTrue(driver.findElementByName("Apps").isDisplayed());
        Assert.assertTrue(driver.findElementByName("Browser").isDisplayed());
        Assert.assertTrue(driver.findElementByName("Camera").isDisplayed());
        Assert.assertTrue(driver.findElementByName("Messaging").isDisplayed());
        Assert.assertTrue(driver.findElementByName("Phone").isDisplayed());
    }

    @Test
    public void calculator() {
        driver.findElementByName("Apps").click();
        driver.findElementByName("Calculator").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"9\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"+\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"8\")").click();
        String result = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.calculator2:id/result\")").getText();

        Assert.assertTrue(result.equals("17"));
    }
}
