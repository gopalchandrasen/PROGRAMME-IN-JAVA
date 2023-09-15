import java.util.Scanner;

public class sort_string {
    public static void main(String[] args) {
        String str[]=new String[5];
        String temp;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string array: ");
        for(int i=0;i<5;i++){
            str[i]=sc.nextLine();
        }
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(str[j].compareTo(str[i])<0){
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;

                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(str[i]);
        }
    }
}
