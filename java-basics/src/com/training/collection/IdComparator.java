package com.training.collection;

import java.util.Comparator;

import com.training.adi.Employee;

public class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmpId()<o2.getEmpId()) {
			return -1;
		}else if(o1.getEmpId()>o2.getEmpId()) {
			return 1;
		}else {
			return 0;
		}
	}
	
}
