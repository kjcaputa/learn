package kjcaputa.jdp.bevis.vehicle;

import kjcaputa.jdp.bevis.engine.Engine;

public abstract class AbstractVehicle implements Vehicle
{
    private final Engine engine;

    private Vehicle.Colour colour;

    public AbstractVehicle(Engine engine)
    {
        this(engine, Colour.UNPAINTED);
    }

    public AbstractVehicle(Engine engine, Colour colour)
    {
        this.engine = engine;
        this.colour = colour;
    }

    public Engine getEngine()
    {
        return this.engine;
    }

    public void paint(Colour colour)
    {
        this.colour = colour;
    }

    public Colour getColor()
    {
        return this.colour;
    }

    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() + "[engine=" + getEngine().toString() + ", colour=" + getColor() + "]";
    }

    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }

        if (!(other instanceof Vehicle))
        {
            return false;
        }

        Vehicle otherVehicle = (Vehicle) other;
        return this.toString().equals(otherVehicle.toString());
    }
}
