// class de
// {
//     void hi()
//     {
//         System.out.println("Hlw");
//     }
// }
// class se 
// {
//     se(de d)
//     {
//         System.out.println("How are you?");
//     }
// }
// // class ee 
// // {
// //     void iu()
// //     {
// //         System.out.println("Good");
// //     }
// // }
// public class ex_inhet {
//     public static void main(String[] args) {
//         // ee f=new ee();
    
//         de p=new de();
//         se o=new se(p);
//         // p.se();
//         // p.hi();
//     }
    
    
// }


class runnable
{
    void ok()
    {System.out.println("HIUJDV");}
}
// class thread implements runnable
class thread
{
    public thread(runnable r)
    { 
        System.out.println("How are you?");
        r.ok();
    }
    public thread ()
    { }
    public void ok()
    {
        System.out.println("Hi India how are you?");
    }
    
}
// class rtu extends thread
// {
    
// }
class tr extends runnable
{
    public void ok() 
    {

    }
}
public class ex_inhet {
    public static void main(String[] args) {
        // re o=new re();
        // o.ok();
        // tu t=new tu();
        // t.ok();
        tr m=new tr();
        thread y=new thread(m);
        y.ok(); 
        // r.ok();
        
    }
    
}

