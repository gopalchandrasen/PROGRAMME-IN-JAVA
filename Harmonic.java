import java.util.Scanner;
// class Harmonic
// {
//     public static void main(String[] args) {
//         float i,n,sum=0;
//         Scanner sc=new Scanner(System.in);
//         n=sc.nextInt();
//         System.out.println("Sum of series is: ");
//         for(i=1;i<=n;i++)
//         {
//             sum=sum+(1/i);
//             System.out.print("(1/"+i+")");
//             if (i!=n)
//             {
//                 System.out.print("+");
//             }
//         }
//         System.out.println("\n="+sum);
//     }
    
// }
class harmonic_
{
    static double n;
    // float i;
    double opearation(double i){
        double sum=1/i;
        return sum;
    }
    void display(int j)
    {
        System.out.print("(1/"+j+")");
        if (j!=n){
            System.out.print("+");
        }
        if(j==n){
            System.out.print("=");
        }
                
    }
}

class Harmonic{
    public static void main(String[] args) {
        harmonic_ o=new harmonic_();
        Scanner sc=new Scanner(System.in);
        double sum=0;
        harmonic_.n=sc.nextFloat();
        for(double i=1;i<=harmonic_.n;i++)
        {
            sum=sum+o.opearation(i);
        }
        for(int i=1;i<=harmonic_.n;i++)
        {
            o.display(i);

        }
        System.out.println("\nResult of the sumation "+sum); 
    }
}