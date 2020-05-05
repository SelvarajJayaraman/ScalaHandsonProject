package com.example.scala.buildInFunctions

object MapFunction {
  
  val list = List(1,2,3,5,7,10,13);
  
  val mymap = Map(1 -> "Tom", 2 -> "Max", 3 -> "sony");
  
  def main(args: Array[String]){
    
    var result1 = list.map(x => x +1);
    println("Result1:" + result1);
    
    var result2 = mymap.mapValues( x=> "hi" + x);
    println("Result2:" + result2);
    
    var result3 = "hello".map(_.toUpper);
    println("Result3:"+ result3);
  }
}