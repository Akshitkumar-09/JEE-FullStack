package com.LambdaExp;

public class Test {
	interface FuncInter1 {
	        int operation(int x, int y);
	    }
	    private int operate(int x, int y, FuncInter1 fobj)
	    {
	        return fobj.operation(x, y);
	    }
	 
	    public static void main(String args[])
	    {
	       
	        FuncInter1 multiply = (int x, int y) -> x * y;
	        Test tobj = new Test();
	        System.out.println("Multiplication is "
	                           + tobj.operate(2, 8, multiply));
	 
	    }
	}


