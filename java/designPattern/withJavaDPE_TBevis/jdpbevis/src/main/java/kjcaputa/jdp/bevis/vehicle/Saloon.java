package kjcaputa.jdp.bevis.vehicle;

import kjcaputa.jdp.bevis.engine.Engine;
import kjcaputa.jdp.bevis.vehicle.AbstractCar;

public class Saloon extends AbstractCar
{
    public Saloon(Engine engine)
    {
        super(engine);
    }

    public Saloon(Engine engine, Colour colour)
    {
        super(engine, colour);
    }
}
