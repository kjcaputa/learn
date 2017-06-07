package kjcaputa.jdp.bevis.engine;

public abstract class AbstractEngine implements Engine
{
    private final int size;

    private final boolean turbo;

    public AbstractEngine(final int size, final boolean turbo)
    {
        this.size = size;
        this.turbo = turbo;
    }

    public int getSize()
    {
        return this.size;
    }

    public boolean isTurbo()
    {
        return this.turbo;
    }

    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() + "[size=" + getSize() + ", turbo=" + isTurbo() + "]";
    }

    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }

        if (!(other instanceof Engine))
        {
            return false;
        }

        Engine otherEngine = (Engine) other;
        return this.toString().equals(otherEngine.toString());
    }

    public int hashCode()
    {
        return this.toString().hashCode();
    }
}
