// class A{
//     A(){
//         // this(5);
//         // this(6);
//         this(54,56);
//         // this(5);
//         System.out.println("Hello A");
//     }
//     A(int x){
//         System.out.println("x: "+x);
//     }
//     A(int x,int y){
//         System.out.println("x: "+x+", y: "+y);
//     }
// }

class A{
    int w,x,y,z;
    A(int w,int x,int y){
        this.w=w;
        this.x=x;
        this.y=y;
        System.out.println("w: "+w+" x: "+x+" y: "+y);
    }
    A(int w,int x,int y,int z){
        this(w,x,y);
        // this.w=w;
        // this.x=x;
        // this.y=y;
        this.z=z;
        System.out.println("w: "+w+" x: "+x+" y: "+y+" z: "+z);
        // System.out.println("w: "+w+" x: "+x+" y: "+y);
    }
    void ad(){
        System.out.println("ad");
    }
}

public class This_exp {
    public static void main(String[] args) {
        // A a=new A(1,2,3,4);
        new A(1,2,3,4).ad();

    }    
}
