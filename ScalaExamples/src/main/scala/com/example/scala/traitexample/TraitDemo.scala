package com.example.scala.traitexample

object TraitDemo {
  
   def main(args : Array[String]){
     
     var rect = new Rectangle(55.2,20.1);
     printValues(rect,rect);
     
     var tri = new Triangle(30.5,22.1);
     printValues(tri,tri);
     
   }
   
   def printValues(p: Polygen, s : Shape){
     println(p.area);
     println(s.color);
   }
}