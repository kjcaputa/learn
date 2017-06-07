package kjcaputa.jdp.bevis.vehicle;

import kjcaputa.jdp.bevis.engine.Engine;
import kjcaputa.jdp.bevis.vehicle.AbstractCar;

public class Coupe extends AbstractCar
{
    public Coupe(Engine engine)
    {
        super(engine);
    }

    public Coupe(Engine engine, Colour colour)
    {
        super(engine, colour);
    }
}
