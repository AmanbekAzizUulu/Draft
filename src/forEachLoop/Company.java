package forEachLoop;

import java.util.Arrays;

public class Company {
    private Employee[] employees;
 
    
    @Override
    public String toString() {
	return "Company [employees=" + Arrays.toString(employees) + "]";
    }
    
    public Company(Employee... employees) {
	this.employees = employees; 
    }
    
    public Employee[] getEmployees() {
	return employees;
    }

    
    public void setEmployees(Employee[] employees) {
	this.employees = employees;
    }
}
