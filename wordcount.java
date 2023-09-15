import java.util.Scanner;
// import java.util.Arrays;
public class wordcount {
    void char_count(){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        System.out.println("Enter the character to check");
        char ch=sc.nextLine().charAt(0);
        for(int i=0; i<c.length-1;i++){
            if(ch==(c[i])){
                count++;
            }
        }
        System.out.println("The word of "+ch+" in the string "+s+" is "+count+" times");
    }

    void word_count(){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        System.out.println("Enter a word to check: ");
        String str=sc.nextLine();
        String[] st=s.split(" ");
        for(int i=0;i<st.length;i++){
            if(st[i].equals(str)){
                count++;
            }
        }
        System.out.println("The word of "+str+" in the string "+s+" is "+count+" times");
    }
    public static void main(String[] args) {
        wordcount o=new wordcount();
        // o.char_count();
        o.word_count();
    }
}

