package tests.day17_POM;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.Driver;

import javax.swing.*;

public class C03_PageClassKullanimi {

    @Test
    public void test01() throws InterruptedException {
        FaceBookPage faceBookPage = new FaceBookPage();

        //facebook ana sayfaya gidin
        Driver.getDriver() .get("https://www.facebook.com");
        //kullanıcı mail kutusuna rastgele bir isim yazdırın
        Faker faker=new Faker();
        faceBookPage .emailKutusu .sendKeys(faker.internet() .emailAddress() ) ;

        //kullanıcı sifre kutusuna rastgele bir password yazdırın
        faceBookPage .passwordKutusu .sendKeys(faker .internet() .password() ) ;

        //login butonuna basın
        faceBookPage .loginTusu .click() ;


Thread .sleep(4000) ;
        Driver .closeDriver();

    }
}
