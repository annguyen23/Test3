import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;


import java.io.*;

public class IntStackJunit {

  @Before
  public void setUp() {
      IntStack stack = new IntStack();
  }

  @Test
    public void getCapacity() {
      assertEquals(stack.getCapacity(), 0);
  }

  @Test
  public void checkLength() {
      essertTtrue(stack.isEmpty());
  }

  @Test
  public void checksetCapacity() {
      stack.setCapacity(3);
      essertEquals(stack.getCapacity(), 3);
  }

}
