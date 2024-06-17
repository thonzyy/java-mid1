package enumeration.ref2;

public enum Grade
{
    BASIC(10), GOLD(20) ,DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) //private이 생략됨.
    {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent()
    {
        return discountPercent;
    }

}
