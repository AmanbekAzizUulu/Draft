package camparable_comparator.comparable;

public class Car implements Comparable<Car>{
    private String model;
    private Integer yearOfManufacture;
    
    
    public Car(String model, int yearOfManufacture) {
	this.model = model;
	this.yearOfManufacture = yearOfManufacture;
    }
    
    @Override
    public String toString() {
	return "Car [model = " + model 
		+ ", year of manufacture = " 
		+ yearOfManufacture + "]";
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return yearOfManufacture;
    }
    public void setYear(int year) {
        this.yearOfManufacture = year;
    }


    
    /*
     *	If the current object (this) is less than the object passed into the method 
     *	( .compareTo() is invoked on this object with the argument), a negative value is returned.
     * 	
     * 	If the current object (this) is greater than the object passed into the method, 
     * 	a positive value is returned.

     *	If the current object (this) is equal to the object passed into the method, zero is returned.
     *
     *	This provides the ability to determine the ordering of objects considering their values and 
     *	relationships to each other. For example, if you have a list of objects and want to sort them, 
     *	you can use the .compareTo() method to establish the order of elements in that list.
     * 
 
     * 	By the Java convention:
     * 
     * 	if 	object1 > object2 => returns 1;
     * 	else if  object1 < object2 => returns -1;
     * 	else 	object1 == object2 => returns 0;
     *
     */
    
    
    /*
     *	Custom implementation 
     */
    
//    @Override
//    public int compareTo(Car objectToCompare) {
//        if (this.yearOfManufacture < objectToCompare.yearOfManufacture) {
//            return -1;
//        } else if (this.yearOfManufacture > objectToCompare.yearOfManufacture) {
//          return 1;
//        } else {
//            return 0;
//        }
//    }
    
    @Override
    public int compareTo(Car objectToCompare) {
	return this.model.compareTo(objectToCompare.model);
    }
}
