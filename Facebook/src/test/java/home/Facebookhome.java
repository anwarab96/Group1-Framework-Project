package home;

import Common.Common_API;
import org.junit.Test;

/**
 * Created by Anwara Begum on 8/14/2014.
 */
public class Facebookhome extends Common_API
{

    @Test
    public void  signIn() throws InterruptedException
    {
        typeByCss("#email", "anwarab96@gmail.com");
        typeByCss("#pass", "selenium");
        enterKeys("#pass");
        sleep(5);
    }

 }







//
//public class Common_API
//{
//    public WebDriver driver = null;
//
//
//
//    @BeforeMethod
//    public void setUp()
//    {
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.navigate().to("http://www.cnn.com");
//        driver.manage().window().maximize();
//    }
//    @AfterMethod
//    public void doomTheDriver()
//    {
//        driver.quit();
//    }
//}
//
//
//////helper methods
////public void type(String value)
////
////{
////    driver.findElement(By.cssSelector()).sendKeys();
////}