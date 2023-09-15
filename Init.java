class Base
{
    int x,y;
    Base(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    void disp()
    {
        System.out.println("X,Y:"+x+","+y);
    }
}
class Derived extends Base
{
    int z;
    Derived(int x,int y,int z)
    {
        super(x,y);
        this.z=z;
    }
    void show()
    {
        super.disp();
        System.out.println("Z: "+z);
    }
}
class Init
{
    public static void main(String[] args) {
        Derived o=new Derived(10,20,30);
        o.show();
    }
}