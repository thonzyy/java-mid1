package lang.string.test;

public class TestString5
{
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        // 코드 작성
        int extIndex = str.indexOf(ext);
        System.out.println("filename = "+str.substring(0,extIndex));
        System.out.println("ext = "+str.substring(extIndex));
    }
}
