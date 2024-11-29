package commonFunction;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import constantFiles.constants;
import driverManager.DriverManger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import commonUtils.Commonutils;

public class CommonFunctions {
    private static final Logger LOGGER = LogManager.getLogger(CommonFunctions.class);
    public static ExtentReports extentReports;
    public static ExtentSparkReporter sparkReporter;
    public static ExtentTest testCase;

    @BeforeSuite
    public void beforeScenario() {
        try {
            Commonutils commonutils = new Commonutils();
            LOGGER.info("Loading the Property Files");
            commonutils.loadProperties();
            LOGGER.info("Verifying the Browser is NULL or NOT");
            if (DriverManger.getDriver() == null) {
                LOGGER.info("Launching the Browser");
                extentReports=new ExtentReports();
                sparkReporter=new ExtentSparkReporter("ExtentReports.html");
                extentReports.attachReporter(sparkReporter);
                DriverManger.launchBrowser();
            }
            LOGGER.info("Initialize the Property Files");
            commonutils.initElement();
            LOGGER.info("Launching the Application URL");
            DriverManger.getDriver().navigate().to(constants.APP_URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void tearDown() {
        try {
            extentReports.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
