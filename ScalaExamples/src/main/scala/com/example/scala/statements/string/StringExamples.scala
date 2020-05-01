package com.example.scala.statements.string;


object StringExamples {
  
  val str1: String = "Hello World";
  val str2: String = "May";
  
  val number1: Int = 50;
  val number2: Double = 100.50;
  
  def main(args: Array[String]){
    
    println("Str1 length:"+str1.length());
    println("Concatation of String:"+ str1+" "+str2);
    println(str1.concat(str2));
    
    printf("%d -- %f -- %s", number1,number2,str1);
    
  }
}