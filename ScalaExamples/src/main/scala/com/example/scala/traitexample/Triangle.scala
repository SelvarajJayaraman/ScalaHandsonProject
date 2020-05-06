package com.example.scala.traitexample

class Triangle (var width : Double, var height : Double) extends Polygen with Shape{
  
  //trait method implementation
  def color : String = "green";
  
  //abstract method implementation
  def area : Double = width + height;
}