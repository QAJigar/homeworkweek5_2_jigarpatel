import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Project_2_MultiBrowser {
    static String browserName = "edge";
    static String baseUrl = " https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {

            if (browserName.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
            } else if (browserName.equalsIgnoreCase("Safari")) {
                driver = new SafariDriver();
            } else {
                System.out.println("Wrong Browser Name");
            }
        //Open URL.
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        //Print the title of the page.
        System.out.println("Title of the Page: " + driver.getTitle());
        //Print the current url.
        System.out.println("Current Url: " + driver.getCurrentUrl());
        //Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());
        //Click on ‘Forgot your password ?’link.
        driver.findElement(By.cssSelector("div[class ='orangehrm-login-forgot']")).click();
        //print the current Url
        System.out.println("Current Url: " + driver.getCurrentUrl());
        //Navigate back
        driver.navigate().back();
        //Refresh the page
        driver.navigate().refresh();
        //enter email
        driver.findElement(By.name("username")).sendKeys("Admin");
        //enter password
        driver.findElement(By.name("password")).sendKeys("admin123");
        //click on login button
        driver.findElement(By.className("orangehrm-login-button")).click();
        System.out.println("Current Url: " + driver.getCurrentUrl());
        //close the browser
        driver.quit();


    }
    }
