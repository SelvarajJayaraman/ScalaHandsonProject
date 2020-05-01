package com.example.scala.functions

object HigherOrderFunctions {
  
  def math1(x: Double, y:Double, f:(Double,Double) => Double) : Double = f(x,y);
  
  def math2(x:Double, y:Double, z:Double, f:(Double,Double) => Double) : Double = f(f(x,y),z);
  
  def main(args: Array[String]) {
    
     var result1 = math1(50,20,(x,y) => x min y);
     println(result1);
     
     var result2 = math2(30,40, 10, (x,y) => x * y);
     println(result2);
     
     //Wildcare function notation
     var result3 = math1(10,20, _+_);
     println(result3);
  }
}