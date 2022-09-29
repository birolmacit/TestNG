package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_Priority extends TestBase  {
    /* TestNG test methodlarını isim sıralamasına gore calısır
    eger isim sıralamasının dısında bir siralama ile calısmasını isterseniz o zaman test methodlarına oncelik (priority)
    tanımlayabiliriz.

    priority kucukten buyuge gore calısır

    eger bir test methoduna priority degeri atanmamıs ise priority degeri sıfır olarak belirlenir

    ne kadar düsük priority degeri verilirse once omnlar baslar mesela 0 olan 1 den once baslar



     */

    @Test (priority = 5)
    public void techprotesti() {
        driver .get("https://www.techproeducation.com");
    }

    @Test (priority = 2)
    public void amazontesti() {
        driver .get("https://www.amazon.com");
    }
    @Test (priority = -20,groups = "grup1")
    public void bestbuytesti() {
        driver .get("https://www.bestbuy.com");
    }


}


