package com.java8all;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Report {
	public static void main(String[] args) {
		ArrayList<Student> stud=new ArrayList<Student>();
		stud.add(new Student(2,"Tom",66.6f));
		stud.add(new Student(1,"Ram",85.0f));
		stud.add(new Student(7,"Sam",76.6f));
		stud.add(new Student(5,"Jhon",58.6f));
		stud.add(new Student(6,"Aji",44.6f));
		stud.add(new Student(3,"Nandhu",73.6f));
		stud.add(new Student(4,"Vicky",15.3f));
		
		Predicate<Student>p1=(i1)->(i1.marks>80);
		Predicate<Student>p2=(i2)->(i2.marks>60 && i2.marks<80);
		Predicate<Student>p3=(i3)->(i3.marks>50 && i3.marks<60);
		Predicate<Student>p4=(i4)->(i4.marks>35 && i4.marks<50);
		Predicate<Student>p5=(i5)->(i5.marks<35);
		//Consumer<Student> consum=name->n.name;
		for(Student i:stud) 
		{
			if(p1.test(i))
			    System.out.println("distinction "+i.marks+" "+i.name);
			    //System.out.println(k.name);
			else if(p2.test(i))
				System.out.println("First class "+i.marks);
			else if(p3.test(i))
				System.out.println("Second class "+i.marks);
			else if(p4.test(i))
				System.out.println("Third class "+i.marks);
			else if (p5.test(i))	
			   System.out.println("Fail "+i.marks);
		  }	
	}
}
class Student{
	int id;
	String name;
	float marks;
	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}
