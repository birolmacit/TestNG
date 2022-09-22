package tests.day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.List;

public class C07_SoftAssertExercise extends TestBase  {

    @Test
    public void test01() {

        //1. “http://zero.webappsecurity.com/” Adresine gidin
        driver .get("http://zero.webappsecurity.com/") ;

        //2. Sign in butonuna basin
        driver .findElement(By.xpath("//*[@id=\"signin_button\"]")).click() ;

        Actions actions =new Actions(driver);
        WebElement login=driver .findElement(By.xpath("//*[@id=\"user_login\"]"));
        //3. Login kutusuna “username” yazin

        //4. Password kutusuna “password” yazin
        //5. Sign in tusuna basin
        actions .click(login ).sendKeys("username").sendKeys(Keys.TAB ).sendKeys("password").sendKeys(Keys.ENTER ).perform() ;
        driver .navigate() .back() ;
        //6. Online banking menusu icinde Pay Bills sayfasina gidin
        driver .findElement(By.xpath("//*[@id=\"onlineBankingMenu\"]/div/strong")).click() ;
        driver .findElement(By.xpath("//*[@id=\"pay_bills_link\"]")).click() ;

        //7. “Purchase Foreign Currency” tusuna basin
        driver .findElement(By.xpath("//*[@id=\"tabs\"]/ul/li[3]/a")).click() ;
        //8. “Currency” drop down menusunden Eurozone’u secin
        WebElement ddmelenti=driver .findElement(By.xpath("//*[@id=\"pc_currency\"]"));
        Select ddm=new Select(ddmelenti );
        ddm .selectByValue("EUR");
        //9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        SoftAssert softAssert=new SoftAssert();
        System.out.println(ddm.getFirstSelectedOption().getText() );
        softAssert .assertEquals(ddm.getFirstSelectedOption().getText(),"Eurozone (Euro)","euro secilmemis");

        //10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin

        List<WebElement>dropdownmenuliste= ddm.getOptions();

        //"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
        //(yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
        //(dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
        //(dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"

        softAssert .assertAll();
    }
}
