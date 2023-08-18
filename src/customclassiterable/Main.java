package customclassiterable;

import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

	EmployeeIterator employees = new EmployeeIterator(
		new Employee("John", 23), 
		new Employee("Anna", 25), 
		new Employee("Eleonora", 37)
	);
	
	System.out.println("____________________________________________");
	System.out.println("\nIteration using an instance of Iterator<T>:\n");
	Iterator<Employee> iterator = employees.iterator();
	while (iterator.hasNext()) {
	    System.out.println(iterator.next());
	}
	
	System.out.println("____________________________________________");
	System.out.println("\nAfter initializing the ID and Position fields in the lambda expression  .forEach(Consumer<? super T> action):\n");
	employees.forEach(element -> {
	    element.setId(new Random().nextInt(123112));
	    element.setPosition(Employee.getPosition(new Random().nextInt(Employee.getPositions().length -1)));
	    System.out.println(element);
	});
    }
}
