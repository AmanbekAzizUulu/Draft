package enums;

public class Car {
    private Engine engine;
    private String model;
    
    
    
    public Car() {
	this.engine = new Engine();
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    class Engine {
	private EngineState state;
	private double capacity;
	private double power;
	
	
	public Engine() {
	    this.state = EngineState.TURN_OFF;
	}
	
	public EngineState getState() {
	    return state;
	}
	public void setState(EngineState state) {
	    this.state = state;
	}
	
	
    }
}
