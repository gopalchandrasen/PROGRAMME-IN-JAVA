import java.util.*;
public class Depreciation {
    Depreciation()
    {
        Scanner sc=new Scanner(System.in);
        float depreciation, purchase_price, salvage_value, yos;
        System.out.println("The Purchase value > Salvage value");
        System.out.println("Enter Purchase price: ");
        purchase_price=sc.nextFloat();
        System.out.println("Enter Salvage value: ");
        salvage_value=sc.nextFloat();
        System.out.println("Enter year of services: ");
        yos=sc.nextFloat();
        depreciation=(purchase_price-salvage_value)/(yos);
        System.out.println("The depreciation value is: "+depreciation);
    }

    public static void main(String[] args) {
        Depreciation o=new Depreciation();
    }
}
