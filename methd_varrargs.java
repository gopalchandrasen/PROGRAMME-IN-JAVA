public class methd_varrargs {
    methd_varrargs(String...person){
        for(String name:person){
            System.out.println("Hello: "+name);
        }
    }
    public static void main(String[] args) {
        methd_varrargs o=new methd_varrargs("gopal","rupan","puchku","golu") ;
    }
}
