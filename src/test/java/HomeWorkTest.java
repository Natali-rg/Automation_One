import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeWorkTest {
    static final String BASEURL="https://ithillel.ua";

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getDriver(BROWSER.valueOf("CHROME"));
        driver.get(BASEURL);
        driver.findElement(By.xpath("//*[@id=\"body\"]/div/main/section[2]/div/div/div[1]/div/ul/li[2]/a/div/p[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"categories\"]/div[2]/div/ul/li/div/div/ul/li[2]/a/div[2]/p[1]")).click();
        if (driver.getTitle()
                .equals("QA Automation курсы: курсы по автоматизации тестирования в Киеве | Комп'ютерна школа Hillel")) {
            System.out.println("You found QA Automation courses!!!");
        }else System.out.println("You not found this page");

        WebElement searchField=driver.findElement(By.id("btn-consultation-hero"));
        if (searchField.isDisplayed()){
            System.out.println("True, this button exists");
        }else System.out.println("False, this button didn't load");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {
            driver.quit();
        }

        driver.quit();
    }
}
