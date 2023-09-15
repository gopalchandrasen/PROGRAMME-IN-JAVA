class Room
{
float x;
float y;
float area;
void roomdata(float l,float b)
{
x=l;
y=b;
}
void calculation()
{
area=x*y;
}
void display()
{
System.out.println("Length="+x);
System.out.println("Breadth="+y);
System.out.println("Area="+area);
}
}
class Room_Area
{
public static void main(String a[])
{
Room r=new Room();
r.roomdata(4,5);
r.calculation();
r.display();
}
}