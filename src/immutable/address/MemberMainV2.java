package lang.immutable.address;

public class MemberMainV2
{
    public static void main(String[] args)
    {
            ImmuatableAdress adress = new ImmuatableAdress("서울");
        MemberV2 memberA = new MemberV2("회원a", adress);
        MemberV2 memberB  = new MemberV2("회원b", adress);

        //회원A,B의 처음 주소는 모두 서울
        System.out.println("memberA="+memberA);
        System.out.println("memberB="+memberB);

        //회원 b의 주소를 부산으로 변경해야함

        memberB.setAdress(new ImmuatableAdress("부산"));
        System.out.println("부산 -> memberB.adress");
        System.out.println("memberA="+memberA);
        System.out.println("memberB="+memberB);



    }
}
