package customclassiterable;

public class Employee {
    private static final String[] POSITIONS = { 
	    "Human Resource", 
	    "Accountant", 
	    "Dispatch", 
	    "Software Developer",
	    "Sales Manager" 
    };
    
    private String name;
    private int age;
    private int id;
    private String position;



    public Employee(String name, int age) {
	this.name = name;
	this.age = age;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }
    
    public String getPosition() {
	return position;
    }

    public void setPosition(String position) {
	this.position = position;
    }

    public static String[] getPositions() {
	return POSITIONS;
    }

    public static String getPosition(int index) {
	return POSITIONS[index];
    }

    @Override
    public String toString() {
	return "Employee \n\t[ name = " + name 
		+ ",\n\t  age = " + age 
		+ ",\n\t  id = " + id 
		+ ",\n\t  position = " + position + " ]";
    }
}
