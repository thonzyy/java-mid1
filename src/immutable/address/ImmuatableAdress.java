package lang.immutable.address;

public class ImmuatableAdress
{

    private  final String value;




    public ImmuatableAdress(String value)
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
