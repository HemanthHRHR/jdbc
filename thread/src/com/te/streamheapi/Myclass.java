package com.te.streamheapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Myclass {

	public static void main(String[] args) {
	List<Employee> list =	Arrays.asList(new Employee(100, "hemanth", 55454, "hr", 40),
			new Employee(101, "hg", 65, "fgddfdf", 34),
			new Employee(102, "hg1", 645, "hreegddfdf", 44),
			new Employee(101, "hg2", 6756565, "hellof", 65));
	
	Employee e = list.get(0);
	for(int i =1;i<list.size();i++) {
		if(e.getAge()>list.get(i).getAge()) {
			e=list.get(i);
		}
	}
	System.out.println(e);
	
	Stream<Employee> stream = list.stream();
	Optional<Employee> min = stream.min(Comparator.comparing(Employee::getAge));
	System.out.println(min);
	
	
	
	System.out.println("=============================================");
	list.stream().max(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
				
	//sorting
	List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee:: getName )).collect(Collectors.toList()); 
collect.forEach(System.out::println);
List<Employee> collect1 = list.stream().sorted(Comparator.comparing(Employee:: getSalary )).collect(Collectors.toList()); 
collect.forEach(System.out::println);
System.out.println("==========================");


Map<String, List<Employee>> collect2=list.stream().collect(Collectors.groupingBy(Employee::getDesgination));
	collect2.forEach((department,emp)->{
		System.out.println(department);
		emp.forEach(System.out::println);
		System.out.println("===============");
	});
	List<Employee> collect3 = list.stream().filter(em->em.getAge()>20).collect(Collectors.toList());
	collect3.forEach(System.out::println);
	System.out.println("==================");
	
	 list.stream().filter(em->em.getSalary()>20000).collect(Collectors.toList()).forEach(System.out::println);
	 System.out.println("=================");
	 boolean b = list.stream().anyMatch(em->em.getAge()<20);
	 System.out.println(b);
	
	
}
}