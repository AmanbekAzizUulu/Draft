package forEachLoop;

import java.util.Iterator;

public class Employee implements Iterable<Employee>{
    private String name;
    
    public Employee(String name) {
	this.name = name;
    }
    
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	return "Employee [name=" + name + "]";
    }

    @Override
    public Iterator<Employee> iterator() {
	return null;
    }
}
