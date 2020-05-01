package com.example.scala.functions

/* Scala - Currying
 *  Currying is the technique of transforming a function
 *  that takes multiple arguments into a function
 * 	that takes as single argument.
 */

object CurryingFunctions {
  
  // Normal function
  def add1(x:Int, y:Int) = x+y;
  
  //Currying function
  def add2 (x:Int) = (y:Int) => x+y;
  
  //Currying function
  def add3 (x:Int) (y:Int) = x+y;
  
  def main(args: Array[String]){
    
    println(add1(20,30));
    
    println(add2(30)(30));
    
    val sum1= add2(50);
    println(sum1(40));
    
    println(add3(100)(150));
    val sum2 = add3(60)_;
    println(sum2(50));
  }
}