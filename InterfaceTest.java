interface Area
{
float pi=3.14F;
float compute(float x,float y);
}
class Rectangle implements Area
{
public float compute(float x,float y)
{
return(x*y);
}
}
class Circle implements Area
{
public float compute(float x,float y)
{
return(pi*x*x);
}
}
class InterfaceTest
{
public static void main(String a[])
{
Rectangle rect=new Rectangle();
Circle cir=new Circle();
System.out.println("Area of rectangle="+rect.compute(10,20));
System.out.println("Area of circle="+cir.compute(30,0));
}
}