package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class MyAccountPage {

    @FindBy(xpath = "//a/span[text()='Order history and details']")
    private static WebElement orderAndHistory;

    @FindBy(xpath = "//a/span[text()='My addresses']")
    private static WebElement myAddressPage;

    @FindBy(xpath = "//a/span[text()=' Home']")
    private static WebElement homePage;

    @FindBy(xpath = "//a[@class='logout']")
    private static WebElement signOutBtn;

    public static void clickOnSignOut() {
        signOutBtn.click();
    }

    public static boolean verifyOnOandHPage() {
        if (orderAndHistory.isDisplayed()) {
            System.out.println("OrderAndHistory Option is displayed");
        } else {
            System.out.println("Not displayed");
        }
        return true;
    }

    public static boolean verifyAddressPage() {
        if (myAddressPage.isDisplayed()) {
            System.out.println("My Address Option is displayed");
        } else {
            System.out.println("Not displayed");
        }
        return true;
    }

    public static boolean verifyHomePage() {
        if (homePage.isDisplayed()) {
            System.out.println("Home Page Option is displayed");
        } else {
            System.out.println("Not displayed");
        }
        return true;
    }
}
