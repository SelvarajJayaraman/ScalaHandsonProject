package com.example.scala.oops.inheritence

object InheritanceDemo {
  
   def main(args: Array[String]){
     
     var ploygen = new Ploygen();
     printArea(ploygen, "Ploygen");
     
     var rectangle = new Rectangle(55.2, 22.0);
     printArea(rectangle, "Rectangle");
     
     var triangle = new Triangle(30.0,40.0);
     printArea(triangle, "Triangle");
     
   }
   
   def printArea (p : Ploygen, diagram : String) {
     println(diagram + " " +p.area);
   }
}