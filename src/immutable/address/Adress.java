package lang.immutable.address;

public class Adress
{

    private  String value;


    public void setValue(String value)
    {
        this.value = value;
    }

    public Adress(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "Adress{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue()
    {
        return value;
    }
}
