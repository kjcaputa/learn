package kjcaputa.jdp.bevis.vehicle;

import kjcaputa.jdp.bevis.engine.Engine;

public class AbstractVan extends AbstractVehicle
{
    public AbstractVan(Engine engine)
    {
        super(engine);
    }

    public AbstractVan(Engine engine, Vehicle.Colour colour)
    {
        super(engine, colour);
    }
}
