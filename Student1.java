import java.util.*;
class Student1 {
    String name;
    int roll;
    float ca1,ca2,ca3,ca4,pca1,pca2;
    Student1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ca1 marks:");
        ca1=sc.nextFloat();
        System.out.println("Enter ca2 marks:");
        ca2=sc.nextFloat();
        System.out.println("Enter ca3 marks:");
        ca3=sc.nextFloat();
        System.out.println("Enter ca4 marks:");
        ca4=sc.nextFloat();
        System.out.println("Enter pca1 marks:");
        pca1=sc.nextFloat();
        System.out.println("Enter pca2 marks:");
        pca2=sc.nextFloat();

    }

    double total_ca()
    {
        double ca=(ca1+ca2+ca3+ca4);
        System.out.println("Total of ca marks are: "+ca);
        return ca;
    }
    double total_pca()
    {
        double pca=(pca2+pca1);
        System.out.println("Total of pca marks are: "+pca);
        return pca;
    }

    void total_marks_perc()
    {
        double total= total_ca() + total_pca();
        System.out.println("The total marks is: "+total);
        display();
        System.out.println("Total percentage: "+(total/180)*100);
    }
    void display()
    {
        System.out.println("CA1: "+ca1+"\nCA2: "+ca2+"\nCA3: "+ca3+"\nCA4: "+ca4+"\nPCA1: "+pca1+"\nPCA2: "+pca2);
        
    }
    public static void main(String[] args) {
        Student1 s[]=new Student1[5];
        for(int i=0;i<5;i++)
        {
            s[i]=new Student1();
            s[i].total_marks_perc();
        }
        
    
    }
}
