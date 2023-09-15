import java.util.Scanner;
class Input {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float b;
        
        // System.out.println("Enter a element: ");
        // int a=s.nextInt();
        // System.out.println("Entered element is: "+a);   
        
        System.out.println("Enter a float element: ");
        b=s.nextFloat();
        System.out.println("Entered float element is: "+b);

        System.out.println("Enter a string: ");
        s.nextLine();
        String c=s.nextLine();
        System.out.println("Entered string is: "+c);

        System.out.println("Enter a float element: ");
        float p=s.nextFloat();
        System.out.println("Entered float element is: "+p);

        
        System.out.println("Enter a string: ");
        String f=s.nextLine();
        System.out.println("Entered string is: "+f);
        // boolean b1=s.hasNextInt();
        // System.out.println(b1);
        s.close();

     }
}
