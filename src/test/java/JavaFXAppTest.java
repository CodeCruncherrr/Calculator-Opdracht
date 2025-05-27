import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
        //testen voor optellen
    void computeAddtest() {
        JavaFXApp java = new JavaFXApp();
        int result = java.computeAdd(8,4);
        assertEquals(12,result);
    }
    @Test
        //testen voor vermenigvuldigen
    void multiplytest() {
        JavaFXApp java = new JavaFXApp();
        int result = java.computeMultiply(2,3);
        assertEquals(6,result);
    }
    @Test
        //testen voor delen
    void computeDividetest() {
        JavaFXApp java = new JavaFXApp();
        int result = java.computeDivide(8,4);
        assertEquals(2,result);
    }
}

