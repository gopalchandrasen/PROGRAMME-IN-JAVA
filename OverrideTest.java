class Super
{
int x;
Super (int x)
{
this.x=x;
}
void display()
{
System.out.println("It is base class ");
System.out.println("Super= "+x);
}
}
class Sub extends Super
{
int y;
Sub(int x,int y)
{
super(x);
this.y=y;
}
void display()
{
System.out.println("It is derived class ");
System.out.println("Sub= "+y);
System.out.println("It is base class ");
System.out.println("Super= "+x);
}
}
class OverrideTest
{
public static void main(String a[])
{
Sub s1=new Sub(100,200);
s1.display();
}
}
