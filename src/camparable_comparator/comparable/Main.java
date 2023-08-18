package camparable_comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Car> cars = new ArrayList<Car>();
	
	cars.add(new Car("BMW", 1998));
	cars.add(new Car("Volvo", 2000));
	cars.add(new Car("Mercedes Benz", 2023));
	cars.add(new Car("Lada Granta", 2018));
	cars.add(new Car("Citroën", 2005));
	cars.add(new Car("Citroën C3", 2022));
	cars.add(new Car("Citroën C5 Aircross", 2023));
	
	Collections.sort(cars);
	for (Car car : cars) {
	    System.out.println(car);
	}
	
    }

}
