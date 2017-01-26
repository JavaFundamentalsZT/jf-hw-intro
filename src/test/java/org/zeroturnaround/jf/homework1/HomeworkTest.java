package org.zeroturnaround.jf.homework1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HomeworkTest {

  @Test
  public void testReverse() {
    Homework homework = new Homework();
    assertEquals("Input", homework.reverse("tupnI"));
  }

  @Test
  public void testGetCommonSuffix() {
    Homework homework = new Homework();
    assertEquals("JavaFundamentals", homework.getCommonSuffix("AmazingJavaFundamentals", "ILoveJavaFundamentals"));
  }
}
