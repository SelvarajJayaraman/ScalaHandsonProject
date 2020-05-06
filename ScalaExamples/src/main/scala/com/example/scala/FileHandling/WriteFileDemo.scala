package com.example.scala.FileHandling

import java.io._;

object WriteFileDemo {
  
   def main(args : Array[String]){
     
     try{
        val writer = new PrintWriter("Sample.txt");
        writer.write("Selvakumar");
        writer.close();
     }catch{
       case ex: Exception => {
         println(ex);
       }
     }
     
   }
}