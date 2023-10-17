package com.training.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		//Stream API
		//1. Intermediate Operation(s) -- multiple
		//2. Terminal Operation -- one
		
		List<Integer> numbers = Arrays.asList(10,12,15,17,21,20);
		
		Stream<Integer> numStream = numbers.stream();
		//numStream.filter(x->x>15).map(n->n*n).forEach(t->System.out.println(t));
		
		List<String> names = Arrays.asList("Samay","Sunny","Ajay","Kunwer","Sam","Tanya","Saarthak");
		//names.stream().filter(x->x.startsWith("S")).map(y->y+" ADI").sorted().forEach(t->System.out.println(t));//you can write forEach(System.out::println)
		names.stream().filter(x->x.startsWith("S")).map(y->y+" ADI").sorted().forEach(System.out::println);
		//to convert stream to list:
		List<String> Filterednames= names.stream().filter(x->x.startsWith("S")).map(y->y+" ADI").sorted().collect(Collectors.toList());
	}
}
