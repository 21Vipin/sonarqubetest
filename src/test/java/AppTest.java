/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void testGetData() {
        App app = new App();
        assertEquals("Data created.",app.getData());
    }

    @Test
    public void testGetData1() {
        App app = new App();
        assertEquals("Data created.",app.getData1());
    }
}
