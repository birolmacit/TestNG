package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_BeforeMethod_AfterMethod extends TestBase  {

    //@BeforeMethod ve @AfterMethod notasyonları
    // junıt deki @Before ve @After gibidir
    // her test methodundan once ve sonra calıstırılır

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
