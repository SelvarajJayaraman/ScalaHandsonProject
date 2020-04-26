package com.example.scala

object StringInterpolation {
  
  def main(args: Array[String]){
    
    val name = "Selva";
    val age  = 18;
    
    println(name + " is "+ age + " Years old");
    
    /* As String interpolation
     * its not type safe
    */
    println(s"$name is $age Years old");
    
    /* F as String interpolation
     * its type safe.
     */
    println(f"$name%s is $age%d Years old");
    
    /* 
     * Raw String interpolation
     * 
     */
    println(s"Hello \n world");
    
    println(raw"Hello \n world");
  }
}