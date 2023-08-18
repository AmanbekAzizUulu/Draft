package customclassiterable;

import java.util.Iterator;
/**
 * Custom class implementing the Iterator pattern.
 * 
 * @author Aibek Dandaev
 * 
 */
public class EmployeeIterator implements Iterable<Employee> {
    private Employee[] employees;

    public EmployeeIterator(Employee... employees) {
	this.setEmployees(employees);
    }

    @Override
    public Iterator<Employee> iterator() {
	return new MyIterator();
    }

    public Employee[] getEmployees() {
	return employees;
    }

    public Employee getEmployees(int index) {
	return employees[index];
    }

    public void setEmployees(Employee[] employees) {
	this.employees = employees;
    }

    class MyIterator implements Iterator<Employee> {
	private int currentIndex = 0;

	@Override
	public boolean hasNext() {
	    return currentIndex <= getEmployees().length - 1;
	}

	@Override
	public Employee next() {
	    return getEmployees()[currentIndex++];
	}
    }
}
