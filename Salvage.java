import java.util.*;
public class Salvage {
    Salvage()
    {
        Scanner sc=new Scanner(System.in);
        float purchase_price,yos, annual_depreciation;
        System.out.println("Enter purchase price: ");
        purchase_price=sc.nextFloat();
        System.out.println("Enter year of services: ");
        yos=sc.nextFloat();
        System.out.println("Enter annual depreciation: ");
        annual_depreciation=sc.nextFloat();
        System.out.println("The salvage value is: "+(purchase_price-(annual_depreciation*yos)));
    }
    public static void main(String[] args) {
        Salvage o=new Salvage();        
    }
}

