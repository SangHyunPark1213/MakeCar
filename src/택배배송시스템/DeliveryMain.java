package 택배배송시스템;

import java.util.Scanner;

public class DeliveryMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);


        manager.send(new ParcelDelivery());
        manager.send(new QuickDelivery());
        manager.send(new AirDelivery());
    }
}
