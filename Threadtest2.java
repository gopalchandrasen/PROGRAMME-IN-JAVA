class A implements Runnable
{
public void run()
 {
  for(int i=1;i<=5;i++)
 {
  System.out.println("\t From Thread A:i="+i);
 }
 System.out.println("Exit from A");
 }
 
}
class B implements Runnable
{
public void run()
 {
  for(int j=1;j<=5;j++)
 {
  System.out.println("\t From Thread B:j="+j);
 }
 System.out.println("Exit from B");
 }
}
class C implements Runnable
{
public void run()
 {
  for(int k=1;k<=5;k++)
 {
  System.out.println("\t From Thread C:k="+k);
 }
 System.out.println("Exit from C");
 } 
}
class Threadtest2
{
public static void main(String a[])
{
A obj1=new A();
Thread t1= new Thread(obj1);
B obj2=new B();
Thread t2= new Thread(obj2);
C obj3=new C();
Thread t3= new Thread(obj3);
t1.start();
t2.start();
t3.start();

}
}