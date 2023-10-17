package com.training.adi;
import java.util.Scanner;
import java.util.Arrays;

public class MyClass {
	public static void main(String[] args){
		/*
		Employee emp1 = new Employee();
		emp1.setEmpName("Kunwer Naveesh");
		emp1.setDeptName("IT");
		emp1.setEmpId(123);
		emp1.setSalary(50000);
		
		Employee emp2 = new Employee("Mit", 101, "IT", 141245);
		System.out.println(emp1.getEmpName());
		System.out.println(emp2);
		
		
		Student stu1 = new Student("Tanya Sharma", 11, 16,101);
		Student stu2 = new Student("Ajay", 7, 12,102);
		Student stu3 = new Student("Deepjot", 12, 17,103);
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		
		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s1==s2); // s1 and s2 point to the same literal value
		System.out.println(s3==s4); //s3 and s4 are objects so their hash values are compared i.e if both s3 and s4 are pointing to the same objects
		System.out.println(s3.equals(s4)); // when we use equals it checks their contents
		*/
		/*
		int[] temp = new int[5];
		temp[0]=12;
		temp[1]=13;
		int[] marks = new int[] {1,2,3,4,5};
		System.out.println(temp[0]);
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter values for array:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		*/
		/*
		int x = 0;
		try {
			int y = 5/x;
		}catch(ArithmeticException e) { // write Exception except of ArithmeticException if you don't know what kind of exception may occur
			System.out.println("Cannot divide by 0");
		}finally {
			// finally block should be used to release all the blocks like sc.close()
			System.out.println("Finally block always executes");
		}
		System.out.println("Program Continue");
		*/
		/*
		int a = 0;
		try {
			temp(a);
		}catch(Exception e) {
			System.out.println("Exception thrown");
		}
		
		int marks =20;
		if (marks<50) {
			//throw new NumberFormatException(); to throw a system defined exception
			 // This is used to throw a user defined Exception
			try {
				throw new MyException("Value cannot be less than 50");
			}catch(Exception e) {
				System.out.println("Exception occurred");
			}
		}
		*/
		/*
		PermanentEmployee emp = new PermanentEmployee();
		emp.setName("Kunwer");
		emp.setNetSalary(100000);
		System.out.println(emp.getPfAmount());
		*/
		Bank b1 = new SBI();
		System.out.println(b1.getInterestRate());
	}
	
	//static void temp(int a) throws Exception{
		//int b = 5/a;
	//}
}
