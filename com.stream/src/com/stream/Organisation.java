package com.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
public class Organisation {
	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(3,"Tom",55));
		emp.add(new Employee(4,"Ram",35));
		emp.add(new Employee(5,"Sam",65));
		emp.add(new Employee(2,"Tom",25));
		emp.add(new Employee(6,"Jhon",76));
		emp.add(new Employee(1,"Vicky",15));
		
		List<Integer>empdetail=emp.stream().filter(a->a.age>50).map(a->a.age).collect(Collectors.toList());
		System.out.println(empdetail);
		Employee e1=emp.stream().max((a,b)->a.age>b.age?1:-1).get();
		System.out.println(e1.age);
		Employee e2=emp.stream().min((a,b)->a.age>b.age?1:-1).get();
		System.out.println(e2.age);
		Set<String>empdetail1=emp.stream().filter(a->a.name.equals(a.name)).map(a->a.name).collect(Collectors.toSet());
		System.out.println(empdetail1);
		/*Set<String>empdetail2=emp.stream().filter(a->a.name==a.name).map(a->a.name).collect(Collectors.toSet());
		System.out.println(empdetail2);  */
		
	}

}
class Employee{
	int id;
	String name;
	int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
