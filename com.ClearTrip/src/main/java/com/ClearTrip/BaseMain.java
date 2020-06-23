package com.ClearTrip;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BaseMain {
    public static WebDriver driver;
    public void OpenBrowser(String Browser) {

        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();


        switch (Browser) {


            case "Chrome":
                driver = new ChromeDriver();
                break;

            case "Firefox":
                driver = new FirefoxDriver();
                break;

            case "Iexplorer":
                driver = new InternetExplorerDriver();
                break;

            case "Edge":
                driver = new EdgeDriver();
                break;

            default:
                driver = new ChromeDriver();
                return;


        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }
    public void Closebrowser(){
        driver.close();
    }
    }




