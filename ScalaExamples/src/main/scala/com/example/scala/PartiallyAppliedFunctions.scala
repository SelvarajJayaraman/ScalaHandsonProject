package com.example.scala

import java.util.Date;

object PartiallyAppliedFunctions {
  
  //Fully applied Function
   def math(x:Int, y:Int, z:Int):Int = x+y+z;
   
   def log(date: Date, message: String){
     println(date+ " " +message);
   }
   
   def main(args: Array[String]){
     
      val mathFunc= math(10, _:Int, _:Int);
      println(mathFunc(20,30));
      
      val logFunc = log(new Date, _: String);
      logFunc("Message 1");
      logFunc("Message 2");
      logFunc("Message 3");
   }
}