import java.util.*;
class Number
{
    int x,y;
    
    // Default Constructor
    Number(){}
    
    // Parameterised Constructor to get value from user
    Number(int t)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of x: ");
        x=sc.nextInt();
        System.out.print("Enter value of y: ");
        y=sc.nextInt();
    }
    
    // Parameterised Constructor to copy values of another object
    Number(Number a)
    {
        x=a.x;
        y=a.y;
    }
    void display()
    {
        System.out.println(x+"  "+y);
    }
}
public class JavaApp1
{
    public static void main(String[] args) 
    {        
        // Parameterised constructor called to get value from user
        Number n=new Number(1); 
        System.out.print("Values for 1st Object: ");
        n.display();
        
        // Default constructor called
        Number n1=new Number();
        // Directly copying values of one object to the other object
        n1=n;
        System.out.print("Values for 2nd Object: ");
        n1.display();
        
        // Default constructor called
        Number n2=new Number();
        // Copying individual data of one object into another object
        n2.x=n1.x;
        n2.y=n1.y;
        System.out.print("Values for 3rd Object: ");
        n2.display();
        
        /* Parameterised constructor called to copy values of one object 
        into another object */
        Number n3=new Number(n);
        System.out.print("Values for 4th Object: ");
        n3.display();
    }  
}
