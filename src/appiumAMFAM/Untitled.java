package appiumAMFAM;

//package <set your test package>;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.experitest.appium.SeeTestClient;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class Untitled {
  private String reportDirectory = "reports";
  private String reportFormat = "xml";
  private String testName = "Untitled";
  private SeeTestClient client;
  protected IOSDriver<IOSElement> driver = null;

  DesiredCapabilities dc = new DesiredCapabilities();
  
  @BeforeTest
  public void setUp() throws MalformedURLException {
      dc.setCapability("doNotGoHomeOnQuit", true);
      dc.setCapability("generateReport", false);
      dc.setCapability("takeScreenshots", false);
	  dc.setCapability("dontGoHomeOnQuit", true);
      dc.setCapability(MobileCapabilityType.UDID, "569801f701a84ceedc3d0458297cea7dc353680a");
      dc.setBrowserName(MobileBrowserType.SAFARI);
      driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
      client = new SeeTestClient(driver);
      driver.setLogLevel(Level.INFO);
  }

  @Test
  public void testUntitled() {
	  driver.context("WEB");
	  driver.get("www.amfam.com");
	  client.swipeWhileNotFound("DOWN", 300, 500, "WEB", "//*[@name='zipCode']", 0, 1000, 3, true);
	  driver.findElement(By.xpath("//*[@name='zipCode']")).sendKeys("63005");
	  driver.findElement(By.xpath("//*[@name='servLineCat' and @value='Car' and @width>'0']"));
	  driver.findElement(By.xpath("//*[@text='Start Quoting']")).click();
	  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@css='H2.ng-binding' and  contains(@text,'Information')]")));
	  driver.findElement(By.xpath(("//*[@nodeName='BUTTON' and @type='submit']"))).click();
	  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='first-name']")));
	  driver.findElement(By.xpath("//*[@id='first-name']")).sendKeys("Amit");
	  driver.findElement(By.xpath("//*[@id='middle-initial']")).sendKeys("A");
	  driver.findElement(By.xpath("//*[@id='last-name']")).sendKeys("Nahum");
	  driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("Edison Ave");
	  driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("17814");
	  client.swipe("DOWN", 500, 3000);
	  driver.findElement(By.xpath("//*[@id='dob']")).sendKeys("07031980");
	  driver.findElement(By.xpath("//*[@id='email-address']")).sendKeys("amit.nahum@experitest.com");
	  driver.findElement(By.xpath("//*[@id='work' and @name='emailUsage']")).click();
	  driver.findElement(By.xpath("//*[@type='submit']")).click();
	  driver.findElement(By.xpath("//*[@text='Verify Your Current Address']"));
	  driver.findElement(By.xpath("//*[@text='Edison Ave 17814, Chesterfield, MO 63005']"));
	  driver.findElement(By.xpath("//*[@text='Continue']")).click();
 
  } 

  @AfterTest
  public void tearDown() {
      driver.quit();
  }
}
