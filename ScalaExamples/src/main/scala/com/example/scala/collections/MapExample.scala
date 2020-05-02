package com.example.scala.collections

object MapExample {
  
  val mymap1: Map[Int,String] = Map(100 -> "selva",101 -> "Raj", 102-> "kumar");
  val mymap2: Map[Int,String] = Map(103 -> "bala");
  
  def main(args: Array[String]){
    
    println("Print raw map:" + mymap1);
    
    println("Get the Specific value using key: "+ mymap1(101));
    
    println("Print all keys in map:" + mymap1.keys);
    
    println("Print all values in map:" + mymap1.values);
    
    println("Check map is empty:" + mymap1.isEmpty);
    
    //Iterate and print key and values from map.
    mymap1.keys.foreach { key =>
      println("Key:" + key);
      println("Value:" + mymap1(key));
    }
    
    //concat two maps.
    println(mymap1 ++ mymap2);
  }
}