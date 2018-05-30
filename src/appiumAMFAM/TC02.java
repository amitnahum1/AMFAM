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

public class TC02 {
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
	  driver.get("www.amfam.com");
	  client.swipeWhileNotFound("DOWN", 300, 500, "WEB", "//*[@name='zipCode']", 0, 1000, 3, true);
	  driver.findElement(By.xpath("//*[@name='zipCode']")).sendKeys("63005");
	  driver.findElement(By.xpath("//*[@name='servLineCat' and @onScreen='true']"));
	  driver.findElement(By.xpath("//*[@name='servLineCat' and @onScreen='true']")).click();
	  client.sleep(4000);
	  client.elementSetProperty("NATIVE", "nixpath=//*[@class='UIAPicker']", 0, "text", "Condo");
	  client.click("NATIVE", "nixpath=//*[@text='Done']", 0, 1);
	  driver.findElement(By.xpath("//*[@text='Start Quoting']")).click();
	  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@css='H1.ng-scope']")));
	  driver.findElement(By.xpath("//*[@id='first-name']")).sendKeys("Amit");
	  driver.findElement(By.xpath("//*[@id='last-name']")).sendKeys("Nahum");
	  client.swipe("DOWN", 600, 2000);
	  driver.findElement(By.xpath("//*[@id='date-of-birth']")).sendKeys("07031980");
	  driver.findElement(By.xpath("//*[@id='date-of-birth']")).sendKeys("07031980");
	  driver.findElement(By.xpath("//*[@id='gender-male']")).click();
	  driver.findElement(By.xpath("//*[@id='address-line-1']")).sendKeys("Edison Ave 17814");
	  driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Chesterfield");
	  client.swipeWhileNotFound("Down", 600, 2000, "WEB", "//*[@id='contact-method-email']", 0, 1000, 2, true);
	  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='email']")));
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("amit.nahum@experitest.com");
	  driver.findElement(By.xpath("//*[@css='FIELDSET.checkbox']")).click();
	  driver.findElement(By.xpath("//*[@text=' Next ']")).click();
	  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='  Select Insurance ']")));
	  driver.findElement(By.xpath("//*[@text=' Add  ' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='Car']]]")).click();
	  driver.findElement(By.xpath("//*[@text=' Add  ' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='Home']]]")).click();
	  driver.findElement(By.xpath("//*[@text=' Next ']")).click();
	  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text=' Protection to Drive Your Dreams Forward ']")));
	  driver.findElement(By.xpath("//*[@id='vehicle-1-year']")).click();
	  client.elementSetProperty("NATIVE", "nixpath=//*[@class='UIAPicker']", 0, "text", "2018");
	  client.click("NATIVE", "nixpath=//*[@text='Done']", 0, 1);
	  driver.findElement(By.xpath("//*[@id='vehicle-1-make']")).click();
	  client.elementSetProperty("NATIVE", "nixpath=//*[@class='UIAPicker']", 0, "text", "Acura");
	  client.click("NATIVE", "nixpath=//*[@text='Done']", 0, 1);
	  driver.findElement(By.xpath("//*[@id='vehicle-1-model']")).click();
	  client.elementSetProperty("NATIVE", "nixpath=//*[@class='UIAPicker']", 0, "text", "Ilx 4d");
	  client.click("NATIVE", "nixpath=//*[@text='Done']", 0, 1);
	  driver.findElement(By.xpath("//*[@id='number-of-drivers']")).click();
	  client.elementSetProperty("NATIVE", "nixpath=//*[@class='UIAPicker']", 0, "text", "1");
	  client.click("NATIVE", "nixpath=//*[@text='Done']", 0, 1);
	  driver.findElement(By.xpath("//*[@id='any-driver-under-18-no']")).click();
	  driver.findElement(By.xpath("//*[@id='current-auto-insurance-no']")).click();
	  driver.findElement(By.xpath("//*[@text=' Next ']")).click();
	  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text=' Your home is where your dreams thrive. ']")));
	  driver.findElement(By.xpath("//*[@id='type-of-home']")).click();
	  client.elementSetProperty("NATIVE", "nixpath=//*[@class='UIAPicker']", 0, "text", "Duplex");
	  client.click("NATIVE", "nixpath=//*[@text='Done']", 0, 1);
	  driver.findElement(By.xpath("//*[@id='primary-use']")).click();
	  client.elementSetProperty("NATIVE", "nixpath=//*[@class='UIAPicker']", 0, "text", "Secondary Residence");
	  client.click("NATIVE", "nixpath=//*[@text='Done']", 0, 1);
	  driver.findElement(By.xpath("//*[@id='other-uses-no']")).click();
	  driver.findElement(By.xpath("//*[@id='pets-no']")).click();
	  driver.findElement(By.xpath("//*[@id='current-insurance-no']")).click();
	  driver.findElement(By.xpath("//*[@text=' Next ']")).click();
	  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text=concat(' Your home isn', \"'\", 't just where you live - it', \"'\", 's how you live. ')]")));
	  driver.findElement(By.xpath("//*[@id='type-of-condo']")).click();
	  client.elementSetProperty("NATIVE", "nixpath=//*[@class='UIAPicker']", 0, "text", "Duplex");
	  client.click("NATIVE", "nixpath=//*[@text='Done']", 0, 1);
	  driver.findElement(By.xpath("//*[@text=' Next ']")).click();
  } 

  @AfterTest
  public void tearDown() {
      driver.quit();
  }
}
