package beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Autowired
	@Qualifier(value="e1")				// autowire is done byType. If more than one bean is present(there will be ambiguity), then instead of autowire-candidate, we can use @Qualifier with a value specified in it, to autowire byName specified in the @Qualifier(val)
	private Engine ex;						// if we use @Autowired, then by default autowire byType will be used. If there are more than one bean of same type, then autowired will check for @Qualifier, if it is not there, then autowire byName will be checked.
	
	private int price;
	
	private List<String> carlist;//doubt 
	
	/*public Car(){
		
	}*/
	/*public Car(Engine engine, int price){
		System.out.println("constructor injecting");
		this.ex = engine;
		this.price = price;
	}*/
	
	public Engine getEngine() {
		return ex;
	}

	/*public void setEngine(Engine engine) {
		System.out.println("setter injecting engine");
		this.ex = engine;
	}*/

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("setter injecting price");
		this.price = price;
	}

	public List<String> getCarlist() {
		return carlist;
	}

	public void setCarlist(List<String> carlist) {
		this.carlist = carlist;
	}

	
	
	
}
