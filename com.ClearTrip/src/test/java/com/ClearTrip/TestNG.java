package com.ClearTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestNG{

WebDriver driver;

@BeforeSuite
    public void browseropen() {

    driver = new ChromeDriver();
}
@BeforeTest
       public void setupwindow(){

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);



    }
    @BeforeClass

    public void Homepage() {

       driver.get("https://indiancouture.co.za/");
       driver.findElement(By.xpath("//div[@id='global-subscription-popup']//span[contains(text(),'×')]")).click();//Cookies dissmiss
   }

   @BeforeMethod
           public void Testsigin() throws InterruptedException {

       driver.get("https://indiancouture.co.za/");
       driver.findElement(By.xpath("//div[@id='global-subscription-popup']//span[contains(text(),'×')]")).click();//Cookies dissmiss

Thread.sleep(2000);

    }

    @Test
    public void TypeUsername(){
        driver.findElement(By.xpath("//a[contains(text(),'Sign-in')]")).click();
        driver.findElement(By.xpath("//input[@id='username']\"")).sendKeys("mohamed");
    }
    @Test
    public void TypeFullLoginDetails() {
        driver.findElement(By.xpath("//a[contains(text(),'Sign-in')]")).click();
        driver.findElement(By.xpath("//input[@id='username']\"")).sendKeys("deensfr@hotmail.co.uk");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("kRLIWW05");
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
    }
@Test
public void checkRegisterfunctionality() {
    driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
    driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("mohamed");
    driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("deen");
    driver.findElement(By.xpath("//button[contains(text(),'Open an Account')]")).click();
}
        @AfterMethod
                public void closebrowser(){
            driver.close();
        }

}

