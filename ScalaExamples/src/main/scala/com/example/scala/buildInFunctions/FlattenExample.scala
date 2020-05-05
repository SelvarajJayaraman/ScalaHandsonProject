package com.example.scala.buildInFunctions

object FlattenExample {
  
  val list = List(1,2,3,5,7,10,13);
  
  val mymap = Map(1 -> "jan", 2-> "kalai", 3->"selva");
  
  def main(args: Array[String]){
    
    var result1 = List(list, List(18,20)).flatten;
    println("Result1:" + result1);
    
    var result2 = list.flatMap( y => List(y , y+1));
    println("Result2:" + result2);
    
  }
}