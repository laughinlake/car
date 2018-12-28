package com.starcraft.v1;

import com.starcraft.v1.model.Car;
import com.starcraft.v1.model.Engine;
import com.starcraft.v1.struture.Body;
import com.starcraft.v1.struture.Chassis;
import com.starcraft.v1.struture.Wheel;

public class Application {
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
        mycar.start();
        mycar.forward();
        mycar.faster();
        mycar.turn();
        mycar.slower();
        mycar.stop();
    }
}
