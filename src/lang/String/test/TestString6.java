package lang.string.test;

public class TestString6
{
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        // 코드 작성
        String[] strArr=str.split(" ");
        int count=0;
        for (String s : strArr)
        {
           if(s.indexOf(key)!=-1)
            count++;
        }


        System.out.println("count="+count);
    }
}
