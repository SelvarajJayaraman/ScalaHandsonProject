package com.example.scala.exceptionhandling

object ExcpetionHandlingDemo {
  
   def main(args: Array[String]){
     
     val a:Int =12;
     val b:Int = 0;
     
     try{
       var c = a/b;
     }catch{
       case ex: ArithmeticException => {
         println(ex);
       }
       case ex: Exception => {
         println(ex);
       }
     }finally{
       println("Finally executed");
     }
     
   }
}