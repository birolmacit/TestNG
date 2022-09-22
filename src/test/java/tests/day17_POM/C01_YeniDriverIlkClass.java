package tests.day17_POM;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_YeniDriverIlkClass {
    @Test
    public void test01()  {
        Driver.getDriver().get("https://www.amazon.com");

       /*bugune kadar testbase class ına extends ederek kullandıgımız driver yerine bundan sonra Driver class ından kullanıcagımız
       getDriver  static methodunu kullanıcaz

       Driver.getDriver()     in
       driver                 out

       */

        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.getDriver().get("https://www.facebook.com");

        Driver .closeDriver() ;
    }
}
