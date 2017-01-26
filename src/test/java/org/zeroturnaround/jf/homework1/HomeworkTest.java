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
  public void testReverseNull() {
    Homework homework = new Homework();
    assertEquals(null, homework.reverse(null));
  }

  @Test
  public void testGetCommonSuffix() {
    Homework homework = new Homework();
    assertEquals("JavaFundamentals", homework.getCommonSuffix("AmazingJavaFundamentals", "ILoveJavaFundamentals"));
  }

  @Test
  public void testGetCommonSuffixNoSuffix() {
    Homework homework = new Homework();
    assertEquals("", homework.getCommonSuffix("JavaFundamentalsIsAwesome", "ILoveJavaFundamentals"));
  }

  @Test
  public void getGetCommonSuffixWithNullArgument() {
    Homework homework = new Homework();
    assertEquals("", homework.getCommonSuffix(null, "ILoveJavaFundamentals"));
  }

}
