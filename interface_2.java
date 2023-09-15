import java.util.*;
class student
{
   int roll;
   void getrollnumber()
   { 
    System.out.println("Enter roll no: ");
    Scanner sc = new Scanner(System.in);
    roll=sc.nextInt();
   }
}
class test extends student
{
    int ca1,ca2,ca3,ca4;
    void getmarks()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ca1 marks");
        ca1=sc.nextInt();
        System.out.println("enter ca2 marks");
        ca2=sc.nextInt();
        System.out.println("enter ca3 marks");
        ca3=sc.nextInt();
        System.out.println("enter ca4 marks");
        ca4=sc.nextInt();
    }
}
interface sports
{
   float sportswt=6.0F;
   void display();
}
class result extends test implements sports
{
   int total;
   
   public void display()
   {
     System.out.println(" the sportswt is:"+sportswt);
   }
   void rolldisplay()
   {
    System.out.println("the roll no is:"+roll);
   }
   void displaymark()
   {
    total=ca1+ca2+ca3+ca4;
    System.out.println("the total marks is:"+total);
   }
}
public class interface_2 {
    public static void main(String args[])
    {
        result ob =new result();
        ob.display();
        ob.getrollnumber();
        ob.getmarks();
        ob.rolldisplay();
        ob.displaymark();
    }
    
}