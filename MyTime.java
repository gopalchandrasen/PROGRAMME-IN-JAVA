import java.util.*;
import java.lang.Math;
public class MyTime {
    int hh,mm,ss;
    MyTime()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hours in hh format: ");
        hh=sc.nextInt();
        System.out.println("Enter minute in mm format: ");
        mm=sc.nextInt();
        System.out.println("Enter second in ss format: ");
        ss=sc.nextInt();
    }
    static void operation(MyTime m1, MyTime m2)
    {
        int M1=m1.hh*3600+m1.mm*60+m1.ss;
        int M2=m2.hh*3600+m2.mm*60+m2.ss;
        int M=Math.abs(M1-M2);
        int HH=M/3600;
        int MM=(M%3600)/60;
        int SS=(M%3600)%60;
        System.out.println(Math.abs(HH)+":"+Math.abs(MM)+":"+Math.abs(SS));
    }
    public static void main(String[] args) {
        MyTime o1=new MyTime();
        MyTime o2=new MyTime();
        MyTime.operation(o1,o2);
    }
}
