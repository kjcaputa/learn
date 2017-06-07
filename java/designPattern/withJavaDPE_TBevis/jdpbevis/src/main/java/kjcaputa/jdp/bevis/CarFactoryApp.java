package kjcaputa.jdp.bevis;

public class CarFactoryApp
{
    public static void main(String[] args)
    {
        Engine engine1 = new AbstractEngine(23,true);
        Engine engine2 = new AbstractEngine(1100,false);

        System.out.println(engine1);
        System.out.println(engine2);
        System.out.println("Are the engine 1 equal to engine 2 = " + engine1.equals(engine2));
    }
}
