package java8.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmplyeeTest {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("prem", "ECE", 28));
		emp.add(new Employee("prem3", "ECE", 23));
		emp.add(new Employee("prem2", "ECE", 23));
		emp.add(new Employee("prem4", "CSE", 22));
		
		// it returns all the summery of age 
		IntSummaryStatistics collect3 = emp.stream().collect(Collectors.summarizingInt(Employee::getAge));
		
		System.out.println("average age "+collect3.getAverage());
		System.out.println("total ages "+collect3.getSum());
		
		Map<Boolean, List<Employee>> collect2 = emp.stream().collect(Collectors.partitioningBy(e->e.getAge()>23));
		
		Set<Entry<Boolean,List<Employee>>> entrySet = collect2.entrySet();
		
		for(Map.Entry<Boolean, List<Employee>> p:entrySet)
		{
			
			List<Employee> value = p.getValue();
			System.out.println(value);
		}
		
		System.out.println("max Age");
		Employee employee3 = emp.stream().max(Comparator.comparingInt(Employee::getAge)).get();
		
		System.out.println(employee3);
		Employee employee2 = emp.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge))).get();
		System.out.println(employee2);
		Integer integer = emp.stream().map(e->e.getAge()).max((o1,o2)->o1-o2).get();
		System.out.println(integer);
		

		Comparator<Employee> comparing = Comparator.comparing(Employee::getAge);
		Comparator<Employee> comparing1 = Comparator.comparing(Employee::getName);
		Comparator<Employee> comparing2 = Comparator.comparing(Employee::getBranch);
		Comparator<Employee> thenComparing = comparing.thenComparing(comparing2);

		emp.stream().sorted(comparing.thenComparing(comparing1).thenComparing(comparing2)).forEach(System.out::println);

		System.out.println();

		
		Employee employee = emp.stream().filter(e -> e.getBranch().equalsIgnoreCase("CSE"))
				.min(Comparator.comparing(Employee::getAge)).get();
		System.out.println(employee);
		Employee employee1 = emp.stream().filter(e -> e.getBranch().equalsIgnoreCase("ECE"))
				.max(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println(employee1);
		
		Map<String, Optional<Employee>> collect = emp.stream().collect(Collectors.groupingBy(Employee::getBranch,Collectors.maxBy(Comparator.comparingInt(Employee::getAge))));
		
		collect.forEach((dept, emp1) -> {
		    System.out.println("Department: " + dept + ", Max Age: " +
		            emp1.map(Employee::getAge).orElse(0));
		});
	}
	}

