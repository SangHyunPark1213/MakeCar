package 다형성2번;

import java.util.Scanner;

public class PolyMain2 {
    public static void main(String[] args) {
        // 운전자 생성
        // 1. 버스
        // 2. 택시
        // 3. 스포츠카
        Scanner sc = new Scanner(System.in);
        System.out.print("운전자 이름을 입력해주세요 : ");
        String name = sc.next();
        Driver driver = new Driver(name);
        Vehicle vehicle = new Vehicle();
        System.out.println("=====차량 목록=====");
        System.out.println("1. 버스");
        System.out.println("2. 택시");
        System.out.println("3. 스포츠카");
        System.out.print("차량을 선택해주세요 : ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println(driver.Driver(new Bus()));
                break;
            case 2:
                System.out.println(driver.Driver(new Taxi()));
                break;
            case 3:
                System.out.println(driver.Driver(new SportCar()));
                break;
            default:
                System.out.println("잘못된 번호입니다.");
                break;
        }
    }
}
