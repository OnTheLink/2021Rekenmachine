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
        assertEquals(3, app.computeAdd(1, 2));
    }
}