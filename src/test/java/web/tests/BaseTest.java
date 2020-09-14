package web.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import od.utilities.OD;
import od.utilities.Web;

public class BaseTest {

	static Logger log = LogManager.getLogger(BaseTest.class.getName());
	public WebDriver offLoadDigital;

	@BeforeSuite
	public void beforeSuite() {

		Web.initDriver("chrome");
		//WebDriverManager.chromedriver().setup();
		OD.Web.OpenURL("https://offload.digital/");
		Web.GetDriver().manage().window().maximize();
		//wait = new WebDriverWait(offLoadDigital, 30);
	}

	@BeforeMethod
	public void beforeTest() {
	}

	@AfterMethod
	public void afterTest() {
	}

	@AfterSuite
	public void afterSuite() {
		Web.getBrowser().QuitBrowser();
		log.info("Browser Closed Successfully");
	}
}
