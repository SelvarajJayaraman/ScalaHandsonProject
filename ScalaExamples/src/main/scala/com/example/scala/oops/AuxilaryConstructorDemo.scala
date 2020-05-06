package com.example.scala.oops

class Employee(var name : String, var age : Int) {// Primary constructor
  
  def this(){ // auxilary constructor without parameter
    this("selva",32);
  }
  
  def this(name : String ){
    this(name, 34);
  }
  
  def printEmpDetails(empId : Int){
    println("Employee details "+ empId + ":" + name + "  " + age);
  }
  
}

object AuxilaryConstructorDemo {
  
   def main(args: Array[String]){
     
      var employee1 = new Employee("Ravi" , 45);
      employee1.printEmpDetails(1);
      
      var employee2 = new Employee();
      employee2.printEmpDetails(2);
      
      var employee3 = new Employee("bala");
      employee3.printEmpDetails(3);
   }
}