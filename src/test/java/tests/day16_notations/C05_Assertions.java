package tests.day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_Assertions extends TestBase {

    @Test
    public void test01() {
        //1.amazon anasayfaya gidin
        driver .get("https://www.amazon.com");
        //2.title in Amazon icerdiğini test edin
        Assert.assertTrue(driver .getTitle() .contains("KKKKAmazon") );  //BU CLASS TA İKİ TANE HATA VERMESİ GEREKEN YER VAR YANİ TEST FAİLED OLAN İKİ YER
        //BUNLARDAN BİRİ BURADAKİ VE DİĞERİ DE ASAGIDAKİ AMA BURADA SADECE İLK HATAYİ VERİR VE SONRAKİ TESTLERİN YAPILMASINA İZİN VERMEZ
        //HATALARIN HEPSİNİ BİR ARADA GORMEK İCİN SOFT ASSERTİON YAPMAMIZ GEREKİYOR O DA Bİ SONRAKİ CLASS DA OLACAK






        //3.Arama Kutusunun erisilebilir oldugunu test edin
        Assert.assertTrue( driver .findElement(By.id("twotabsearchtextbox") ).isEnabled());
        //4.arama kutusuna nutella yazip aratin
        driver .findElement(By.id("twotabsearchtextbox") ).sendKeys("Nutella"+ Keys.ENTER );

        //5.arama yapıldıgını test edin
        Assert .assertTrue(driver .findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div")).isDisplayed() ) ;
        //6.arama sonucunun nutella ıcerdıgını test edin


        Assert .assertTrue(driver .findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText() .contains("Kuuuutella") );



    }
}
