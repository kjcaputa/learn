package kjcaputa.jdp.bevis.vehicle;

import kjcaputa.jdp.bevis.engine.Engine;

public interface Vehicle
{
    enum Colour
    {
        UNPAINTED,
        BLUE,
        BLACK,
        GREEN,
        RED,
        SILVER,
        WHITE,
        YELLOW
    }

    Engine getEngine();

    void paint(Vehicle.Colour colour);

    Vehicle.Colour getColor();
}
