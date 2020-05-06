package com.example.scala.FileHandling

import scala.io.Source;

object ReadFileDemo {
  
   def main(args: Array[String]){
     
      println("Content of the file");
      Source.fromFile("Demo.txt").foreach{
        print;
      }
      
   }
}