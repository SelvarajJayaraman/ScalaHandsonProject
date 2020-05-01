package com.example.scala.functions

object ScalaAynonumsFunctions {
  
  object Math {
  
    def squre (x: Int = 6): Int = {
      return x * x;
    }
    
    def cube ( y: Int): Int =  y * y * y;
  }
  
  def print (x: Int, y:Int) : Unit = {
    println(x + y);
  }
  
  def main(args: Array[String]){
    
    var add = (x: Int, y: Int) => x + y;
    
    println(Math.squre());
    
    println(Math.cube(10));
    
    print(20 ,25);
    
    println( add (25, 25));
  }
}

