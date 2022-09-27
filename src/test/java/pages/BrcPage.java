package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {

   public  BrcPage(){
        PageFactory .initElements(Driver .getDriver() ,this );
    }

    @FindBy(xpath = "//a[@role='button']")
    public WebElement ilkloginButonu;

   @FindBy (xpath = "//input[@name='email']")
    public WebElement emailbox;

   @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordbox;

   @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement ikinciLoginButonu;


}
