package tests.day21_reusableMethods_HtmlReports;

import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTestiRaporu  {
    @Test
    public void positiveLoginTest() {
        // Bir test method olustur positiveLoginTest()
        //https://www.bluerentalcars.com adresine git
        //login butonuna bas
        //test data username: customer@bluerentalcars.com ,
        //test data password : 12345
        //login butonuna tıklayınız
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Driver.getDriver() .get(ConfigReader.getProperty("brcUrl") );
        BrcPage brcPage = new BrcPage();
        brcPage .ilkloginButonu.click() ;
        brcPage .emailbox .sendKeys(ConfigReader .getProperty("brcEmail") );
        brcPage .passwordbox .sendKeys(ConfigReader .getProperty("brcPassword") ) ;
        brcPage .ikinciLoginButonu .click() ;

        Driver .closeDriver() ;
    }


}
