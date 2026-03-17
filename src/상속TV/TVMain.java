package 상속TV;

import java.util.Scanner;

public class TVMain {
    public static void main(String[] args) {
        ProductTV tv = new ProductTV();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("===== TV 메뉴 =====");
            System.out.println("1. 전원 켜기");
            System.out.println("2. 채널 설정");
            System.out.println("3. 볼륨 설정");
            System.out.println("4. 인터넷 모드");
            System.out.println("5. TV 정보 출력");
            System.out.println("6. TV 끄기");
            System.out.print("메뉴를 입력하세요 : ");
            int menu = sc.nextInt();
            switch(menu){
                case 1:
                    System.out.print("TV 전원을 켜시겠습니까? (yes/no) : ");
                    String power = sc.next();
                    if (power.equals("yes")) tv.setPower(true);
                    else tv.setPower(false);
                    break;
                case 2:
                    System.out.print("채널을 입력해주세요 : ");
                    int cnl = sc.nextInt();
                    tv.setCnl(cnl, tv.isSmart());
                    break;
                case 3:
                    System.out.print("볼륨을 입력해주세요 : ");
                    int vol = sc.nextInt();
                    tv.setVol(vol);
                    break;
                case 4:
                    if (tv.isSmart) tv.setSmart(false);
                    else tv.setSmart(true);
                    break;
                case 5:
                    tv.printTV();
                    break;
                case 6:
                    tv.setPower(false);
                    return;
                default:
                    System.out.println("메뉴 선택이 잘못되었습니다.");
                    break;
            }
        }
    }
}
