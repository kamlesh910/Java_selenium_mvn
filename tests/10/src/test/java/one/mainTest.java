package one;

import static org.junit.Assert.assertThat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class mainTest {

    public static ChromeDriver driver;
    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("Setting up webdriver");
        String pathToChromeDriver = "src/driver/chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        driver = new ChromeDriver();

    }

    @Before
    public void beforeTest() {
        System.out.println("Running before method");

    }

    @Test
    public void junitTest() {
        System.out.println("Running Junit test");
        driver.navigate().to("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        String title = driver.findElement(By.cssSelector(".example h2")).getText();
       // assertThat(title, is("Secure Area"));
    }

    @Test
    public void junitTest2() {
        System.out.println("Running Junit test2");
    }

    @Test
    public void secondJunitTest() {
        System.out.println("Running second Junit test");
    }

    @After
    public void afterTest() {
        System.out.println("Running after method");
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("Running after Class method");
    }

}
