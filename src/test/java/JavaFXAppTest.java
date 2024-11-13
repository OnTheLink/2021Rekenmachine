import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void additionTest() {
        PlusComputation plusComputation = new PlusComputation();

        // Check positive numbers
        assertEquals(3, plusComputation.compute(1, 2));
        assertEquals(5, plusComputation.compute(2, 3));
        assertEquals(7, plusComputation.compute(3, 4));

        // Check negative numbers
        assertEquals(-1, plusComputation.compute(-1, 0));
        assertEquals(-3, plusComputation.compute(-1, -2));
        assertEquals(-5, plusComputation.compute(-2, -3));

        // Check mixed numbers
        assertEquals(0, plusComputation.compute(-1, 1));
        assertEquals(1, plusComputation.compute(-1, 2));
        assertEquals(2, plusComputation.compute(1, 1));

        // Check zero
        assertEquals(1, plusComputation.compute(1, 0));
    }
}