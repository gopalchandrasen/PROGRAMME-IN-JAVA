class Super
{
int a,b;
void Super_no(int x,int y)
{
a=x;                                                                    
b=y;
}
void Super_display()
{
System.out.println("1st no. is: "+a);
System.out.println("2nd no. is: "+b);
}
}
class Sub extends Super
{
int c;
void Sub_no(int x,int y,int z)
{
a=x;
b=y;
c=z;                                                                             
}                                                                                              
void Sub_display()                                                                             
{                                                                                                
System.out.println("1st no. is: "+a);                                                        
System.out.println("2nd no. is: "+b);
System.out.println("3rd no. is: "+c);
}
}
class Inheritance
{
public static void main(String arg[])
{
Sub s1=new Sub();
s1.Sub_no(10,20,30);
s1.Super_display();
s1.Sub_display();
}
}