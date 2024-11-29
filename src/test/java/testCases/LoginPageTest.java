package testCases;

import com.aventstack.extentreports.Status;
import commonFunction.CommonFunctions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pageObjects.IndexPage;
import pageObjects.LoginPage;

public class LoginPageTest extends CommonFunctions {
private static final Logger LOGGER= LogManager.getLogger(LoginPageTest.class);
    @Test
    public void loginFun(){
        testCase=extentReports.createTest("Navigating the Login page Functionality");
        testCase.log(Status.INFO,"Verifying able to click the SignIn Button");
        LOGGER.info("Verifying able to click the SignIn Button");
        IndexPage.clickOnSignIn();
        testCase.log(Status.INFO,"Successfully Navigated to Login Page");
        LOGGER.info("Successfully Navigated to Login Page");
    }
    @Test(dependsOnMethods = "loginFun")
    public void loginTest(){
        testCase=extentReports.createTest("Verifying the Login Functionality");
        testCase.log(Status.INFO,"Verifying able to Enter the Login credentials");
        LOGGER.info("Verifying able to Enter the Login credentials");
        LoginPage.LoginCredentials();
        LOGGER.info("Successfully Navigated to My Account Page");
        testCase.log(Status.INFO,"Successfully Navigated to My Account Page");
    }
}
