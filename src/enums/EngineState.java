package enums;

public enum EngineState implements Activable {
    TURN_OFF {
	@Override
	public void accomplishRequest() {
	    System.out.println("The engine is turned off.");
	}
    },
    ACTIVE {
	@Override
	public void accomplishRequest() {
	    try {
		System.out.println("Attempting to start the engine ...");
		Thread.sleep(1000);
		System.out.println("Attempting to start the engine ...");
		Thread.sleep(1000);
		System.out.println("The engine is started.");
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
    };
}
