package enumeration.ref2;



import static enumeration.ref2.Grade.*;

public class DiscountService
{
    public int discount(Grade grade, int price)
    {

        /*if (grade == BASIC)
            discountPercent = 10;
         else if (grade == GOLD)
            discountPercent = 20;
        else if (grade == DIAMOND)
            discountPercent = 30;
        else
            System.out.println("할인X");*/

        // 10000 * (20 / 100) -> 2000원 할인
        return price * grade.getDiscountPercent() / 100;
    }

}
