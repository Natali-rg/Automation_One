import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {
    public static void main(String[] args) {
        WebDriver driver=DriverFactory.getDriver(BROWSER.valueOf("CHROME"));
        driver.get("https://google.com");
        WebElement searchFild=driver.findElement(By.name("q"));
        searchFild.sendKeys("Java");
        searchFild.submit();




        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {
            driver.quit();
        }


        driver.quit();
    }
}
