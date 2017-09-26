/**
 * 
 */
package com.starcraft.v1;

/**
 * @author clarkjia
 *
 */
import com.starcraft.v1.engine.Engine;
import com.starcraft.v1.struture.*;

public class Car {
	private String name;
	private Engine engine;
	private Body body;
	private Chassis chassis;
	private Wheel[] wheels;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Chassis getChassis() {
		return chassis;
	}

	public void setChassis(Chassis chassis) {
		this.chassis = chassis;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public Car(String name) {
		this.name = name;
	}
	
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "A car: \n" + "\""
    			+ "name:" + name + "\""
    			+ "body:" + body + "\""
    			+ "chassis:" + chassis + "\""
    			+ "wheels:" + wheels;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car mycar = new Car("Star*");
		mycar.setEngine(new Engine());
		mycar.setBody(new Body());
		mycar.setChassis(new Chassis());
		mycar.setWheels(new Wheel[4]);
		System.out.println(mycar);
	}
	

}
