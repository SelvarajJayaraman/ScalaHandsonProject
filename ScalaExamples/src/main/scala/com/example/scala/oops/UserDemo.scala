package com.example.scala.oops

object UserDemo {
  
   def main(args: Array[String]){
     
      var user = new User("Selva", 32);
      user.printValue;
      user.callValue("Raj", 33);
   }
}