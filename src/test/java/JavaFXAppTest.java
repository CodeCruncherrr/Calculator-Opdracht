import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void multiplytest() {
        JavaFXApp java = new JavaFXApp();
        int result = java.computeMultiply(2,3);
        assertEquals(6,result);
    }

    @Test
    void computeDividetest() {
        JavaFXApp java = new JavaFXApp();
        int result = java.computeDivide(8,4);
        assertEquals(2,result);
    }

    @Test
    void computeAddtest() {
        JavaFXApp java = new JavaFXApp();
        int result = java.computeAdd(8,4);
        assertEquals(12,result);
    }

}

