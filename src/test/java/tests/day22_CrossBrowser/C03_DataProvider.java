package tests.day22_CrossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {

    //amazon anasayfaya gidelim
    //nutella icin arama yapalım
    //sonucların nutella ıcerdıgını test edelim

    @Test
    public void test01() {
        Driver .getDriver().get(ConfigReader .getProperty("amazonUrl") ) ;

        AmazonPage amazonPage =new AmazonPage();
        amazonPage .aramakutusu .sendKeys("nutella"+ Keys.ENTER ) ;

        Assert.assertTrue(amazonPage .aramaSonucElemanti.getText() .contains("nutella") ) ;

        Driver .closeDriver() ;

    }
    @DataProvider
    public static Object[][] AranacakKelimeler() {
        Object[][] aranankelimeArrayi = {{"nutella"},{"java"},{"cigdem"},{"Netherlands"}};
        return aranankelimeArrayi;
    }


    @Test(dataProvider = "AranacakKelimeler")
    //arayacagımız kelimeleri bir liste gibi tutup
    // bana yollayacak bir veri saglayıcısı olusturacagız
    public void dataProviderTesti(String aranankelime){
        Driver .getDriver().get(ConfigReader .getProperty("amazonUrl") ) ;
        //nutella , java, cigdem ve Netherlands icin arama yapalım
        AmazonPage amazonPage =new AmazonPage();
        amazonPage .aramakutusu .sendKeys(aranankelime + Keys.ENTER ) ;
        //sonucların aradıgımız kelime icerdiğini test edelim
        Assert.assertTrue(amazonPage .aramaSonucElemanti.getText() .contains(aranankelime ) ) ;

        Driver .closeDriver() ;




    }
}
