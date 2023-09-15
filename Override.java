class Super
{
int x;
Super(int a)
{
x=a;
}
abstract void display()
{
System.out.println("x= "+x);
}
}
class Sub extends Super
{
int y;
Sub(int a,int b)
{
super(a);
y=b;
}
void display()
{
System.out.println("x= "+x);
System.out.println("y= "+y);
}
}
class Override
{
public static void main(String []a)
{
Sub s2= new Sub(10,20);
s2.display();
s2.abstract display();
}
}