package enums;

public enum State implements Activable {
    ACTIVE {
	@Override
	public void doSomething() {
	    System.out.println("\"do something\" method");
	}
    },
    BLOCKED {
	@Override
	public void doSomething() {
	    
	}

    };

}
