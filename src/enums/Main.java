package enums;

public class Main {

    public static void main(String[] args) {
	Engine engine = new Engine();
	
	engine.state = State.ACTIVE;
	
	engine.state.doSomething();
    }

}
