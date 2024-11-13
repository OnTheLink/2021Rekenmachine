import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void additionTest() {
        JavaFXApp app = new JavaFXApp();

        // Check positive numbers
        assertEquals(3, app.computeAdd(1, 2));
        assertEquals(5, app.computeAdd(2, 3));
        assertEquals(7, app.computeAdd(3, 4));

        // Check negative numbers
        assertEquals(-1, app.computeAdd(-1, 0));
        assertEquals(-3, app.computeAdd(-1, -2));
        assertEquals(-5, app.computeAdd(-2, -3));

        // Check mixed numbers
        assertEquals(0, app.computeAdd(-1, 1));
        assertEquals(1, app.computeAdd(-1, 2));
        assertEquals(2, app.computeAdd(1, 1));

        // Check zero
        assertEquals(1, app.computeAdd(1, 0));
    }
}