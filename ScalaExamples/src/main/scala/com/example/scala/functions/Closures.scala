//Scala - Closures

/* A closure is a function  which uses  one or more variables
 *  declared outside of function. 
 *  
 *  Its two types
 *  1.improper closure
 *  2.Proper closure
 */

package com.example.scala.functions

object Closures {
  
  //improper closure
  var number = 10;
  
  def add (x:Int): Int = {
    return x + number;
  }
  
  //proper closure
  val value =20;
  
  def multiply =( y:Int) =>  y * value;
  
  def main(args: Array[String]){
    
    val result = add(10);
    println(result);
    
    val result1 = multiply(30);
    println(result1);
    
  }
  
}