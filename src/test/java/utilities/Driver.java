package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
   /* page object model de yani pom da driver icin testbase class ına extends
   etmek yerine driver class ımızdan  static methodlar kullanarak driver olusturup ılgılı
    ayarların yapılması ve en sonunda drıver in kapatılması tercıh edılmıstır
    */

   static  WebDriver driver;



    public static WebDriver  getDriver(){

        if (driver == null) {
            switch (ConfigReader .getProperty("browser") ){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "safari":
                    WebDriverManager.safaridriver() .setup();
                    driver = new SafariDriver() ;
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver() .setup();
                    driver = new FirefoxDriver() ;
                    break;


                case "headless-chrome":
                    WebDriverManager.chromedriver() .setup() ;
                    driver =new ChromeDriver(new ChromeOptions() .setHeadless(true) );
                    break;


                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();


            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver ;

    }

    public static void closeDriver() {
        if(driver != null) //driver null degılse yani deger atanmıs ise
        {
            driver .close() ;
            driver =null ;
        }


    }

}
