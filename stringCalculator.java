package com.calculator;
import org.junit.*;
import static org.junit.Assert.*;

public class stringCalculator{
     @Test
      public void ReturnsZeroOnEmptyString(){
          assertEquals(0,Calculator.Add(""));
      }
     
     @Test
     public void ReturnsNumberOnNumbervalue(){
          assertEquals(1,Calculator.Add("1"));
     }
}
