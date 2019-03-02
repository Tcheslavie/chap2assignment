package ac.za.cput;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import org.testng.annotations.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private myInterface welcomer;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        welcomer = (myInterface) ctx.getBean("welcomer");
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }

    @Test
    public void testInterface() throws Exception
    {
        String result = welcomer.sayHello("Test");
        assertTrue(result, result.contains("Hello"));
    }
}
