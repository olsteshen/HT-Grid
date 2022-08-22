package org.example.unit;

import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;


public class GridTest {
    private static WebDriver driver;
    private static DesiredCapabilities caps = null;
    private static String hubURL = "http://10.22.81.17:4444/wd/hub";


//    @BeforeClass
//    public static void setupTest() throws MalformedURLException {
//        String browser = System.getProperty("browser");
//        if(browser.equalsIgnoreCase("chrome")){
//            //1st DesiredCapabilities
////        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");
//        caps = new DesiredCapabilities();
//        caps.setCapability("browserName", "chrome");
//        caps.setCapability("Platform","MAC");
//        caps.setCapability("platformName", "MAC");
//
//            //2nd variant - using ChromeOptions
////        ChromeOptions caps = new ChromeOptions();
////        caps.setCapability("browserName", "chrome");
////        caps.setCapability("Platform","MAC");
////        caps.setCapability("platformName", "MAC");
//        }
//        if(browser.equalsIgnoreCase("firefox")) {
//            caps = new DesiredCapabilities();
//            caps.setCapability("browserName", "firefox");
//            caps.setCapability("Platform","MAC");
//            caps.setCapability("platformName", "MAC");
//        }
//        //3rd variant - using FirefoxOptions
////            FirefoxOptions caps = new FirefoxOptions();
////            caps.setCapability("browserName", "firefox");
////            caps.setCapability("Platform", "MAC");
////            caps.setCapability("platformName", "MAC");
//
//        driver = new RemoteWebDriver(new URL(hubURL), caps);
//        driver.manage().window().maximize();
//    }

//    @AfterClass
//    public static void quitDriver() {
//        driver.quit();
//    }

    @Test
    public void searchBookdepositoryUsingGrid1() throws MalformedURLException {
        caps = new DesiredCapabilities();
        caps.setCapability("browserName", "chrome");
        caps.setCapability("Platform","MAC");
        caps.setCapability("platformName", "MAC");
        driver = new RemoteWebDriver(new URL(hubURL), caps);
        driver.manage().window().maximize();
        driver.get("https://www.bookdepository.com");
        driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys("Thinking in Java");
        driver.findElement(By.xpath("//button[@class='header-search-btn']")).click();
        Assertions.assertTrue(driver.getCurrentUrl().contains("searchTerm"));
        driver.quit();
    }


    @Test
    public void searchBookdepositoryUsingGrid2() throws MalformedURLException {
        caps = new DesiredCapabilities();
        caps.setCapability("browserName", "chrome");
        caps.setCapability("Platform","MAC");
        caps.setCapability("platformName", "MAC");
        driver = new RemoteWebDriver(new URL(hubURL), caps);
        driver.manage().window().maximize();
        driver.get("https://www.bookdepository.com");
        driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys("Java");
        driver.findElement(By.xpath("//button[@class='header-search-btn']")).click();
        Assertions.assertTrue(driver.getCurrentUrl().contains("searchTerm"));
        driver.quit();
    }

    @Test
    public void searchBookdepositoryUsingGrid3() throws MalformedURLException {
        caps = new DesiredCapabilities();
        caps.setCapability("browserName", "chrome");
        caps.setCapability("Platform","MAC");
        caps.setCapability("platformName", "MAC");
        driver = new RemoteWebDriver(new URL(hubURL), caps);
        driver.manage().window().maximize();
        driver.get("https://www.bookdepository.com");
        driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys("PHP");
        driver.findElement(By.xpath("//button[@class='header-search-btn']")).click();
        Assertions.assertTrue(driver.getCurrentUrl().contains("searchTerm"));
        driver.quit();
    }

    @Test
    public void searchBookdepositoryUsingGrid4() throws MalformedURLException {
        caps = new DesiredCapabilities();
        caps.setCapability("browserName", "firefox");
        caps.setCapability("Platform","MAC");
        caps.setCapability("platformName", "MAC");
        driver = new RemoteWebDriver(new URL(hubURL), caps);
        driver.manage().window().maximize();
        driver.get("https://www.bookdepository.com");
        driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys("Thinking");
        driver.findElement(By.xpath("//button[@class='header-search-btn']")).click();
        Assertions.assertTrue(driver.getCurrentUrl().contains("searchTerm"));
        driver.quit();
    }
    @Test
    public void searchBookdepositoryUsingGrid5() throws MalformedURLException {
        caps = new DesiredCapabilities();
        caps.setCapability("browserName", "firefox");
        caps.setCapability("Platform","MAC");
        caps.setCapability("platformName", "MAC");
        driver = new RemoteWebDriver(new URL(hubURL), caps);
        driver.manage().window().maximize();
        driver.get("https://www.bookdepository.com");
        driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys("Devops");
        driver.findElement(By.xpath("//button[@class='header-search-btn']")).click();
        Assertions.assertTrue(driver.getCurrentUrl().contains("searchTerm"));
        driver.quit();
    }

    @Test
    public void searchBookdepositoryUsingGrid6() throws MalformedURLException {
        caps = new DesiredCapabilities();
        caps.setCapability("browserName", "firefox");
        caps.setCapability("Platform","MAC");
        caps.setCapability("platformName", "MAC");
        driver = new RemoteWebDriver(new URL(hubURL), caps);
        driver.manage().window().maximize();
        driver.get("https://www.bookdepository.com");
        driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys("Selenium");
        driver.findElement(By.xpath("//button[@class='header-search-btn']")).click();
        Assertions.assertTrue(driver.getCurrentUrl().contains("searchTerm"));
        driver.quit();
    }

}
