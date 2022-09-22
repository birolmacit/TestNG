package tests.day17_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

import javax.swing.*;

public class C02_PageClassKullanimi {

    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        //amazona gidelim
        Driver .getDriver() .get("https://www.amazon.com");
        //nutella aratalım
        amazonPage .aramakutusu .sendKeys("nutella"+ Keys.ENTER );
        //sonuc yazısının nutella icerdiğini test edelim
        Assert .assertTrue(amazonPage .aramaSonucElemanti .getText() .contains("nutella") );
        Driver .closeDriver() ;
    }
}
