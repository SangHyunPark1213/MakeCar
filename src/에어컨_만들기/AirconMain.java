package 에어컨_만들기;

import java.util.Scanner;

public class AirconMain {
    public static void main(String[] args) {
        AirCon myAirCon = new AirCon();
        Scanner sc = new Scanner(System.in);

        System.out.print("에어컨을 켜시겠습니까? (yes or no) : ");
        String onOff = sc.nextLine();

        if (onOff.equals("yes")){
            myAirCon.power = true;
            myAirCon.setAircon(sc);
            myAirCon.Operate();
        }else {
            System.out.println("에어컨을 켜지 않고 종료합니다.");
        }
    }
}
