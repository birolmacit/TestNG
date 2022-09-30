package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBaseCross {

    protected WebDriver driver;
@Parameters("browser")
    @BeforeMethod //JUNIT DEKİ BEFORE İLE AYNI MANTIKTA CALISIR
    public void setUp(@Optional String browser) {


        driver =CrossDriver.getDriver(browser ) ;
        driver .manage() .window() .maximize() ;
        driver .manage() .timeouts() .implicitlyWait(Duration.ofSeconds(10) );
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000) ;
        CrossDriver  .closeDriver() ;

    }
}
