package camparable_comparator.comparator;

public class Car{
    private String model;
    private Integer yearOfManufacture;
    
    public Car(String model, Integer yearOfManufacture) {
	this.model = model;
	this.yearOfManufacture = yearOfManufacture;
    }
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Integer getYear() {
        return yearOfManufacture;
    }
    public void setYear(int year) {
        this.yearOfManufacture = year;
    }
    
    @Override
    public String toString() {
	return "Car [model = " + model 
		+ ", year of manufacture = " 
		+ yearOfManufacture + "]";
    }

}
