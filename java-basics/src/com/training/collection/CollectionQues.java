package com.training.collection;

import java.util.ArrayList;
import java.util.List;
import com.training.adi.Employee;

public class CollectionQues {
	public static void main(String[] args) {
		List<Employee> fullList= new ArrayList<>();
		fullList.add(new Employee("Kunwer Naveesh",101,"it",12000));
		fullList.add(new Employee("Aman",102,"Finance",18000));
		fullList.add(new Employee("Tanya",103,"sales",14000));
		fullList.add(new Employee("Ajay Rawat",104,"it",13000));
		fullList.add(new Employee("aadit",105,"it",13000));
		List<Employee> aList = new ArrayList<>();
		for(Employee emp: fullList) {
			if(emp.getEmpName().charAt(0)=='A' || emp.getEmpName().charAt(0)=='a') {
				aList.add(emp);
			}
		}
		for(Employee emp: aList) {
			System.out.println(emp.getEmpName());
		}
	}
}
