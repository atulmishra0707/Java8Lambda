package org.java.atul;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List <Person> people= Arrays.asList(new Person("Atul",33),new Person("Rup",34),new Person("Varun",36),new Person("Salil",35),new Person("Shyam",37));

		Collections.sort(people,(p1,p2)->p1.getName().compareTo(p2.getName()));
		
		System.out.println("Print all - ");
		printConditionally(people, p-> true);
		
		System.out.println("Print all person with name beginning with S");
		printConditionally(people, p-> p.getName().startsWith("S"));
		
	}

	private static void printConditionally(List<Person> people, Predicate<Person> condition) {
		// TODO Auto-generated method stub
		for(Person p : people){
			if(condition.test(p)){
				System.out.println(p);
			}
		}
		
	}

}
