package enumeration.ref1;


public class DiscountService
{
    public int discount(ClassGrade classGrade, int price)
    {

        // 10000 * (20 / 100) -> 2000원 할인
        return price * classGrade.getDiscountPercent() / 100;
    }

}
