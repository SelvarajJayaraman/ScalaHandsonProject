package com.example.scala.traitexample

class Rectangle( var width : Double, var height : Double) extends Polygen with Shape {
  
  //trait method implmentation
  def color : String = "red";
  
  //abstract method implementation
  def area : Double = width * height;
}