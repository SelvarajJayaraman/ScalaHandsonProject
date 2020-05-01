package com.example.scala.collections

object SetExample {
  
  // immutable set
  val myset1: Set[Int] = Set(1,3,5,6,8,8);
  val myset2: Set[Int] = Set(1,6,3,2,5);
  val mynameset: Set[String] = Set("Selva","Raj","kumar","Raj");
  
  //mutable set
  var mutableset = scala.collection.mutable.Set(1,3,4,6);
  
  def main(args: Array[String]){
    
    //Example immutable set.
    println(myset1 + 10);
    println(myset1);
    
    //Example mutable set.
    println(mutableset + 11);
    println(mutableset);
    
    //concatination of sets.
    println("Concatnated sets:" + myset1.++(myset2));
    println("Intersected Sets:" + myset1.intersect(myset2));
    
    //Iterating Set
    for( x <- myset1){
      println(x);
    }
    
    myset1.foreach( println);
  }
}