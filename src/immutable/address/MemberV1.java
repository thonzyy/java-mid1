package lang.immutable.address;

public class MemberV1
{
    private  String name;
    private  Adress adress;

    public MemberV1(String name, Adress adress)
    {
        this.name = name;
        this.adress = adress;
    }

    public void setAdress(Adress adress)
    {
        this.adress = adress;
    }

    @Override
    public String toString()
    {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }

    public Adress getAdress()
    {
        return adress;
    }
}
