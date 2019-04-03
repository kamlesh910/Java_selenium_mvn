package one;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class mainTest {

    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("Running before Class method");
    }


    @Before
    public void beforeTest() {
        System.out.println("Running before method");
    }

    @Test
    public void junitTest() {
        System.out.println("Running Junit test");
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
