package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestBase {
    //abstract yapmamızın sebebi bu class dan obje uretılmesının onune gecmektir

    protected WebDriver driver;

    @BeforeMethod //JUNIT DEKİ BEFORE İLE AYNI MANTIKTA CALISIR
    public void setUp(){

        WebDriverManager .chromedriver() .setup() ;
        driver =new ChromeDriver() ;
        driver .manage() .window() .maximize() ;
        driver .manage() .timeouts() .implicitlyWait(Duration.ofSeconds(10) );
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000) ;
        driver .close();

    }
}
