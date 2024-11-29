package testCases;

import com.aventstack.extentreports.Status;
import commonFunction.CommonFunctions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MyAccountPage;

public class MyAccountTest extends CommonFunctions {
    private static final Logger LOGGER= LogManager.getLogger(MyAccountPage.class);

    @Test
    public void validOrderAndHistoryPage(){
        testCase=extentReports.createTest("Verify order & History");
        testCase.log(Status.INFO,"Verifying the Order and History Page Option");
        LOGGER.info("Verifying the Order and History Page Option");
        boolean accountPage=MyAccountPage.verifyOnOandHPage();
        Assert.assertTrue(accountPage,"Order page option is not displayed");
        LOGGER.info("Order and History Page Option is displayed");
        testCase.log(Status.INFO,"Order and History Page Option is displayed");
    }
    @Test(dependsOnMethods = "validOrderAndHistoryPage")
    public void validAddressPage(){
        testCase=extentReports.createTest("Verify Address Page");
        testCase.log(Status.INFO,"Verifying the Address Page Option");
        LOGGER.info("Verifying the Address Page Option");
        boolean addressPage=MyAccountPage.verifyAddressPage();
        Assert.assertTrue(addressPage,"Address page option is not displayed");
        LOGGER.info("Address Page Option is displayed");
        testCase.log(Status.INFO,"Address Page Option is displayed");
    }
    @Test(dependsOnMethods = "validAddressPage")
    public void validHomePage(){
        testCase=extentReports.createTest("Verify Home Page");
        testCase.log(Status.INFO,"Verifying the Home Page Option");
        LOGGER.info("Verifying the Home Page Option");
        boolean HomePage=MyAccountPage.verifyHomePage();
        Assert.assertTrue(HomePage,"Address page option is not displayed");
        LOGGER.info("Home Page Option is displayed");
        testCase.log(Status.INFO,"Home Page Option is displayed");
    }
}
