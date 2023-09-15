class Adder{  
    static int add(int a,int b){return a+b;}  
    static long add(int a,int b,int c){return a*b*c;}  
    }  
    class TestOverloading3{  
    public static void main(String[] args){  
    System.out.println(Adder.add(11111,1111));//ambiguity  
    }}  
    