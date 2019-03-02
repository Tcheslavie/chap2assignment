package ac.za.cput;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testInterface()
    {
        myInterface myThing = new myIntImpl();
        String result = myThing.sayHello("Test");
        assertTrue(result, result.contains("Hello"));
    }
}
