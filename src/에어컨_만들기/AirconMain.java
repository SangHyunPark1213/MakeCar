package 에어컨_만들기;

import java.util.Scanner;

public class AirconMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AirCon airCon = new AirCon();

        System.out.println("에어컨의 전원을 켜시겠습니까? Yes or No");
        String ispower = sc.next();
        if (ispower.equals("Yes")) {
            airCon.setPower(true);
            System.out.println("=== 에어컨 작동 시작 ===");
            System.out.println("온도를 설정해주세요 18 ~ 30 : ");
            airCon.SetTemp(sc.nextInt());
            System.out.println("바람 세기를 설정해주세요 : 1 ~ 5 : ");
            airCon.setWindlevel(sc.nextInt());
            System.out.println("설정하신 온도는 " + airCon.getSetTemp() + "도 입니다");
            while (airCon.getSetTemp() < 18 || airCon.getSetTemp() > 30) {
                System.out.println("온도 범위를 벗어났습니다. 다시 입력해주세요 (18 ~ 30)");
                airCon.SetTemp(sc.nextInt());
                System.out.println("설정하신 온도는 " + airCon.getSetTemp() + "도 입니다");
            }
            System.out.println("현재 온도는 " + airCon.getCurrentTemp() + "도 입니다");
            airCon.HeaterorCooler();
            airCon.printAircon();
        }
        else System.out.println("에이컨을 켜지 않고 종료합니다.");



    }
}
