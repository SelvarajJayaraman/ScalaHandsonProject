package com.example.scala.lazyIntialzation

class strict {
   val e ={
      println("strict");
      9
   }
}

class lazyEval {
  
   lazy val e = {
      println("Lazy");
      9
   }
}

object LazyVariablesDemo {
  
  def main(args: Array[String]){
     var strict = new strict;
     println(strict.e);
     
     var lazyEval = new lazyEval;
     println(lazyEval.e);
  }
  
}