import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends BaseTest {

    String username = "Test";
    String password = "12qw!@QW";


    @Before
    public void start() {
        this.driverInit();
        this.get();
    }

    @Test
    public void testGoogleSearch() throws InterruptedException  {
        UserPage userPage = new LoginPage(driver).doLogin(username, password);

    }

    @After
    public void stop(){
        driverDown();
    }
}
