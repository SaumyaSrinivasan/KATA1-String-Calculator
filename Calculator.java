package com.calculator;

public class Calculator{
     public static int Add(String numbers){
         if(numbers.isEmpty()){
              return 0;
         }
         else if(numbers.contains(",")){
               String digits[]=numbers.split(",");
               return toIntValue(digits[0]) + toIntValue(digits[1]);
         }
         else{ 
              return toIntValue(numbers);
         }
     }
     
     private static int toIntValue(String numbers) throws NumberFormatException{
          return Integer.parseInt(numbers);
     }
}
