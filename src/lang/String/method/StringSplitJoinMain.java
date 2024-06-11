package lang.string.method;

public class StringSplitJoinMain
{
    public static void main(String[] args)
    {
        String str="Apple,Banana,Orange";
        String[] split = str.split(",");
        for (String s : split)
        {
            System.out.println(s);
        }
        String joinStr="";
     /*   for (String s : split)
        {
            joinStr=joinStr+s+"-";
        }*/

        for (int i = 0 ; i < split.length ; i++)
        {
            String string = split[i];
            joinStr+=string;
            if(i!=split.length-1)
            {
            joinStr+="-";
            }
        }

        System.out.println("joinStr="+joinStr);

        //조인

        String joinedStr = String.join("-", "A", "B", "C", "D");
        System.out.println("joinedStr="+joinedStr);

        String joined = String.join("-", split);
        System.out.println(joined);

    }
}
