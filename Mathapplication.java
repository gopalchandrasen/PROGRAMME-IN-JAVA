class Mathoperation{
    static float mul(float x,float y)
    {
        return x*y;
    }
    static float devide(float x,float y)
    {
        return x/y;
    }

}

public class Mathapplication {
    public static void main(String[] args) {
        float a=Mathoperation.mul(4,5);
        float b=Mathoperation.devide(a,10);
        System.out.println("a,b: "+a+", "+b);
    }    
}

