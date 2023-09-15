import java.util.*;
class Bank_acc {
    Scanner sc=new Scanner(System.in);
    float amount;
    String depositor, acc_no, acc_type;

    void balance(float amount) {
        this.amount = amount;
    }
    void detail(){
        // Scanner sc=new Scanner(System.in);

        System.out.println("Enter amount in the account: ");
        amount=sc.nextFloat();

        System.out.println("Enter depositor name of the account: ");
        sc.nextLine();
        depositor=sc.nextLine();

        System.out.println("Enter account no of the account: ");
        acc_no=sc.nextLine();
        System.out.println(acc_no);

        System.out.println("Enter account type of the account: ");        
        while(true){
            String acc_type_=sc.nextLine();            
            if ((acc_type_.compareTo("Current")==0) || (acc_type_.compareTo("current"))==0){
                acc_type=acc_type_;
                break;
            }
            else if((acc_type_.compareTo("Saving")==0) || (acc_type_.compareTo("saving"))==0){
                acc_type=acc_type_;
                break;
            }
            else{
                System.out.println(acc_type_);
                System.out.println("You should enter write account type");
            }
        }    
    }
    void deposit_amount(){
        System.out.println("Enter amount to deposit");
        float cash=sc.nextFloat();
        this.amount=cash+this.amount;       
    }
    float withdraw(){
        System.out.println("Amount in your account is: "+amount);
        System.out.println("Press y for withdraw or n for discard");
        String c;
        // Scanner sc=new Scanner(System.in);
        sc.nextLine();
        c=sc.nextLine();
        
        if (c.compareTo("n")==0){
            return 0;
        }
        else{
            System.out.println("Enter amount to withdraw: ");
            float cash=sc.nextFloat();
            if(c.compareTo("y")==0 && (this.amount-cash)>=0){
                return(this.amount=this.amount-cash);
            }
            if(c.compareTo("y")==0 && (amount-cash)<=0){
                System.out.println("In your account have no sufficient balance");
                // return 0;
            }
        }
        return 0;
    }
    void name_balance(){
        System.out.println("Name of the depositor is: "+depositor +"and balance is: "+amount);
    }
}

class Bank{
    public static void main(String[] args) {
        Bank_acc o=new Bank_acc();
        o.detail();
        System.out.println(o.amount);
        o.deposit_amount();
        System.out.println(o.amount);
        o.withdraw();
        System.out.println(o.amount);
    }

}

















// class Bank{
//     public static void main(String[] args) {
//         String n1;
//         String n2;
//         String n3;
//         String n4;
//         Scanner sc=new Scanner(System.in);
//         n1=sc.nextLine();
//         // n2=sc.nextLine();
//         // n3=sc.nextLine();
//         // n4=sc.nextLine();
//         // System.out.println(n1.compareTo(n2));
//         if((n1.compareTo("current")==0) || (n1.compareTo("Current"))==0 ){
//             System.out.println("Ok");
//         }
//     }
// }