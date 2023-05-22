package com.LambdaExp;

import java.util.function.Consumer;

public class Spacing {
	public static void main(String[] args) {
		Consumer<String> con = x-> {
			x = x.replaceAll(""," ");
			x.trim();
			System.out.println(x);
		};
		con.accept("AKSHIT");
	}


}
