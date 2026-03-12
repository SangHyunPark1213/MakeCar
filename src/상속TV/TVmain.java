package 상속TV;

import java.util.Scanner;

public class TVmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductTV productTV1 = new ProductTV(false, 11, 10, "my TV");

        // TV 메뉴 만들기
        // 1. TV 켜기
        System.out.println("=".repeat(15));
        System.out.println("티비의 전원을 켜시겠습니까? Yes / No : ");
        System.out.println("=".repeat(15));
        String onoff = sc.next();
        if (onoff.equals("Yes")){
            productTV1.setPower(true);
        }
        System.out.println("스마트 티비로 전환 하시겠습니까? Yes / No : ");
        String smartonoff = sc.next();
        if (smartonoff.equals("Yes"))
        {
            productTV1.setSmart(true);
        }
        else {
            if (onoff.equals("Yes") && smartonoff.equals("No")) {
                while (true) {
                    System.out.println("[1] 볼륨 설정하기");
                    System.out.println("[2] 채널 변경하기");
                    System.out.println("[3] TV 상태보기");
                    System.out.println("[4] 종료하기");
                    int user = sc.nextInt();
                    switch (user) {
                        case 1:
                            // 2. 볼륨 설정하기
                            System.out.println("볼륨을 설정해주세요 : ");
                            productTV1.setVol(sc.nextInt());
                            break;
                        case 2:
                            // 2. 채널 변경 시 smart 기능을 켜면 채널 설정은 없음.
                            System.out.println("현재 채널 : " + productTV1.getCnl());
                            System.out.println("채널을 변경해주세요 : ");
                            productTV1.setCnl(sc.nextInt());
                            System.out.println("채널이 " + productTV1.getCnl() + "로 변경되었습니다");
                            break;
                        case 3:
                            // tv 상태 보기
                            productTV1.printTV();
                            break;
                        case 4:
                            // tv 종료
                            System.out.println("TV를 종료합니다.");
                            productTV1.setPower(false);
                            System.exit(0);
                        default:
                            System.out.println("메뉴 선택이 옳바르지 않습니다");
                            break;
                    }
                }
            }
            else System.out.println("스마트 티비 전환 입력이 옳바르지 않습니다");
        }
//        if (onoff.equals("Yes") && smartonoff.equals("NO")) {
//            while (true) {
//                System.out.println("[1] 볼륨 설정하기");
//                System.out.println("[2] 채널 변경하기");
//                System.out.println("[3] TV 상태보기");
//                System.out.println("[4] 종료하기");
//                int user = sc.nextInt();
//                sc.nextInt();
//                switch (user) {
//                    case 1:
//                        // 2. 볼륨 설정하기
//                        System.out.println("볼륨을 설정해주세요 : ");
//                        productTV1.setVol(sc.nextInt());
//                        break;
//                    case 2:
//                        // 2. 채널 변경 시 smart 기능을 켜면 채널 설정은 없음.
//
//                    case 3:
//                        // tv 상태 보기
//
//                    case 4:
//                        // tv 종료
//                }
//            }
//        }


        //    - 스마트 기능을 끄면 채널 설정 기능 활성화
        // 4. TV 상태 보기
        // 5. 종료하기
    }
}

