import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import java.io.*;

public class IntStackJunit {
  private IntStack stack = new IntStack();

  @Test
    public void getCapacity() {
      Assert.essertEquals(stack.getCapacity(), 0);
  }

    @Test
    public void checkLength() {
        Assert.essertTtrue(stack.isEmpty());
    }

    @Test
    public void checksetCapacity() {
        stack.setCapacity(3);
        Assert.essertEquals(stack.getCapacity(), 3);
    }

}
