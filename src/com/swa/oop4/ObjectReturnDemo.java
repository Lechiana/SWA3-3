package com.swa.oop4;

public class ObjectReturnDemo {
	int a;
	  
    ObjectReturnDemo(int i)
    {
        a = i;
    }
  
    // This method returns an object
    ObjectReturnDemo incrByTen()
    {
        ObjectReturnDemo temp =
               new ObjectReturnDemo(a+10);
        return temp;
    }
}
