package od.utilities;

import java.io.File;
import org.apache.commons.exec.OS;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web {
	
	public static Type Type = od.utilities.Type.performType();
	public static Click Click = od.utilities.Click.performClick();
	public static Select Select = od.utilities.Select.performSelect();

	private static Web web = null;
	static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<WebDriver>();
	public static WebDriverWait wait = null;
	static String browserName;

	protected Web() { }

	public static synchronized Web getBrowser() {
		if(web == null) {
			web = new Web();
			System.out.println("Initialized web instance");
		}
		return web;
	}

	public final static void initDriver(String browser) {
		SetBrowserName(browser);
		DesiredCapabilities objCapabilities=null;

		switch(browser) {

		case "chrome":
			LoggingPreferences prefs1 = new LoggingPreferences();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--incognito");
			chromeOptions.addArguments("test-type");
			chromeOptions.addArguments("--disable-plugin", "--disable-extensions", "--disable-popup-blocking");
			chromeOptions.addArguments("--lang=en-ca");
			//	chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);

			objCapabilities = new DesiredCapabilities();
			objCapabilities = DesiredCapabilities.chrome();
			objCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			objCapabilities.setCapability(CapabilityType.LOGGING_PREFS, prefs1);
			objCapabilities.setCapability("platform", "MAC");
			objCapabilities.setCapability("browserName", "chrome");
			objCapabilities.setCapability("applicationCacheEnable", false);
			objCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			if(OS.isFamilyWindows())
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "driver" + File.separator + "chromedriver.exe");
			else
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "driver" + File.separator + "chromedriver");
			webDriverThreadLocal.set(new ChromeDriver(chromeOptions));
			//			log.log_INFO("Opening Chrome browser");
			break;

		}
		wait = new WebDriverWait(GetDriver(), 60);
	}

	public boolean OpenURL(String URL) {
		GetDriver().get(URL);
		return true;
	}

	public boolean NavigateToURL(String URL) {
		GetDriver().navigate().to(URL);
		return true;
	}

	public static WebDriver GetDriver() {
		if(webDriverThreadLocal.get().equals(null))
			initDriver(GetBrowserName());
		return webDriverThreadLocal.get();
	}

	public static void SetBrowserName(String browser) {
		browserName= browser;
	}

	public static String GetBrowserName() {
		return browserName;
	}

	public By GetBy(String by) {
		by = by.toLowerCase();
		String[] bys = by.split("==");
		switch(bys[0]) {
		case "id":
			return By.id(bys[1]);
		case "xpath":
			return By.xpath(bys[1]);
		}
		return null; 
	}

	public WebElement GetWebElement(String by) {
		by = by.toLowerCase();
		String[] bys = by.split("==");
		switch(bys[0]) {
		case "id":
			return GetDriver().findElement(By.id(bys[1]));
		case "xpath":
			return GetDriver().findElement(By.xpath(bys[1]));
		}
		return null; 
	}

	public boolean Type_Using_SendKeys(String by, String text) {
		GetWebElement(by).sendKeys(text);
		return true;
	}

	public boolean Clear_TextField(By by) {
		GetWebElement(by).clear();
		return true;
	}

	public boolean Type_InTo_TextField(String by, String text) {
		GetWebElement(GetBy(by)).sendKeys(text);
		return true;
	} 

	/**
	 *  Get web element
	 * @param by
	 * @return
	 */
	public WebElement GetWebElement(By by) {
		WebElement webElement = GetDriver().findElement(by);
		HighLight_WebElement(webElement);
		return webElement;
	}

	public WebElement GetWebElement(WebElement e) {
		HighLight_WebElement(e);
		return e;
	}

	/**
	 *  Highlight web element
	 * @param e
	 */
	public void HighLight_WebElement(WebElement e){
		if(GetDriver() instanceof JavascriptExecutor) {
			((JavascriptExecutor)GetDriver()).executeScript("arguments[0].style.border='5px solid red'", e);
		}
	}

	/**
	 *  Freeze app for seconds
	 * @param seconds
	 */
	public void FreezeAppForSeconds(int seconds) {
		try {
			for(int i=seconds;i>=1;i--) {
				Thread.sleep(1000);
				System.out.println("Resuming in .... " + i + " Second(s)");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 *  Freeze app for milliseconds
	 * @param seconds
	 */
	public void FreezeAppForMilliSeconds(int milliseconds) {
		try {
			for(int i=milliseconds;i>=1;i--) {
				Thread.sleep(100);
				System.out.println("Resuming in .... " + i + " milliseconds(s)");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 *  Freeze app for seconds
	 * @param seconds
	 */
	public void FreezeAppWithDelay(int delay_in_milli, int number_of_times) {
		try {
			for(int i=number_of_times;i>=1;i--) {
				Thread.sleep(delay_in_milli);
				System.out.println("Resuming in .... " + i + " Second(s)");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String Get_ValueFromWebElement(By by, String attr) {
		System.out.println("*********** : " + GetDriver().findElement(by).getAttribute(attr));
		return GetDriver().findElement(by).getAttribute(attr);
	}

	/**
	 *  Quit driver instance
	 */
	public void QuitBrowser() {
		GetDriver().quit();
		webDriverThreadLocal.remove();
	}

	public void DoMouseOver_And_Click(By by) {
		Actions actions = new Actions(od.utilities.Web.GetDriver());
		WebElement element = Web.GetDriver().findElement(by);
		actions.moveToElement(element);
		actions.click().build().perform();
	}
}