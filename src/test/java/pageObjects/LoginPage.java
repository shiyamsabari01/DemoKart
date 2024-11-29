package pageObjects;

import constantFiles.constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//input[@id='email']")
    private static WebElement emailBox;
    @FindBy(xpath = "//input[@id='passwd']")
    private static WebElement pwdBox;
    @FindBy(xpath = "//button[@id='SubmitLogin']/span")
    private static WebElement signInBtn;
    @FindBy(xpath = "//input[@id='email_create']")
    private static WebElement EmailCreate;
    @FindBy(xpath = "//button[@id='SubmitCreate']/span")
    private static WebElement createAccountBtn;


    public static void LoginCredentials(){
        emailBox.sendKeys(constants.USERNAME);
        pwdBox.sendKeys(constants.PASSWORD);
        signInBtn.click();
    }
    public static void createAccount(){
        EmailCreate.sendKeys("steaver46@gmail.com");
        createAccountBtn.click();
    }
}
