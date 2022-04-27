package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;
    @BeforeMethod
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @Test
    public void Test1(){
        driver.navigate().to("https://automationtalks.com/");
        System.out.println("The title for test1 is "+driver.getTitle());
    }
    @Test
    public void Test2(){
        driver.navigate().to("https://automationtalks.com/");
        System.out.println("The title for test2 is "+driver.getTitle());
    }
    @Test
    public void Test3(){
        driver.navigate().to("https://automationtalks.com/");
        System.out.println("The title for test3 is "+driver.getTitle());
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}