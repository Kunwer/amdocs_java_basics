package com.training.collection;

import java.util.Comparator;

import com.training.adi.Employee;

public class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}


}
