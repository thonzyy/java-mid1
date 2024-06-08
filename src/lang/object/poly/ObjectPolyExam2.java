package lang.object.poly;

public class ObjectPolyExam2
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); //오브젝트 인스턴스도 만들 수 있다.

        Object[] objects= {dog,car,object};
        // new Object[3];

        size(objects);

    }

    private static void size(Object[] objects)
    {
        System.out.println("전달된 객체의 수는: "+objects.length);
    }
}
