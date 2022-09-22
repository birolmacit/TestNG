package tests.day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.lang.ref.SoftReference;

public class C06_SoftAssert extends TestBase {


    @Test
    public void test01() {

        /* soft asssertion başlangıç ve bitiş satırları arasındaki verilen tum assertionlari yapip bitiş satırına geldiğinde
        bize buldugu tum hataları rapor eder.


        soft assert in başlangıcı obje olusturmaktır
         */
        SoftAssert softAssert = new SoftAssert();

        //1.amazon anasayfaya gidin
        driver .get("https://www.amazon.com");
        //2.title in Amazon icerdiğini test edin
        softAssert .assertTrue(driver .getTitle() .contains("KKKKAmazon"),"title amazon icermiyor" );



        //3.Arama Kutusunun erisilebilir oldugunu test edin
        softAssert.assertTrue( driver .findElement(By.id("twotabsearchtextbox") ).isEnabled(),"searchbox");
        //4.arama kutusuna nutella yazip aratin
        driver .findElement(By.id("twotabsearchtextbox") ).sendKeys("Nutella"+ Keys.ENTER );

        //5.arama yapıldıgını test edin
        softAssert .assertTrue(driver .findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div")).isDisplayed(),"sonuc gorulmuyor" ) ;
        //6.arama sonucunun nutella ıcerdıgını test edin


        softAssert .assertTrue(driver .findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText() .contains("Kuuuutella") ,"arama sonucu kutella icermiyor");


        //softAssert e bitis satırını soylemek icin assertAll()  kullanılır
        //bu satir yazılmazsa assertion gorevi yapılmamıs olur

        softAssert .assertAll() ;
        /*softassert un hata bulsa bile devam etme ozelliği assertAll() a kadardır
        eger assertAll() da faied rapor edilirse calısma durur ve class ın kalan kısmı calıstırılmaz
        yani assertAll hard assert deki her bir assert gibidir hatayı bulursa geri kalan kodları calıstırmaz ve test faied olarak biter
         */

        System.out.println("assertions lardan failed olan olursa burasi calısmaz ve yazdıramazsın");




    }
}
