package tests.day16_notations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.TestBase;

import java.time.Duration;

public class C04_DependsOnMethods  {

    //dependsonMethods test methodlarının calısma sıralamasına karısmaz sadece bagli oldugu testin sonucuna gore calısıp calısmayabilir
WebDriver driver ;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver() .setup() ;
        driver =new ChromeDriver() ;
        driver .manage() .window() .maximize() ;
        driver .manage() .timeouts() .implicitlyWait(Duration.ofSeconds(10) );
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000) ;
        driver .close();

    }


    @Test
    public void test01(){
        //amazon sayfasına gidelim
        driver .get("https://www.ramazon1.com");
    }

    @Test (dependsOnMethods = "test01", priority = 1)
    public void test02() {
//nutella aratalım
       WebElement aramakutusu=  driver .findElement(By.id("twotabsearchtextbox"));
       aramakutusu .sendKeys("Nutella"+ Keys.ENTER ) ;

    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
//sonuc yazısının nutella icerdiğini test edelim
        WebElement sonucyazisi=driver .findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div")) ;

        Assert.assertTrue(sonucyazisi .getText() .contains("Nutella") );


    }
    @Test(groups = {"grup1", "grup2"})
    public void bagimsizTest() {
        System.out.println("bagimsiztest calisti");


    }
}
