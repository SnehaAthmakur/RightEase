package test.RightEase.base.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.EventListener;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.rightease.Util.WebEventListener;
import com.rightease.Util.righteaseUtil;




public class righteaseTestBase {
    public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public righteaseTestBase() {
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com"+"/rightease/config/Configrightease.properties");	
			prop.load(ip);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();	
		}
		catch (IOException e) {
		e.printStackTrace();
		}
	}
	public static void initialization() {
		String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\180119\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
			}else if (browserName.equals("FF")) {
				System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			driver=new FirefoxDriver();	
			}
		
		e_driver=new EventFiringWebDriver(driver);
		//Now create object of EventListenerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(righteaseUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(righteaseUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	     driver.get(prop.getProperty("url"));
			}
	}
	


