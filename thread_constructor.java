class Thread1 extends Thread
{
    public Thread1(String name)
    {
        super(name);
    }
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Value of Thread1 is: "+i );
        }
        System.out.println("Exit from thread1");
    }
}
class Thread2 extends Thread
{
    Thread2 (String name)
    {
        super(name);
    }
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Value of Thread2 is: "+i );
        }
        System.out.println("Exit from thread2");   
    }
}

public class thread_constructor {
    public static void main(String[] args) {
        Thread1 o=new Thread1("Gopal");
        o.start();
        Thread2 t=new Thread2("Computer");
        t.start();
        System.out.println("Name of Thread1 is: "+o.getName());
        System.out.println("Id of Thread1 is: "+o.getId());
        System.out.println("Name of Thread2 is: "+t.getName());
        System.out.println("Id of Thread2 is: "+t.getId());
    }
    
}
