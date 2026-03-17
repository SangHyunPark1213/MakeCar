package 텔레비전;

import 객체지향프로그램기본.TvRemoCon;

import java.util.Scanner;

public class TVMain {
    public static void main(String[] args) {
        // Television 클래스로 TV 객체 5개 생성
        Television tv1 = new Television();
        Television tv2 = new Television();
        Television tv3 = new Television();
        Television tv4 = new Television();
        Television tv5 = new Television();

        // 메뉴 만들기 : 생성된 객체 중 아무거나 1개 객체 선정
        // 1. 전원켜기
        // 2. 볼륨 조절
        // 3. 채널 변경
        // 4. 현재 리모콘 상태값 보기
        // 5. 종료하기
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===========메뉴===========");
            System.out.println("1. 전원켜기");
            System.out.println("2. 볼륨 조절");
            System.out.println("3. 채널 변경");
            System.out.println("4. 현재 리모콘 상태값 보기");
            System.out.println("5. 종료하기");
            System.out.print("메뉴를 선택해주세요 : ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    tv1.setPower(true);
                    break;
                case 2:
                    System.out.print("볼륨을 설정해주세요 : ");
                    int vol = sc.nextInt();
                    tv1.setVolume(vol);
                    break;
                case 3:
                    System.out.print("채널을 선택해주세요 : ");
                    int channel = sc.nextInt();
                    tv1.setChannel(channel);
                    break;
                case 4:
                    tv1.printTV();
                    break;
                case 5:
                    tv1.setPower(false);
                    System.out.println("TV를 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴 선택이 잘못되었습니다.");
            }
            System.out.println();
        }
    }
}
