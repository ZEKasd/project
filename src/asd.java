import java.io.IOException;
import java.util.Scanner;

public class asd {
    public static void main(String[] args)
    {
        String s ="123"; String st="123.456";
int x;double y;
x=Integer.parseInt(s);
y=Double.parseDouble(st);
        System.out.println("x="+x);
        System.out.println("y="+y);
        s=String.valueOf(x+1);
        st=String.valueOf(y+1);
        System.out.println("strInt="+s);
        System.out.println("strDouble="+st);
        String str;
        str="num"+345;
        System.out.println(str+"Hi");
    }
    }