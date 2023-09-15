class base
{
void Super(int a)
{
System.out.println(+a);
}
}
class derived extends base
{
void Sub(int a,int b)
{
System.out.println(+b);
}
}
class inheritance
{
public static void main(String a[])
{
derived d1= new derived();
d1.Sub(10,20);
}
}