package com.javaAssessments;
import java.lang.Math;
public class DiffSumofSquare {

	public static int squareDiff(int n) {
		// TODO Auto-generated method stub
		int sumOfSquares = 0;
		int sum = 0;
		
		(int i = 1; i <= n; i++) {
			sumOfSquares += Math.pow(i, 2);
			sum += i;
		}
		int squareOfSum = (int) Math.pow(sum, 2);
		int absDifference = Math.pow(sumOfSquares - squareOfSum);
		return absDifference;
}
public static void main(String[] args) {
	int n = 10;
	System.out.println(squareDiff(n));
}
}
