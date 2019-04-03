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
        System.out.println(" --- Setting up webdriver --- ");
        String pathToChromeDriver = "src/driver/chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        driver = new ChromeDriver();
        System.out.println(" --- webdriver up ---");
    }

    @Before
    public void beforeTest() {
        System.out.println(" *** before method *** ");
    }

    @Test
    public void junitTest2() {
        System.out.println("test2");
    }

    @After
    public void afterTest() {
        System.out.println(" *** after method *** ");
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("--- END ---");
        driver.close();
    }

}
