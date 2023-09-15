abstract class exabs_class {
    int a=10;
    // a=11;
    abstract void func();

}
class sub extends exabs_class
{
    // exabs_class.a=11;
    public void func()
    {
        System.out.println("Hi "+a);
    }
}
class abs_class
{
    public static void main(String[] args) 
    {
        sub o=new sub();
        o.func();
    }
}
