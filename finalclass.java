final class abc{
    void hj(){
        System.out.println("GSG");
    }
       
}
class xyz extends abc{
    void hk(){
        System.out.println("GSS");
    }
}
public class finalclass {
    public static void main(String[] args) {
        xyz u=new xyz();
        u.hj();
        u.hk();
    }    
}
