import java.util.*;

class AlphabeticalOrder{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string: ");
    String s=sc.nextLine();
    char[] ch=s.toCharArray();
    // Arrays.sort(ch);
    System.out.println(ch);
    // System.out.println("Sorted string is: "+new String(ch));
    // if (ch[0]>ch[1]){
    //     System.out.println(ch[0]+">"+ch[1]);
    // }          
    for(int i=0;i<ch.length;i++){
        for(int j=0;j<ch.length-1;j++){
            if(ch[j]>ch[j+1]){
                char t=ch[j];
                ch[j]=ch[j+1];
                ch[j+1]=t;
            }
        }
    }  
    System.out.println("Sorted string is: "+new String(ch));

    }
}
