import java.util.Scanner;

public class exp {
    Scanner sc=new Scanner(System.in);
    
    
    void k(int a[])
    {
        for (int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
    int fun(){
        return 2;
    }
    public static void main(String[] args) {
        // int arr[];
        // arr=new int[10];
        int arr[]={1,2,3,4,5};
        exp jh=new exp();
        jh.k(arr);
        System.out.println(jh.fun());
        int a=10;
        int b=3;
        System.out.println(a>b);
        
    }
}
