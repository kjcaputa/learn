package kjcaputa.jdp.bevis;

public /* abstract */ class AbstractEngine implements Engine
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
        //        if (this == other)
        //        {
        //            return true;
        //        }
        //
        //        if (!(other instanceof Engine))
        //        {
        //            return false;
        //        }

        //Engine otherEngine = (Engine) other;
        //        return this.toString().equals(otherEngine.toString());
        return this == other && other instanceof Engine && this.toString().equals(((Engine) other).toString());
    }

    public int hashCode()
    {
        return this.toString().hashCode();
    }
}
