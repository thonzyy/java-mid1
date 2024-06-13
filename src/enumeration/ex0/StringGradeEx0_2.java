package enumeration.ex0;

import java.net.SocketTimeoutException;

public class StringGradeEx0_2
{
    public static void main(String[] args)
    {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        //Sitring 은 어떤 문자열이나 받을 수 있기 때문에 안정성 부족문제 발생.
        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("vip 등급의 할인 금액: " + vip);

        //오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: "+vip);

        //소문자 입력
        int gold = discountService.discount("gold", price);
    }
}
