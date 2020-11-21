package com.calculator;
import org.junit.*;
import static org.junit.Assert.*;

public class stringCalculator{
     @Test
      public void ReturnsZeroOnEmptyString(){
          assertEquals(0,Calculator.add(""));
          }
}
