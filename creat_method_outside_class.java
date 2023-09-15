class tsx
{
    void rt()
    {
        System.out.println("SXWW");
    }
}

public class creat_method_outside_class {
    public static void main(String[] args) {
        new tsx()
        {
            void rit()
            {
                rt();
                System.out.println("cwd");
            }
        }.rit();

    }
    
}
