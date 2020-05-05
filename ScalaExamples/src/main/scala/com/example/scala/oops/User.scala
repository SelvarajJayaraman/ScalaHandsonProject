package com.example.scala.oops

class User (val name: String, val age: Int) {
  
   def printValue(){
     
     println("Name:"+name);
     println("Age:"+ age);
     
   }
   
   def callValue(argName :String, argAge: Int ){
     println("Called function Values:");
     println("Name:"+ argName);
     println("Age:" + argAge);
   }
}