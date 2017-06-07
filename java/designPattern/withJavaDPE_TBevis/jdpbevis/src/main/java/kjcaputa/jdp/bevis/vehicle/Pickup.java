package kjcaputa.jdp.bevis.vehicle;

import kjcaputa.jdp.bevis.engine.Engine;

public class Pickup extends AbstractVan
{
    public Pickup(Engine engine)
    {
        super(engine);
    }

    public Pickup(Engine engine, Colour colour)
    {
        super(engine, colour);
    }
}
