package com.example.scala

object ListExample {
  
  val mylist: List[Int] = List(3,7,10,15);
  
  def main(args: Array[String]){
    
    println(mylist);
    
    //Iterating list
    mylist.foreach(  println);
    
    var sum : Int = 0;
    mylist.foreach(sum +=_);
    println(sum);
    
    for( x <- mylist){
      println(x);
    }
  }
}