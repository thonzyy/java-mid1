package lang.immutable.address;

public class MemberV2
{
    private  String name;
    private ImmuatableAdress adress;

    public MemberV2(String name, ImmuatableAdress adress)
    {
        this.name = name;
        this.adress = adress;
    }

    public void setAdress(ImmuatableAdress adress)
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

    public ImmuatableAdress getAdress()
    {
        return adress;
    }
}
