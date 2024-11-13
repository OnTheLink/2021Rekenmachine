import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void computeDevideTest () {
        assertEquals(5,new JavaFXApp().computeDivide(10,2));
    }
}