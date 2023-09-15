import java.lang.ProcessBuilder.Redirect.Type;

// class Marks
// {
//     int a,b;
//     Marks(int x,int y)
//     {
//         a=x;
//         b=y;
//     }
//     void operation()
//     {
//         System.out.println("The opration is +:"+(a+b));
                
//     }
// }
// public class Data {
//     public static void main(String[] args) {
//         Marks o=new Marks(10,12);
//         o.operation();
//         int mul=o.a*o.b;
//         System.out.println("Mul= "+mul);
//         Marks n=new Marks(12, 20);
//         n.operation();
//         mul=n.a*n.b;
//         System.out.println("Mul= "+mul);
//     }
    
// }

class type_test{
    public static void main(String[] args) {
        //can skip first 3 lines
        Object a=10;
        Class cls = a.getClass();
        System.out.println("obj is an instance of " + cls.getName());
        
        Integer b=10;
        System.out.println(b instanceof Integer);
        if(b instanceof Integer){
            System.out.println("1ssreyf");
        }
        
        int c=10;
        
        //test the type
        Object d=(((Object)c).getClass().getSimpleName());
        System.out.println(d);
        //check if the varriable is in Integer class. We cannot check the type like int, float, char etc.
        int u=10;
        
        if((Object)u instanceof Integer){
            System.out.println("Ok");
        }
        System.out.println((Object)u);
        
    }
}
    
