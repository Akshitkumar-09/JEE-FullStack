package com.GenericDemo;

class Test<T, U>
{
    T obj1;  // object of type T
    U obj2;  // object of type U
 
    Test(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
 
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

   public class GenericDemo<T, U> {

	 public static void main (String[] args)
	    {
	        Test <String, Long> obj =
	            new Test<String, Long>("Akshit", 9109687043L);
	 
	        obj.print();
	    }
    }

