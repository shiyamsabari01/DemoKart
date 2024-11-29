package pageObjects;

import driverManager.DriverManger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

   @FindBy(xpath = "//a[@title='My Shop']/img")
    private static WebElement storeLogo;
   @FindBy(xpath = "//a[@class='login']")
    private static WebElement signInBtn;
   @FindBy(xpath = "//input[@id='search_query_top']")
   private static WebElement productSearch;

   public static boolean validateLogo(){

       if (storeLogo.isDisplayed()){
           System.out.println("logo is displayed");
       }
       return true;
   }
   public static void clickOnSignIn(){
       signInBtn.click();
   }
   public static void productSearch(){
       productSearch.sendKeys("Blouses", Keys.ENTER);
   }
}
