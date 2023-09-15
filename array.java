import java.util.*;
// public class array {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         int arr[][];
//         arr= new int [10][10];
//         int i,j;
//         System.out.println("Enter number: ");
//         for (i=0;i<3;i++)
//         {
//             for(j=0;j<3;j++)
//             {
//                 arr[i][j]= s.nextInt();
//             }
//         }
//         for (i=0;i<3;i++)
//         {
//             for(j=0;j<3;j++)
//             {
//                 System.out.println(arr[i][j]);
//             }
//         }
//         System.out.println(arr[0][1]);
//         }
// }

public class array{
    public static void main(String[] args) {
        int arr[]=new int[5];
        // arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. ");
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enterd the no are: ");
        for (int i=0;i<3;i++)
        {
            System.out.println(arr[i]);
        }
          

    }
}
// int arr[]={1,2,3,4,5,6};
// int len=arr.length;
// System.out.println("length of array is"+len);
//     }
// }
// for(int i=0;i<arr.length;i++){
//     System.out.println(arr[i]);
// }