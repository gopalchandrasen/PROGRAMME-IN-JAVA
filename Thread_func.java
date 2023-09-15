class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            if(i==1)
            {
                yield();
            }
            System.out.println("A: "+i);
        }
        System.out.println("Exit from threads A");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("B: "+i);
            if(i==4)
            {
                stop();
            }

        }
        System.out.println("Exit from threads B");
    }
}
class C extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("C: "+i);
            if(i==1)
            try
            {
                sleep(100);
            }
            catch(Exception e)
            {
                System.out.println("Caught exception as "+e);
            }
        }
        System.out.println("Exit from C");
    }
}
public class Thread_func {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
        
    }
    
}
