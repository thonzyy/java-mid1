package lang.object.poly;

public class ObjectPolyExample2
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        Car car = new Car();
        Object o = dog;
        action(dog);
        action(car);
    }

    private static void action(Object obj)
    {
            //obj.sound(); // 컴파일 오류 오브젝트는 사운드 메소드가 없음
            //obj.move(); // 컴파일 오류 오브젝트는 무브 메소드가 없음

        //객체에 맞는 다운 캐스팅 필요
        if (obj instanceof Dog dog)
        {
            dog.sound();
        } else if ( obj instanceof Car car)
        {
            car.move();
        }
    }
}
