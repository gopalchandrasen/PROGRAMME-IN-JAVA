class conlinetest
{
public static void main(String []args)
{
int count,i=0;
String string;
count=args.length;
System.out.println("No. of args = "+count);
while(i<count)
{
string=args[i];
i++;
System.out.println(i+":"+string);
}
}
}