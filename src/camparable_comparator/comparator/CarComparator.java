package camparable_comparator.comparator;

import java.util.Comparator;

public class CarComparator {
    /**
     * 	This method returns a comparator for implementing comparisons of {@code Car} class instances based on their model names.
     *	
     *	@throws NullPointerException 	if an argument is null and this comparator
     *			       does not permit null arguments
     *	@throws ClassCastException if the arguments' types prevent them from 
     *			     being compared by this comparator
     *	@return Comparator for instances of Car class  
     */
    public Comparator<Car> compareByModel() {
	return new Comparator<Car>() {
	    @Override
	    public int compare(Car car1, Car car2) {
		return car1.getModel().compareTo(car2.getModel());
	    }

	};
    }
    
    /**
     * 	This method returns a comparator for implementing comparisons of {@code Car}  class instances based on their year of manufacture.
     *	
     *	@throws NullPointerException if an argument is null and this comparator
     *			       does not permit null arguments
     *	@throws ClassCastException if the arguments' types prevent them from 
     *			     being compared by this comparator
     *	@return Comparator for instances of Car class  
     */
    public Comparator<Car> compareByYear() {
	return new Comparator<Car>() {
	    @Override
	    public int compare(Car car1, Car car2) {
		return car1.getYear().compareTo(car2.getYear());
	    }
	};
    }
}
