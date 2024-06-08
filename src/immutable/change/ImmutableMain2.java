package lang.immutable.change;

public class ImmutableMain2
{
    public static void main(String[] args)
    {
        ImmutableObj obj1= new ImmutableObj(10);
        obj1.add(20);//생성한 객체를 사용하지 않고 인스턴스를 버리는 상황이다.
        //불변 객체를 다룰 때는 객체를 변수로 받아서 사용해줘야된다.
        System.out.println("obj1 = " + obj1.getValue());
    }
}
