package appiumAMFAM;
//package <set your test package>;
import com.experitest.client.*;
import org.testng.annotations.*;
/**
 *
*/
public class TC01 {
    private String host = "localhost";
    private int port = 8889;
    private String projectBaseDirectory = "C:\\Users\\amit.nahum\\workspace\\project8";
    protected Client client = null;

    @BeforeMethod
    public void setUp(){
        client = new Client(host, port, true);
        client.setProjectBaseDirectory(projectBaseDirectory);
        client.setReporter("xml", "reports", "EHI");
    }

    @Test(groups = {"seetest"})
    public void testEHI(){
        client.setDevice("adb:HUAWEI HUAWEI GRA-L09 A0141");
        client.launch("https://www.amfam.com", true, true);
        if(client.swipeWhileNotFound("Down", 400, 2000, "WEB", "xpath=//*[@name='zipCode']", 0, 1000, 5, false)){
            // If statement
        }
        client.elementSendText("WEB", "xpath=//*[@name='zipCode']", 0, "63005");
        if(client.waitForElement("WEB", "xpath=//*[@nodeName='SELECT' and @id='sq-product-1ce03af5-0a04-49a5-9a0e-47216ed3d8f6' and @value='Car']", 0, 10000)){
            // If statement
        }
        client.click("WEB", "xpath=//*[@text='Start Quoting']", 0, 1);
        if(client.waitForElement("WEB", "xpath=//*[contains(@text,'Your Information') and @nodeName='H2']", 0, 20000)){
            // If statement
        }
        client.click("WEB", "xpath=//*[@type='submit']", 0, 1);
        if(client.waitForElement("WEB", "xpath=//*[contains(@text,'Your Information') and @nodeName='H2']", 0, 10000)){
            // If statement
        }
        client.elementSendText("WEB", "xpath=//*[@nodeName='INPUT' and @id='first-name']", 0, "Amit");
        client.closeKeyboard();
        client.elementSendText("WEB", "xpath=//*[@nodeName='INPUT' and @id='last-name']", 0, "Nahum");
        client.closeKeyboard();
        client.elementSendText("WEB", "xpath=//*[@nodeName='INPUT' and @id='address1']", 0, "Edison Ave");
        client.closeKeyboard();
        client.elementSendText("WEB", "xpath=//*[@nodeName='INPUT' and @id='address2']", 0, "17814");
        client.closeKeyboard();
        if(client.swipeWhileNotFound("Down", 600, 400, "WEB", "xpath=//*[@nodeName='INPUT' and @id='dob' and @top='true']", 0, 1000, 5, false)){
            // If statement
        }
        client.elementSendText("WEB", "xpath=//*[@nodeName='INPUT' and @id='dob' and @top='true']", 0, "07031980");
        client.closeKeyboard();
        if(client.swipeWhileNotFound("Down", 200, 2000, "WEB", "xpath=//*[@nodeName='INPUT' and @id='email-address']", 0, 1000, 5, false)){
            // If statement
        }
        client.elementSendText("WEB", "xpath=//*[@nodeName='INPUT' and @id='email-address']", 0, "amit.nahum@experitest.com");
        client.closeKeyboard();
        client.click("WEB", "xpath=//*[@type='submit']", 0, 1);
        if(client.waitForElement("WEB", "xpath=//*[@nodeName='H3' and @text='Verify Your Current Address']", 0, 20000)){
            // If statement
        }
        client.verifyElementFound("WEB", "xpath=//*[@text='Edison Ave 17814, Chesterfield, MO 63005' and @nodeName='P']", 0);
        client.click("WEB", "xpath=//*[@type='submit']", 0, 1);
        if(client.waitForElement("WEB", "xpath=//*[@nodeName='H2' and contains(@text,'Select/Add Vehicles')]", 0, 10000)){
            // If statement
        }
        if(client.swipeWhileNotFound("Down", 600, 2000, "WEB", "xpath=//*[@text='VIN' and @css='A.ng-binding' and @top='true']", 0, 1000, 5, false)){
            // If statement
        }
        client.click("WEB", "xpath=//*[@text='VIN' and @css='A.ng-binding' and @top='true']", 0, 1);
        client.elementSendText("WEB", "xpath=//*[@nodeName='INPUT' and @id='vin-number']", 0, "5J8TB2H20BA005223");
        client.hybridSelect("", 0, "xpath", "xpath=//*[@nodeName='SELECT' and @id='select-year2']", "2011");
        client.click("WEB", "xpath=//*[@nodeName='BUTTON' and @id='addVehicleByVIN']", 0, 1);
        client.click("WEB", "xpath=//*[@nodeName='LABEL' and contains(@text,'No')]", 0, 1);
        client.click("WEB", "xpath=//*[@nodeName='BUTTON' and @css='BUTTON.btn.btn-primary']", 0, 1);
        if(client.waitForElement("WEB", "xpath=//*[contains(@text,'2011 Acura Rdx 4d 2wd') and @css='H3.ng-binding']", 0, 10000)){
            // If statement
        }
        client.hybridSelect("", 0, "xpath", "xpath=//*[@nodeName='SELECT' and @id='vehicleUse']", "Pleasure");
        client.elementSendText("WEB", "xpath=//*[@nodeName='INPUT' and @id='annual-miles']", 0, "1000");
        client.closeKeyboard();
        if(client.swipeWhileNotFound("Down", 200, 2000, "WEB", "xpath=//*[@css='BUTTON.btn.btn-primary']", 0, 1000, 5, false)){
            // If statement
        }
        client.click("WEB", "xpath=//*[@css='BUTTON.btn.btn-primary']", 0, 1);
        if(client.waitForElement("WEB", "xpath=//*[@nodeName='H2' and @text='Select Household Members']", 0, 10000)){
            // If statement
        }
        client.verifyElementFound("WEB", "xpath=//*[@nodeName='STRONG' and @text='Amit A Nahum']", 0);
        if(client.swipeWhileNotFound("Down", 200, 2000, "WEB", "xpath=//*[@css='BUTTON.btn.btn-primary']", 0, 1000, 5, false)){
            // If statement
        }
        client.click("WEB", "xpath=//*[@css='BUTTON.btn.btn-primary']", 0, 1);
        if(client.waitForElement("WEB", "xpath=//*[contains(@text,'Person Information') and @nodeName='H2']", 0, 10000)){
            // If statement
        }
        client.hybridSelect("", 0, "xpath", "xpath=//*[@nodeName='SELECT' and @id='marital-status']", "Not Married (Never Married)");
        if(client.swipeWhileNotFound("Down", 200, 200, "WEB", "xpath=//*[@nodeName='SELECT' and @id='license-state' and @top='true']", 0, 1000, 5, false)){
            // If statement
        }
        client.hybridSelect("", 0, "xpath", "xpath=//*[@nodeName='SELECT' and @id='license-state' and @top='true']", "Unemployed");
        client.click("WEB", "xpath=//*[@css='BUTTON.btn.btn-primary']", 0, 1);
        if(client.waitForElement("WEB", "xpath=//*[contains(@text,'Additional Information')]", 0, 10000)){
            // If statement
        }
        client.verifyElementFound("WEB", "xpath=//*[@id='no' and @name='violation' and @checked='true']", 0);
        client.verifyElementFound("WEB", "xpath=//*[@id='sr22-no' and @name='sr22' and @checked='true']", 0);
        if(client.swipeWhileNotFound("Down", 200, 2000, "WEB", "xpath=//*[@css='BUTTON.btn.btn-primary']", 0, 1000, 5, false)){
            // If statement
        }
        client.click("WEB", "xpath=//*[@css='BUTTON.btn.btn-primary']", 0, 1);
        if(client.waitForElement("WEB", "xpath=//*[contains(@text,'Named Insured')]", 0, 10000)){
            // If statement
        }
        if(client.swipeWhileNotFound("Down", 200, 2000, "WEB", "xpath=//*[@nodeName='LABEL' and contains(@text,'No')]", 0, 1000, 5, false)){
            // If statement
        }
        client.click("WEB", "xpath=//*[@for='currently_insured-no']", 0, 1);
        client.click("WEB", "xpath=//*[@for='return_military-yes']", 0, 1);
        client.hybridSelect("", 0, "xpath", "xpath=//*[@nodeName='SELECT' and @id='active_military_returning']", "March 2018");
        client.click("WEB", "xpath=//*[@css='BUTTON.btn.btn-primary']", 0, 1);
        if(client.waitForElement("WEB", "xpath=//*[contains(@text,'Discounts') and @nodeName='H2']", 0, 10000)){
            // If statement
        }
        if(client.swipeWhileNotFound("Down", 200, 2000, "WEB", "xpath=//*[@css='BUTTON.btn.btn-primary']", 0, 1000, 5, false)){
            // If statement
        }
        client.click("WEB", "xpath=//*[@css='BUTTON.btn.btn-primary']", 0, 1);
        if(client.waitForElement("WEB", "xpath=//*[contains(@text,'Choose Your Coverage')]", 0, 10000)){
            // If statement
        }
        client.verifyElementFound("WEB", "xpath=//*[contains(@text,'Choose Your Coverage')]", 0);
    }

    @AfterMethod
    public void tearDown(){
        // Generates a report of the test case.
        // For more information - https://docs.experitest.com/display/public/SA/Report+Of+Executed+Test
        client.generateReport(false);
        // Releases the client so that other clients can approach the agent in the near future. 
        client.releaseClient();
    }
}
