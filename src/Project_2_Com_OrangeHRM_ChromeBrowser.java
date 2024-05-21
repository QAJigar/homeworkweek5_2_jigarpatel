import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Project_2_Com_OrangeHRM_ChromeBrowser {
    /**
     * Project-2 - ProjectName : com-orangehrmlive
     * BaseUrl = https://opensource-demo.orangehrmlive.com/
     * 1. Setup Chrome browser.
     * 2. Open URL.
     * 3. Print the title of the page.
     * 4. Print the current url.
     * 5. Print the page source.
     * 6. Click on ‘Forgot your password?’ link.
     * 7. Print the current url.
     * 8. Navigate back to the login page.
     * 9. Refresh the page.
     * 10. Enter the email to email field.
     * 11. Enter the password to password field.
     * 12. Click on Login Button.
     * 13. Close the browser.
     */
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        WebDriver driver = new ChromeDriver();
        // Open URL.
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        // Print the title of the page.
        System.out.println("title page: " + driver.getTitle());
        // Print the current url.
        System.out.println("current url: " + driver.getCurrentUrl());
        // Print the page source.
        System.out.println("page source: " + driver.getPageSource());
        //Click on ‘Forgot your password ?’link.
        driver.findElement(By.cssSelector("div[class ='orangehrm-login-forgot']")).click();
        //String forgotYourPassword = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";
        // driver.navigate().to(forgotYourPassword);
        //Print the current url.
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Navigate back to the login page
        driver.navigate().back();
        //Refresh the page
        driver.navigate().refresh();
        //Enter the email to email field
        //driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Enter the password to password field
        // driver.findElement(By.cssSelector(" input[type ='password']")).sendKeys("admin123");
        driver.findElement(By.name("password")).sendKeys("admin123");
        //click on login button
        driver.findElement(By.className("orangehrm-login-button")).click();
        //driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
        driver.quit();
    }
}
