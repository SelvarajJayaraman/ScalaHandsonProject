package com.example.scala.buildInFunctions

object OptionType {
  
  val mylist = List(1,4,2,3);
  val map = Map(100 -> "Selva", 101-> "Raj",102 -> "Kumar");
  
  def main(args: Array[String]){
    
     println(mylist.find(_ > 2).getOrElse(0));
     
     println(map.get(1010).getOrElse("Default"));
  }
}