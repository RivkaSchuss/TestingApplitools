package main.java;

import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

    public static void main(String[] args) {
        Eyes eyes = new Eyes();
        eyes.setApiKey(System.getenv("APPLITOOLS_API_KEY"));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        RemoteWebDriver driver = new ChromeDriver(options);
        driver.get("https://applitools.com/");
        eyes.open(driver,"Jenkins/Github","Jenkins/Github");
        System.out.println("Hello World");
        eyes.checkWindow("Initial view");
        System.out.println("hi");
        driver.quit();
        eyes.close();

    }
}
