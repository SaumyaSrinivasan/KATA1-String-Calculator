package com.calculator;

public class Calculator{
     public static int Add(String numbers){
         if(numbers.isEmpty()){
              return 0;
         }
         else if(numbers.contains(",")){
               String digits[]=numbers.split(",");
               List<Integer> list=convert(digits , toIntValue());
              return sum(list).intValue();
         }
         else{ 
              return toIntValue(numbers);
         }
     }
     
     private static Converter<String,Integer> toIntValue(){
          return new Conerter<String,Integer>() {
               public Integer convert(String from){
                    return toIntValue(from);
               }
          };
     }
     private static int toIntValue(String numbers) throws NumberFormatException{
          return Integer.parseInt(numbers);
     }
}
