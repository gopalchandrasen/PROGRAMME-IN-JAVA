import java.util.Scanner;
interface Super{
    // int age;
    // String name;
    // void getdata();
    void getdata(String name,int age);
    void display();
}
class Sub implements Super{
    // Super.name=name;
    // Super.age=age;
    // int age=Super.age;
    // String name=Super.name;
    int age;
    String name;
    public void getdata(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("The name and age is: "+name+", "+age);
    }
}
public class Interface2 {
    public static void main(String[] args) {
        Sub i=new Sub();
        Scanner gcs=new Scanner(System.in);
        String name=gcs.nextLine();
        int age=gcs.nextInt();
        i.getdata(name,age);
        i.display();   
    }
}