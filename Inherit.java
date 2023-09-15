class Room
{
int length;
int breath;
Room(int length,int breath)
{
this.length=length;
this.breath=breath;
}
int area()
{
return(length*breath);
}
}
class BedRoom extends Room
{
int height;
BedRoom(int x,int y,int z)
{
super(x,y);
height=z;
}
int volume()
{
return(length*breath*height);
}
}
class Inherit
{
public static void main(String a[])
{
BedRoom obj=new BedRoom(10,20,30);
int area1=obj.area();
int volume1=obj.volume();
System.out.println("The area = "+area1);
System.out.println("The volume= "+volume1);
}} 
