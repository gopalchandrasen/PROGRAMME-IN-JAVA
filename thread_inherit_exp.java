interface runnable
{
    void ok();
}
class thread implements runnable
// class thread
{
    public thread(runnable r)
    { 
        System.out.println("How are you?");
    }
    public thread ()
    { }
    public void ok()
    {
        System.out.println("Hi India how are you?");
    }
    
}
class rtu extends thread
{
    
}
class tr implements runnable
{
    public void ok() 
    {
        System.out.println("\n");
    }
}
public class thread_inherit_exp {
    public static void main(String[] args) {
        // re o=new re();
        // o.ok();
        // tu t=new tu();
        // t.ok();
        tr m=new tr();
        // m.ok();
        thread y=new thread(m);
        y.ok();      
    }
    
}

