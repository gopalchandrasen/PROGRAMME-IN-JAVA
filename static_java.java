// import java.util.Scanner;
// class java{
//     int roll;
//     String name;
//     static int count;
//     java(){
//         System.out.println("Enter roll and name:");
//         Scanner sc=new Scanner(System.in);
//         // sc.nextLine();
//         name=sc.nextLine();
//         roll=sc.nextInt();
//         count++;
//     }
//     void display()
//     {
//         System.out.println(name+" roll is "+roll);
//     }
// }
// public class static_java {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         java a[]=new java[4];
//         for (int i=0;i<4;i++)
//         {
//             a[i] =new java();
//             a[i].display();
//         }
//         System.out.println("Count number is: "+java.count);
//     }
    
// }

class admission{
    int roll;
    String name;
    static int student=0;
    admission(int roll,String name){
        this.roll=roll;
        this.name=name;
        student++;
        }
        void disp(){
            System.out.println("Student name "+name+" roll "+roll);
        }     
}
class static_java{
    public static void main(String[] args) {
        admission s1=new admission(1,"Gopal");
        s1.disp();
        admission s2=new admission(2,"Supravat");
        s2.disp();
        System.out.println("Total number of student for admission: "+admission.student);
    }
}