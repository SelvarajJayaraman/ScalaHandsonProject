package com.example.scala.statements

object ForLoopStatment {
  
  def main(args: Array[String]){
    
    for( i <- 1 to 6){
      println(" i using to :" + i);
    }
    
    for ( i <- 1 until 6){
      println("i using until :" + i);
    }
    
    val lst = List(1,2,3,4,6,8,9);
    for( i <- lst){
      println("using list:"+i);
    }
    
    for( i <- lst; if i < 6){
      println("using filter:" + i);
    }
    
    var result =  for { i <- lst
      if i < 6 } yield {
        i * i;
    } 
    println(result);
    
  }
  
  
}