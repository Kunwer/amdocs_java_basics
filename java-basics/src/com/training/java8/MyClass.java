package com.training.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass {
	public static void main(String[] args) {
		List<Product> prods = new ArrayList<>();
		prods.add(new Product(101,"New_bottle","utensil",800.0));
		prods.add(new Product(102,"headphones","electronics",1100.0));
		prods.add(new Product(103,"mouse","electronics",400.0));
		prods.add(new Product(104,"marker box","stationary",200.0));
		prods.add(new Product(105,"charger","electronics",700.0));
		prods.add(new Product(105,"charger","electronics",700.0));
		prods.add(new Product(107,"toy car","toy",700.0));
		prods.add(new Product(106,"doll","toy",300.0));
		prods.add(new Product(108,"toy house","toy",650.0));
		prods.add(new Product(109,"toy bear","toy",200.0));
		
		List<Product> finallist = prods.stream().filter(x -> x.getProdCategory()=="toy").filter(p->p.getPrice()<500.0).collect(Collectors.toList());
		finallist.stream().distinct().forEach(t->System.out.println(t.getProdName()+" "+t.getPrice()));
	}
}