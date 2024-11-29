package testCases;

import com.aventstack.extentreports.Status;
import commonFunction.CommonFunctions;
import driverManager.DriverManger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.IndexPage;

import java.util.concurrent.TimeUnit;

public class IndexPageTest extends CommonFunctions {
    private static final Logger LOGGER = LogManager.getLogger(IndexPage.class);

    @Test
    public void verifyLogo() {
        testCase = extentReports.createTest("Verifying the Logo");
        testCase.log(Status.INFO, "Verifying the Title");
        LOGGER.info("Verifying the Title");
        String PageTitle = DriverManger.getDriver().getTitle();
        LOGGER.info("Printing the Title");
        testCase.log(Status.INFO, "Printing the Title");
        System.out.println("Page Title is: " + PageTitle);
        LOGGER.info("Validating the Logo");
        testCase.log(Status.INFO, "Validating the Logo");
        boolean result = IndexPage.validateLogo();
        Assert.assertTrue(result, "Logo is not displayed");
        DriverManger.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(dependsOnMethods = "verifyLogo")
    public void searchProduct() {
        testCase = extentReports.createTest("Searching the Product in Cart");
        testCase.log(Status.INFO, "Searching the Product");
        LOGGER.info("Searching the Product");
        IndexPage.productSearch();
        testCase.log(Status.INFO, "Product is displayed");
        LOGGER.info("Product is displayed");
    }
}
