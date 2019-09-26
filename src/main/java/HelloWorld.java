package main.java;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

    public static void main(String[] args) {
        Eyes eyes = new Eyes();
        eyes.setApiKey(System.getenv("APPLITOOLS_API_KEY"));
        String batchName = null;
        String batchId   = System.getenv("APPLITOOLS_BATCH_ID");

        // set the batch
        BatchInfo batchInfo = new BatchInfo(batchName);
//        batchInfo.setId(batchId);
        eyes.setBatch(batchInfo);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        RemoteWebDriver driver = new ChromeDriver(options);
        driver.get("https://applitools.com/");
        eyes.open(driver,"Jenkins/Github","Jenkins/Github");
        System.out.println("Hello World");
        eyes.checkWindow("Initial view");
        System.out.println("This is a merge print");
        driver.quit();
        eyes.close();

    }
}
