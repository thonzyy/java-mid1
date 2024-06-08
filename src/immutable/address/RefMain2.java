package lang.immutable.address;

public class RefMain2
{

    public static void main(String[] args)
    {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmuatableAdress a = new ImmuatableAdress("서울");
        ImmuatableAdress b = a;//참조값 대입을 막을 수 있는 방법은 없다
        System.out.println("a="+a);
        System.out.println("b="+b);

        //b.setValue("부산");
        b= new ImmuatableAdress("부산");
        System.out.println("부산 -> b");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
