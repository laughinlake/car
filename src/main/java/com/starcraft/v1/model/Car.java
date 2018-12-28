/**
 * 
 */
package com.starcraft.v1.model;

import com.starcraft.v1.operation.BaseMove;
import com.starcraft.v1.struture.*;

public class Car extends BaseMove {
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
	
	public void start() {
		System.out.println("my car start!");
	}
	
	public void stop() {
		System.out.println("my car stop!");
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

}
