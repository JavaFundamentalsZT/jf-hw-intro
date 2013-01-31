package ee.ut.jf2012.hw1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class HWTests extends TestCase {

  public HWTests(String testName) {
    super(testName);
  }

  public static Test suite() {
    return new TestSuite(HWTests.class);
  }

  public void testSquare() {
    HW hw = new HW();
    assertEquals(16, hw.square(4));
  }
  
  public void testReverse() {
    HW hw = new HW();
    assertEquals("Input", hw.reverse("tupnI"));
  }
}
