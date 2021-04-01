import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;

    BaseTest() {
    }

    public void driverInit() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/alesa/Documents/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void get() {
        driver.manage().window();
        driver.get("https://ok.ru/");
    }

    public void driverDown() {
        driver.quit();
    }
}
