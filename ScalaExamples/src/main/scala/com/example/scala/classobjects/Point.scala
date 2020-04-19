package com.example.scala.classobjects

class Point(val xc: Int, val yc:Int){
  
  var x: Int = xc;
  var y: Int = yc;
  
  def move(dx: Int, dy: Int){
    x = x + dx;
    y = y + dy;
    
    println("Point of x location:" + x);
    println("Point of y location:" + y);
  }
}