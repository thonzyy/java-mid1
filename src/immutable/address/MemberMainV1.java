package lang.immutable.address;

public class MemberMainV1
{
    public static void main(String[] args)
    {
            Adress adress = new Adress("서울");
        MemberV1 memberA = new MemberV1("회원a", adress);
        MemberV1 memberB  = new MemberV1("회원b", adress);

        //회원A,B의 처음 주소는 모두 서울
        System.out.println("memberA="+memberA);
        System.out.println("memberB="+memberB);

        //회원 b의 주소를 부산으로 변경해야함
        memberB.getAdress().setValue("부산");
        System.out.println("부산 -> memberB.adress");
        System.out.println("memberA="+memberA);
        System.out.println("memberB="+memberB);


    }
}
