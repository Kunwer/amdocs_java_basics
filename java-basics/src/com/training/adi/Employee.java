package com.training.adi;

public class Employee extends Person implements Comparable<Employee>{

	//private String empName;
	private int empId;
	private String deptName;
	private double salary;
	
	public Employee() {
		System.out.println("Object Initiated");
	}
	
	
	
	public Employee(String empName, int empId, String deptName, double salary) {
		super();
		this.name = empName;
		this.empId = empId;
		this.deptName = deptName;
		this.salary = salary;
	}



	public String getEmpName() {
		return this.name;
	}
	public void setEmpName(String empName) {
		this.name = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String getDetails() {
		return "Employee [empName=" + name + ", empId=" + empId + ", deptName=" + deptName + ", salary=" + salary
				+ "]";
	}
	

	@Override
	public String toString() {
		return "Employee [empName=" + name + ", empId=" + empId + ", deptName=" + deptName + ", salary=" + salary
				+ "]";
	}



	@Override
	public int compareTo(Employee o) {
		
		//return this.name.compareTo(o.getEmpName()); //for sorting by name
		if(this.empId<o.getEmpId()) { // To sort by ID
			return -1;
		}else if(this.empId>o.getEmpId()){
			return 1;
		}else {
			return 0;
		}
		
	}
	
	
}
