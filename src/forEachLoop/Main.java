package forEachLoop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
	List<Employee> employees = new LinkedList<Employee>();
	Employee employeeHolder;

	employees.add(new Employee("Aibek"));
	employees.add(new Employee("Rasul"));
	employees.add(new Employee("Sultan"));
	employees.add(new Employee("Maksat"));
	employees.add(new Employee("Uluk"));

	System.out.println("___________________________");
	System.out.println("\nIterating through collection objects using an iterator\n");
	Iterator<Employee> employeeIterator = employees.iterator();
	while (employeeIterator.hasNext()) {
	    employeeHolder = employeeIterator.next();
	    System.out.println(employeeHolder);
	}

	System.out.println("___________________________");
	System.out.println("\nIterating through collection objects using the enhanced for loop\n");
	Company company = new Company(new Employee("Stevie"), new Employee("Aibek"));

	for (Employee employee : company.getEmployees()) {
	    System.out.println(employee.toString());
	}

	System.out.println();
	int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int counter = 0;

	System.out.println("    index\t|\tvalue");
	System.out.println("----------------+------------------");
	for (int x : numbers) {
	    System.out.println("\t" + counter + "\t|\t" + x);
	    counter++;
	}

	/*	
	 * 	In this cases, the iteration process is happening over a two-dimensional arrays
	 */
	System.out.println();
	int sum = 0;
	int nums[][] = new int[3][5];

	for (int i = 0; i < nums.length; i++) {
	    for (int j = 0; j < nums.length; j++) {
		nums[i][j] = new Random().nextInt(5);
	    }
	}


	int counter_1 = 0;
	System.out.println("    index\t|\tvalue");
	System.out.println("----------------+------------------");
	for (int num[] : nums) {
	    for (int element : num) {
		System.out.println("\t" + counter_1 + "\t|\t" + element);
		counter_1++;
	    }
	}

	for (int[] arrayToGatherAllValues : nums) {
	    for (int x : arrayToGatherAllValues) {
		sum += x;
	    }
	}
	System.out.println("" + sum);
    }

}
