import java.util.*;

class Vector_ex {
    Vector<Integer> arr=new Vector<Integer>();
    Scanner sc=new Scanner(System.in);
    void add_element(){
        System.out.println("Enter the elements: ");
        for(int i=0;i<5;i++)
        {
            int n=sc.nextInt();
            arr.addElement(n);
        }
    }

    void remove_element(){
        System.out.println("Enter elment for remove");
        Integer n=sc.nextInt();
        arr.remove(n);        
    }
    void insert_pos(){
        System.out.println("Enter the element: ");
        int n=sc.nextInt();
        System.out.println("Enter the position: "); 
        int p=sc.nextInt();   
        arr.insertElementAt(n,p);
    }
    void add_element_end(){
        System.out.println("Enter the element: ");
        int n=sc.nextInt();
        arr.addElement(n);
    }

    void display(){
        System.out.println(arr);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector_ex o=new Vector_ex();
        // o.add_element();
        // o.display();
        // o.remove_element();
        // o.add_element_end();
        
        while(true){
            System.out.println("1 for initialization\n2 for remove element\n3 for add element at end\n4 for insert element at given position\n5 for display\n6 for exit");
            int n=sc.nextInt();
            if (n==1){o.add_element();}
            else if(n==2){o.remove_element();}
            else if(n==3){o.add_element_end();}
            else if(n==4){o.insert_pos();}
            else if(n==5){o.display();}
            else if(n==6){break;}
            else{System.out.println("Entered wrong choice");}
        }

    
    }
}