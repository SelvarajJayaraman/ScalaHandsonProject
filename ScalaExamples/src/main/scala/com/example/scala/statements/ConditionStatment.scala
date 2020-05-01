package com.example.scala.statements

object ConditionStatment {
  
  def main(args: Array[String]){
     val x = 20;
     var result1 = "";
     
     if(x == 20){
       result1 = "X = 20";
     }else {
       result1 = "X !=20";
     }
     
     println(result1);
     
     var result2 = if( x!=20) "X = 20" else "X !=20";
     println(result2);
  }
}