package com.sp1.test

class Animal

class Dog(val name :String) extends Animal with Friend{
  override def listen = println(name + " is listening quitely..")
}

class Cat(val name:String)