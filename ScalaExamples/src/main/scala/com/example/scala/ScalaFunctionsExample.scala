package com.example.scala

object ScalaFunctionsExample {
  
  
  object Math {
     
    def sqaure( x: Int ) : Int = x * x;
     
     def cube( y: Int) : Int = y * y * y;
  }
  
  def add (x: Int, y: Int) : Int = {
    return x + y;
  }
  
  def subtract ( x: Int, y:Int): Int = {
    x - y;
  }
  
  def multiple (x:Int ,y:Int) : Int = x * y;
  
  def divide (x:Int, y:Int): Int = x/y;
  
  def main(args: Array[String]){
    println(add(10,15));
    println(subtract(10,15));
    println(multiple(10,15));
    println(divide(15,5));
    
    println(Math.sqaure(2));
    println(Math.cube(5));
  }
}
