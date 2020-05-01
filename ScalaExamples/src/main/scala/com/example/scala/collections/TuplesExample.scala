package com.example.scala.collections

object TuplesExample {
  
   val Tuple1 = (1, 2, "Hello", true);
   val Tuple2 = new Tuple3( 1,"Hello", (2,3));
   
   def main(args: Array[String]){
     
      println("Printing tuples based on index:" + Tuple1._3);
      
      println("Printing Nested tuples based on indes:" + Tuple2._3._2);
      
      Tuple1.productIterator.foreach{
         i => println();
      }
   }
}