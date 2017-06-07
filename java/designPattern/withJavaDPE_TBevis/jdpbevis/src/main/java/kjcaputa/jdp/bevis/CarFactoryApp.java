package kjcaputa.jdp.bevis;

public class CarFactoryApp
{
    public static void main(String[] args)
    {
        Engine engine1 = new StandardEngine(23);
        Engine engine2 = new TurboEngine(1100);

        System.out.println(engine1);
        System.out.println(engine2);
        System.out.println("Is the engine 1 equal to engine 2 ?= " + engine1.equals(engine2));
    }
}
