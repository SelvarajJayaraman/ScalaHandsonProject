package com.example.scala.oops.Abstract

object AbstractDemo {
  
  def main(args: Array[String]){
    
    var Rectangle = new Rectangle( 55.2,22.0);
    printArea(Rectangle);
    
    var Triangle = new Triangle( 55.2,22.0);
    printArea(Triangle);
    
  }
  
  def printArea(p : Polygen){
    println(p.area);
  }
}