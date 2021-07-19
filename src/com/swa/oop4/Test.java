package com.swa.oop4;

public class Test {
	public static void main(String args[])
    {
        ObjectReturnDemo ob1 = new ObjectReturnDemo(2);
        ObjectReturnDemo ob2;
  
        ob2 = ob1.incrByTen();
  
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
    }
}
