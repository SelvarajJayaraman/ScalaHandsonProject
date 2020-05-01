package com.example.scala.collections

import Array._;

object ArrayExample {
  
  val myarray = new Array[Int](5);
  val myarray1 = Array(2,5,6,8,9);
  
  def main(args: Array[String]){
    //array value assignment
    
    myarray(0) = 20;
    myarray(1) = 50;
    myarray(2) = 30
    myarray(3) = 40;
    
    for ( x <- myarray){
      println(x);
    }
    
    val result = concat(myarray,myarray1);
    
    for( x <- result){
      println(x);
    }
  }
}