import java.util.*;
class Bedroom{
    static int k;
    int b,w;
    void getdata(int x,int y)
    {
        b=x;
        w=y;
    }
    void show()
    {
        System.out.println("Breadth and Width is "+b+" "+w);
    }
    void emp(){
        // Scanner g=new Scanner(System.in);
        // System.out.println("Enter the value of k");
        // k=g.nextInt();
    }
    
}
public class Bedroom_Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b1=sc.nextInt();
        int w1=sc.nextInt();
        Bedroom o=new Bedroom();
        o.b=b1;
        o.w=w1;
        o.getdata(b1,w1);
        o.show();
        
        int area=o.b*o.w;
        
        System.out.println("Area is "+area);
        Bedroom ob=new Bedroom();
        b1=sc.nextInt();
        w1=sc.nextInt();
        ob.getdata(b1,w1);
        area= ob.b*ob.w;
        System.out.println("Area is "+area);
        ob.show();
        Bedroom p=new Bedroom();
        p.emp();
        Bedroom.k=sc.nextInt();
        System.out.println("Value of k is : "+Bedroom.k);

    }
    

}
