package com.calculator;

public class Calculator{
     public static int Add(String numbers){
         int num=0;
         if(numbers.isEmpty()){
              return num;
         }
          else{
              num=Integer.parseInt(numbers); 
              return num;
       }
}
