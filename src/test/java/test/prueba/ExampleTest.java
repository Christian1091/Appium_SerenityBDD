package test.prueba;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ExampleTest {

    private AppiumDriver driver;

    @BeforeEach
    public void configurationAppium() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setDeviceName("emulator-5554")
                .setApp("D:\\Users\\Asus TUF\\Desktop\\Christian\\Pruebas Remoto\\Neoris\\Appium Sauce Labs\\mda.apk")
                .setAutoGrantPermissions(true);
        /*.setAppPackage("com.android.chrome")
                .setAppActivity("com.google.android.apps.chrome.Main");*/
        options.setAppWaitActivity("com.saucelabs.mydemoapp.android.view.activities.MainActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
    }

    @Test
    public void exampleTestSerenity() {

        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement shortsButton = wait.until(
                ExpectedConditions.presenceOfElementLocated(AppiumBy.className("android.widget.Button"))
        );
        shortsButton.click();*/
    }
}
