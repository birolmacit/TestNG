package tests.day18_POM;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanimi {
    @Test
    public void test01() throws InterruptedException {

        FaceBookPage faceBookPage = new FaceBookPage();

        //facebook ana sayfaya gidin
        Driver .getDriver() .get(ConfigReader .getProperty("facebookUrl") ) ;



        //kullanıcı mail kutusuna yanlış bir isim yazdırın
        faceBookPage .emailKutusu .sendKeys(ConfigReader .getProperty("facebookWrongUserName")) ;



        //kullanıcı sifre kutusuna yanlış bir password yazdırın
        faceBookPage .passwordKutusu .sendKeys(ConfigReader .getProperty("facebookWrongPassword"));



        //login butonuna basın
        faceBookPage .loginTusu .click() ;



        Thread .sleep(4000) ;
        Driver .closeDriver();
    }
}
