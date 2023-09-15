class Room
{
int length;
int breath;
Room (int x,int y)
{
length=x;
breath=y;
}
int area()
{return(length*breath);
}
final void abv(){ //This is a final method so we cannot overwride it in BedRoom class.
    System.out.println("Hi");
}
}
class BedRoom extends Room
{
int height;
BedRoom(int x,int y,int z)
{super(x,y);
height=z;
}
int volume()
{return(length*breath*height);
}

}
class InheritTest
{public static void main(String a[])
{
BedRoom room1=new BedRoom(14,12,10);
int area1=room1.area();
int volume1=room1.volume();
System.out.println("Area= "+area1);
System.out.println("Volume= "+volume1);
room1.abv();
}
}