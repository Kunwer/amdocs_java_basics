package com.training.java8;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class LambdaDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//sum(a,b);
		MyInterface obj = (x, y) -> x+y;
		//System.out.println(obj.getSum(30,40));
		
		
		String s1 = "Hello";
		String s2 = "Hello";
		CompareStr obj1 = (x,y) -> x.equals(y);
		//System.out.println(obj1.compare(s1, s2));
		
		
		// Using inbuilt Functional Interfaces
		Predicate<Integer> p1 = x->x>10;
		//System.out.println(p1.test(11));
		
		BiConsumer<String,String> bc = (x,y) -> System.out.println(x+" "+y);
		//bc.accept("Kunwer", "Naveesh");
		
	}	
	/*
	private static int sum(int x, int y) {
		return x+y;
	}*/
	
}
