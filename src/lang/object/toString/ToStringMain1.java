package lang.object.toString;

public class ToStringMain1
{
    public static void main(String[] args)
    {
        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        //클래스 정보와 참조값 반환
        System.out.println(string);
        //Object 직접 출력
        System.out.println(object.toString());
        System.out.println(object);
    }
}
