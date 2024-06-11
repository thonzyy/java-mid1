package lang.string.test;

public class TestString10
{
    public static void main(String[] args)
    {
        String fruits = "apple,banana,mango";
        String[] strings = fruits.split(",");
        for (String string : strings)
        {
            System.out.println(string);
        }

        String joined = String.join("->", strings);
        System.out.println("Joined: " + joined);

    }
}
