package com.amulya;
import java.util.Scanner;
public class HomeComputer
{
    public static void main(String[] args) {
        double sales = 0;
        double advance = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sales persons monthly sales :");
        try{
            sales = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.print("Enter the amount of advance pay :");
        try {
            advance = Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            scanner.close();
        }
        BobsHomeComputerShop bhcs = new BobsHomeComputerShop();
        Double rate =bhcs.commissionRate(sales);
        bhcs.salesPersonsPay(advance, rate);
    }


}
