package kjcaputa.jdp.bevis.vehicle;

import kjcaputa.jdp.bevis.engine.Engine;
import kjcaputa.jdp.bevis.vehicle.AbstractCar;

public class Sport extends AbstractCar
{
    public Sport(Engine engine)
    {
        super(engine);
    }

    public Sport(Engine engine, Colour colour)
    {
        super(engine, colour);
    }
}
