package one;

import org.junit.Test;
import org.openqa.selenium.By;

public class sideTest extends mainTest
{

@Test
    public void junitTest1() {
        System.out.println("Running Junit test");
        driver.navigate().to("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        String title = driver.findElement(By.cssSelector(".example h2")).getText();
        // assertThat(title, is("Secure Area"));
    }

}