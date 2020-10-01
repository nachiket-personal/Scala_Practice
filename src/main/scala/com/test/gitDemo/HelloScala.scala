package com.test.gitDemo

object HelloScala {
  def main(args: Array[String]): Unit = {
    println("Hello Scala Git Demo 1234")
    println("Hello I am Nachiket")

    println("Read Argument :- "+args.toString)
    val max = args.length

    for(i <- 0 until max by 2){
      var key = args(i)
      var value = args(i + 1)
      println("key :- "+key)
      println("value :- "+value)
    }
    println("Print Argument :- "+max)
  }

}
