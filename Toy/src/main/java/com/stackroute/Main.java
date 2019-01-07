package com.stackroute;
import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("please select which toy you want ");
        System.out.println("enter 1 for TOYTRAIN \n enter 2 for TOYCAR \n enter 3 for TOYPLANE");
        int option = sc.nextInt();
        switch(option){
            case 1:
                ToyTrain toyTrain = new ToyTrain();
                toyTrain.setPrice(new BigDecimal(100));
                System.out.println(toyTrain.getPrice());
                toyTrain.setColor("blue");
                System.out.println(toyTrain.getColor());
                System.out.println("----------------------------------------");
                System.out.println("#######################################");
                System.out.println("----------------------------------------");
                toyTrain.move();
                break;
            case 2:
                ToyCar toyCar = new ToyCar();
                toyCar.setPrice(new BigDecimal(200));
                System.out.println(toyCar.getPrice());
                toyCar.setColor("red");
                System.out.println(toyCar.getColor());
                System.out.println("           ------------       ");
                System.out.println("  --         -------      --");
                System.out.println(" |          |        |       |");
                System.out.println("  --         -------      --");
                System.out.println("           -------------       ");

                toyCar.move();
                break;
            case 3:
                ToyPlane toyPlane = new ToyPlane();
                toyPlane.setPrice(new BigDecimal(300));
                System.out.println(toyPlane.getPrice());
                toyPlane.setColor("white");
                System.out.println(toyPlane.getColor());
                System.out.println("     -----------------     ");
                System.out.println("  -----------------------    ");
                System.out.println(" --------------------------    ");
                System.out.println(" --------------------------    ");
                System.out.println("  -----------------------    ");
                System.out.println("     -----------------     ");
                toyPlane.move();
                toyPlane.fly();
                break;
            default:
                System.out.println("such toy is not available");
        }
    }
}