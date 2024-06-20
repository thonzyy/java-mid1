package nested.nested;

public class nestedOuterMain
{
    public static void main(String[] args)
    {
        NestedOuter nestedOuter = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested(); //안에 것만 따로 생성가능
         nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
