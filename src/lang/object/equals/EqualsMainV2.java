package lang.object.equals;

public class EqualsMainV2
{
    public static void main(String[] args)
    {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");
        //동일성 확인 인스턴스가 다름.
        System.out.println("identity = "+(user1==user2));
        //동등성 오버라이딩
        System.out.println("equality = "+(user1.equals(user2)));

    }
}
