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
     
     @Test
     public void ReturnSumOfTwoDigitsSeperatedByComma(){
          assertEquals(3,Calculator.Add("1,2"));
     }
     
     @Test
     public void ReturnSumOfMulitpleValue(){
          assertEquals(6,Calculator.Add("1,2,3"));
     }
     
     @Test
     public void ReturnSumAcceptingNewLine(){
          assertEquals(6, Calculator.Add("1\n2,3));
     }
}
