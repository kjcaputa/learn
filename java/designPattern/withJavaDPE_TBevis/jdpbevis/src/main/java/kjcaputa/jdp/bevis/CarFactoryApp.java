package kjcaputa.jdp.bevis;

import kjcaputa.jdp.bevis.engine.Engine;
import kjcaputa.jdp.bevis.engine.StandardEngine;
import kjcaputa.jdp.bevis.engine.TurboEngine;
import kjcaputa.jdp.bevis.vehicle.BoxVan;
import kjcaputa.jdp.bevis.vehicle.Sport;
import kjcaputa.jdp.bevis.vehicle.Vehicle;

public class CarFactoryApp
{
    public static void main(String[] args)
    {
        Engine engine1 = new StandardEngine(23);
        Engine engine0 = new StandardEngine(23);
        Engine engine2 = new TurboEngine(1100);
        Vehicle vehicle1 = new Sport(engine2);
        Vehicle vehicle2 = new BoxVan(engine2, Vehicle.Colour.BLUE);

        System.out.println(engine1);
        System.out.println(engine2);
        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println("Is the engine 1 equal to engine 2 ?= " + engine1.equals(engine2));
        System.out.println("Is the engine 1 equal to engine 2 ?= " + engine1.equals(engine0));
        System.out.println("Is the vehicle 1 equal to vehicle 2 ?= " + vehicle1.equals(vehicle2));
    }
}
