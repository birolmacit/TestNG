package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeClass_AfterClass extends TestBase {

    //Junıt de @BeforeClass ve @AfterClass notasyonuna sahip methodlar static olmak zorundaydı ama testNG de bu zorunluluk yoktur

    /*testNG bize daha fazla before ve after notasyonları sunar
    diger before after notasyonları tanımlayacagımız grup, test veya suit den once ve sonra calısırlar
    ieride xml dosyaları ile birlikte bunları gorecegız
     */

    @BeforeClass
    public void beforeClassMethodu(){
        System.out.println("Before Class calisti");
    }
    @AfterClass
    public void AfterClassMethodu(){
        System.out.println("After Class calisti");
    }

    @Test
    public void techprotesti() {
        driver .get("https://www.techproeducation.com");
    }

    @Test
    public void amazontesti() {
        driver .get("https://www.amazon.com");
    }
    @Test
    public void bestbuytesti() {
        driver .get("https://www.bestbuy.com");
    }


}
