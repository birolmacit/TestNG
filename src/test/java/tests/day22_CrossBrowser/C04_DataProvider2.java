package tests.day22_CrossBrowser;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_DataProvider2 {

    @DataProvider
    public static Object[][] MailVeSifre() {
        Object[][] mailVeSifre = {{"ahmet","456"},{"mehmet","456"}};
        return mailVeSifre ;
    }

    @Test(dataProvider = "MailVeSifre")
    public void yanlisSifreTesti(String userMail, String password) {
        // Bir test method olustur positiveLoginTest()
        //https://www.bluerentalcars.com adresine git
        //login butonuna bas
        //login butonuna tıklayınız
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Driver.getDriver() .get(ConfigReader.getProperty("brcUrl") );
        BrcPage brcPage = new BrcPage();
        brcPage .ilkloginButonu.click() ;
        brcPage .emailbox .sendKeys(userMail  );
        brcPage .passwordbox .sendKeys(password  ) ;
        brcPage .ikinciLoginButonu .click() ;

        Driver .closeDriver() ;
    }
}
