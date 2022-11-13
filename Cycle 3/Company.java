import java.util.*;
import java.util.Scanner;

class Employee {

	public String name;
	public int age;
	public long phoneNumber;
	public String address;
	public float salary;

	public void printSalary() {

		System.out.println("Salary: " + this.salary);
	}
}

class Officer extends Employee {

	public String specialization;
}

class Manager extends Employee {

	public String department;
}

public class company {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Officer officer = new Officer();
		
		System.out.println("------Enter the details of officer--------");
		System.out.println("Enter the name");
		officer.name = sc.nextLine();
		System.out.println("Enter the age");
		officer.age= sc.nextInt();
		System.out.println("Enter the phonenumber");
		officer.phoneNumber= sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the address");
		officer.address= sc.nextLine();
		System.out.println("Enter the specification");
		officer.specialization= sc.nextLine();
		System.out.println("Enter the salary");
		officer.salary= sc.nextFloat();
		
	
		System.out.println("------ Officer ------");
		System.out.println("Name: " + officer.name);
		System.out.println("Age: " + officer.age);
		System.out.println("Phone number: " + officer.phoneNumber);
		System.out.println("Address: " + officer.address);
		officer.printSalary();
		System.out.println("Specilization: " + officer.specialization);





		Manager manager = new Manager();
		System.out.println("------Enter the details of manager--------");
		sc.nextLine();
		System.out.println("Enter the name");
		manager.name = sc.nextLine();
	
		System.out.println("Enter the age");
		manager.age = sc.nextInt();
		System.out.println("Enter the phonenumber");
		manager.phoneNumber = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the address");
		manager.address = sc.nextLine();
		System.out.println("Enter the department");
		manager.department = sc.nextLine();
		System.out.println("Enter the salary");
		manager.salary = sc.nextLong();
	
			
		System.out.println("------ Manager ------");
		System.out.println("Name: " + manager.name);
		System.out.println("Age: " + manager.age);
		System.out.println("Phone number: " + manager.phoneNumber);
		System.out.println("Address: " + manager.address);
		manager.printSalary();
		System.out.println("Department: " + manager.department);
	}
}
