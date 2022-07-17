import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver getDriver(BROWSER browser) {
        WebDriver driver=null;
        switch (browser) {
            case CHROME:
                driver = initChrome();
            break;
            case FIREFOX:
                driver = initFireFox();
            break;
        }
        return driver;
    }

    private static WebDriver initFireFox() {
        //System.setProperty("webdriver.firefox.driver", "D:\\Natali\\FireFoxDriver\\geckodriver.exe");
        return new FirefoxDriver();
    }

    private static WebDriver initChrome() {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new ChromeDriver();
    }


}
