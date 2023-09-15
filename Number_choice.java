import java.util.*;
// import java.lang.Math;
import java.util.Random;
public class Number_choice {
    int n,num;
    static int flag=0;
    int random()
    {
        Random number=new Random();
        n=number.nextInt((100-1)+1)+1;
        System.out.println("Computer generated number is: "+n);
        return n;
    }
    int guess_num()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Guess the number which coumputer generate: ");
        num=sc.nextInt();
        return num;
    }
    void range()
    {
        if(num>n)
        {
            if((num-n)>=1 && (num-n)<10)
            {
                System.out.println("Your are too near and set the number by decrementing of 10 range");
            }
            else if((num-n)>=10 && (num-n)<=20) 
            {
                System.out.println("Decrement the number more than 10");
            }
            else if((num-n)>20 && (num-n)<=30)
            {
                System.out.println("Decrement the number more than 20 ");
            }
            else if((num-n)>30 && (num-n)<=50)
            {
                System.out.println("Decrement the number more than 30");
            }
            else
            {
                System.out.println("Your number is too high, decrement more than 50");
            }
        }
        else if(num<n)
        {
            if((n-num)>=1 && (n-num)<10)
            {
                System.out.println("Your are too near and set the number by incrementing of 10 range");
            }
            else if((n-num)>10 && (n-num)<20)
            {
                System.out.println("Increment the number more than 10");
            }
            else if((n-num)>20 && (n-num)<=30)
            {
                System.out.println("Increment the number more than 20 ");
            }
            else if((n-num)>30 && (n-num)<=50)
            {
                System.out.println("Increment the number more than 30");
            }
            else
            {
                System.out.println("Your number is too low, increment more than 50");
            }
        }
        else
        {
            System.out.println("WOW! you guess the correct number.");
            flag=1;
        }    
    }

    public static void main(String[] args) {
        int c=0;
        Scanner sc =new Scanner(System.in);
        while(true)
        {
            Number_choice n=new Number_choice();
            int chance;
            n.random();
            System.out.println("You have 10 chance to guess the number");
            for(chance=10;chance>0;chance--)
            {
                n.guess_num();
                n.range();
                if(flag==1)

                break;
            }    
            if(flag==0)
            {
                System.out.println("Sorry better luck next time");
            }        
            System.out.println("Your point is: "+(chance*10));
            System.out.println("Are you want to continue the game \nPress 1 for yes otherwise 0");
            c=sc.nextInt();
            if(c==1)
            {
                continue;
            }
            else{
                break;
            }
        }
           
    }
}
