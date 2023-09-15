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
class Interface
{
public static void main(String a[])
{
Rectangle rect=new Rectangle();
Circle cir=new Circle();
Area area;
area=rect;
System.out.println("Area of rectangle="+rect.compute(10,20));
area=cir;
System.out.println("Area of circle="+cir.compute(30,0));
}
}