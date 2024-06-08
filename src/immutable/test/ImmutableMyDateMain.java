package lang.immutable.test;

public class ImmutableMyDateMain
{
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);//a09ee92
        ImmutableMyDate date2 = date1;//a09ee92
       // System.out.println("date1 = " + Integer.toHexString(date1.hashCode()));
       // System.out.println("date2 = " + Integer.toHexString(date2.hashCode()));
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("2025 -> date1");
         date1 = date1.withYear(2025);//30f39991
      //  System.out.println("date1 = " + Integer.toHexString(date1.hashCode()));
       // System.out.println("date2 = " + Integer.toHexString(date2.hashCode()));
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
