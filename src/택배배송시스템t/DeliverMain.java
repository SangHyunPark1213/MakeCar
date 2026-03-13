package 택배배송시스템t;

import java.util.Scanner;

public class DeliverMain {
    public static void main(String[] args) {
        Manager manager = new Manager("nana");
        Scanner sc = new Scanner(System.in);
        System.out.print("[1] 택배 배송 [2] 퀵 배송 [3] 항공 배송 : ");
        int menu = sc.nextInt();

        switch (menu){
            case 1:
                manager.send(new ParcelDelivery("대한"));
                break;
            case 2:
                manager.send(new QuickDelivery("민국"));
                break;
            case 3:
                manager.send(new AirDelivery("만세"));
                break;
        }
    }

}
