package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceBookPage {
    public FaceBookPage () {
        PageFactory.initElements(Driver.getDriver() ,this );


    }
    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement emailKutusu;

    @FindBy (xpath = "//*[@id=\"pass\"]")
    public WebElement passwordKutusu;

    @FindBy (xpath = "//*[@name='login']")
    public WebElement loginTusu;

    @FindBy (xpath = "//*[@id=\"pass\"]")
    public WebElement passwordKutusu2;

}
