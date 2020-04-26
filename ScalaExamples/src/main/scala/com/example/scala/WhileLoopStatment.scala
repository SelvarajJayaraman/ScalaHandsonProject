package com.example.scala

object WhileLoopStatment {
  
  def main(args: Array[String]){
    
    var x = 0;
    
    while(x < 10){
      println("While Statement: X = "+ x);
      x +=1;
    }
    
    var y =0;
    do{
      println("Do while Statement: Y = " + y);
      y +=1;
    }while ( y < 10);
  }
}