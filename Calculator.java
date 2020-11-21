package com.calculator;

public class Calculator{
     public static int Add(String numbers){
         if(numbers.isEmpty()){
              return 0;
         }
         else {
               String digits[]= todigits(numbers);
               List<Integer> list=convert(digits , toIntValue());
              return sum(list).intValue();
         }
         
     }
     
     private static String[] todigits(String numbers){
          if(numbers.startsWith("//")){
               return eliminateCustomDelimiter(numbers);
          }
          else{
            return eliminateNewLineOfString(numbers);
          }
     }
     
     private static String[] eliminateNewLineOfString(String numbers){
            String[] digit = numbers.split(", | \n");
            return digit;
     }
     
     private static String[] eliminateCustomDelimiter(String numbers){
               Matcher m=Pattern.compile("//(.)\n(.*)").matcher(numbers);
               m.matches();
               String variousDelimiter = m.group(1);
               String num=m.group(2);
               return num.split(variousDelimiter);
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
