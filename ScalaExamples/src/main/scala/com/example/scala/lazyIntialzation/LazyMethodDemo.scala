package com.example.scala.lazyIntialzation


object LazyMethodDemo {
  
   def method1(n :Int){
     println("Method 1");
     println(n);
   }
   
   def method2(n: => Int){
     println("Method 2");
     println(n);
   }
   
   def main(args : Array[String]){
     
     val add = ( a: Int, b:Int ) => {
       println("add");
       a+b;
     }
     
     method1(add(3,4));
     method2(add(3,4));
     
   }
}