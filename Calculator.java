package com.calculator;

public class Calculator{
     public static int Add(String numbers){
         if(numbers.isEmpty()){
              return 0;
         }
         else if(numbers.contains(",")){
               String digits[]=numbers.split(",");
               return Integer.parseInt(digits[0]) + Integer.parseInt(digits[1]);
         }
         else{ 
              return Integer.parseInt(numbers);
         }
}
