package kjcaputa.jdp.bevis.vehicle;

import kjcaputa.jdp.bevis.engine.Engine;

public abstract class AbstractCar extends AbstractVehicle
{
    public AbstractCar(Engine engine)
    {
        super(engine);
    }

    public AbstractCar(Engine engine, Vehicle.Colour colour)
    {
        super(engine, colour);
    }
}
