import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void computeMultiplyTest() {
        assertEquals(12, new JavaFXApp().computeMultiply(3,4));
    }
}