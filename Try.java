class NotNestedtry
{
public static void main(String args[])
{
try
{
int a=2,b=4,c=2,x=7,z;
z=(x/((b*b)-4*a*c));
System.out.println("The value of z is= "+z);
}
catch(ArithmeticException e)
{
System.out.println("Division by zero");
}
try
{
int p[]={2};
p[3]=33;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Wrong array decleration");
}
}
}