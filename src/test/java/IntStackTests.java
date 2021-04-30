
import static org.junit.Assert.*;
import org.junit.Test;

public class IntStackTests {


    @Test
    public void getCapacity() {
        IntStack stack = new IntStack();
        assertEquals(stack.getCapacity(), 3);
    }

    @Test
    public void checkLength() {
        IntStack stack = new IntStack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void checksetCapacity() {
        IntStack stack = new IntStack();
        stack.setCapacity(3);
        assertEquals(stack.getCapacity(), 10);
    }

}
