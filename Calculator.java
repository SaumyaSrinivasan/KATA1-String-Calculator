package com.calculator;

public class Calculator{
     public static int Add(String numbers){
         if(numbers.isEmpty()){
              return 0;
         }
         else if(numbers.contains(",")){
               String digits[]=numbers.split(",");
               List<Integer> list=convert(digits , new Converter<String,Integer>(){
                    public Integer convert(String value)
                    {
                         return toIntValue(value);
                    }
               });
              return sum(list).intValue();
         }
         else{ 
              return toIntValue(numbers);
         }
     }
     
     private static int toIntValue(String numbers) throws NumberFormatException{
          return Integer.parseInt(numbers);
     }
}
