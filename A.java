import java.util.Scanner;
class A
{public static void main(String a[])
{
String g;
String m="M";
Scanner s=new Scanner(System.in);
System.out.println("Enter a string: ");
g=s.next();
System.out.println("String is "+g);
if(g==m)
System.out.println("Male");
else
System.out.println("Female");
}
}
