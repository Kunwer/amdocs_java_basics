package com.training.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.training.adi.Employee;

public class SortObjects {
	public static void main(String[] args) {
		List<Employee> fullList= new ArrayList<>();
		fullList.add(new Employee("Kunwer Naveesh",106,"it",12000));
		fullList.add(new Employee("Aman",102,"Finance",18000));
		fullList.add(new Employee("Tanya",101,"sales",14000));
		fullList.add(new Employee("Ajay Rawat",104,"it",13000));
		fullList.add(new Employee("Aadit",105,"it",13000));
		
		//Collections.sort(fullList, new NameComparator());
		Collections.sort(fullList, new IdComparator());
		/*
		for(Employee emp:fullList) {
			System.out.println(emp.getEmpName());
		}*/
		Set<Employee> empSet= new TreeSet<>(); //Since TreeSet is sorted so we need to implement Comparable in Employee class
		empSet.add(new Employee("Kunwer Naveesh",106,"it",12000));
		empSet.add(new Employee("Aman",102,"Finance",18000));
		empSet.add(new Employee("Tanya",101,"sales",14000));
		empSet.add(new Employee("Ajay Rawat",104,"it",13000));
		empSet.add(new Employee("Aadit",105,"it",13000));
		for(Employee emp:empSet) {
			System.out.println(emp.getEmpName());
		}
	}

}
