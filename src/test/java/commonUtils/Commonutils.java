package commonUtils;

import constantFiles.constants;
import driverManager.DriverManger;
import org.openqa.selenium.support.PageFactory;
import pageObjects.IndexPage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

import java.io.IOException;
import java.util.Properties;

public class Commonutils {

    public void loadProperties(){
        Properties properties=new Properties();
        try {
            properties.load(getClass().getResourceAsStream("/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        constants.APP_URL= properties.getProperty("URL");
        constants.USERNAME=properties.getProperty("Username");
        constants.PASSWORD=properties.getProperty("Password");
        constants.BROWSER=properties.getProperty("Browser");
    }
    public void initElement(){
        PageFactory.initElements(DriverManger.getDriver(), IndexPage.class);
        PageFactory.initElements(DriverManger.getDriver(), LoginPage.class);
        PageFactory.initElements(DriverManger.getDriver(), MyAccountPage.class);
    }
}
