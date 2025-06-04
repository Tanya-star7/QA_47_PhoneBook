package manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class AplicationManager {
    private WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }
    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
        driver.manager().window().maximize();
        driver.manager().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }

    @AfterMethod

}
