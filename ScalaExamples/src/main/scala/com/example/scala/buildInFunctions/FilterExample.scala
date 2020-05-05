package com.example.scala.buildInFunctions

object FilterExample {
  
   val list = List(1, 2, 3, 5, 7, 10, 13);
   
   def main(args: Array[String]){
     
     val result1 = list.filter(x => x%2 == 0);
     println("Result:" + result1);
     
     val result2 = list.filter(y => y%2 !=0);
     println("Result:" + result2);
   }
}