package com.training.collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.training.adi.Employee;

public class CollectionDemo {
	public static void main(String[] args) {
		/*
		List<Integer> myList = new ArrayList<>();
		myList.add(25);
		myList.add(26);
		myList.add(27);
		
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()) {
			int myNumber = it.next();
			System.out.print(myNumber+" ");
		}
		*/
		/*
		Set<Employee> empSet = new HashSet<>();
		empSet.add(new Employee("Kunwer",103,"it",12000));
		empSet.add(new Employee("naveesh",104,"it",18000));
		
		for(Employee emp:empSet) {
			System.out.println(emp.getEmpName());
		}
		*/
		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "Mark");
		myMap.put(2, "Pete");
		myMap.put(3,"Clara");
		myMap.put(4, "Ajay");
		
		for(Map.Entry<Integer,String> entry: myMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
	}
}
