package 배열실습;

// 실습 문제 1번
// 햄버거 3개와 음료 2개의 가격을 입력받기 (5개 가격 연속 입력)
// 세트 메뉴 가격 = (햄버거 3개 중 가장 싼 메뉴 가격 + 음료 2개 중 싼 메뉴 가격) - 50(세트 할인)

// 실습 문제 2번
// 8개의 정수를 입력받아 배열에 저장
// 홀수는 홀수 배열에 나누어담고, 짝수는 짝수 배열에 나누어담아서 출력

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        //hamburgerEx();
        evenOddEx();
    }
    static void hamburgerEx() {
        Scanner sc = new Scanner(System.in);
        System.out.print("햄버거 3개의 가격과 음료 2개의 가격을 입력하세요 : ");
        int[] menu = new int[5];
        menu[0] = sc.nextInt();
        menu[1] = sc.nextInt();
        menu[2] = sc.nextInt();
        menu[3] = sc.nextInt();
        menu[4] = sc.nextInt();
        int cheapBurger = menu[0];
        int cheapDrink = menu[3];
        for (int i = 0; i < 5; i++) {
            if (i < 3 && menu[0] > menu[i]) cheapBurger = menu[i];
            if (i > 2 && menu[3] > menu[i]) cheapDrink = menu[i];

            int setMenu = (cheapBurger + cheapDrink) - 50;
            System.out.printf("가장 싼 햄버거: %d, 가장 싼 음료수: %d, 세트 메뉴 가격 : %d", cheapBurger, cheapDrink, setMenu);
        }
    }

    static void evenOddEx () {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int[] array8 = new int[8];
        System.out.print("정수 8개를 입력하세요 : ");
        for (int i = 0; i < array8.length; i++) {
            array8[i] = sc.nextInt();
        }

        int[] oddArray = new int[8];
        // heap 영역에 생성된 배열은 쓰레기값이 아닌 0으로 초기화가 되어있음
        int[] evenArray = new int[8];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int e : array8) {
            if (e % 2 != 0) oddArray[oddIndex++] = e; // 값을 대입 후 인덱스를 증가
            else evenArray[evenIndex++] = e;
        }
        System.out.print("홀수 : ");
        for (int i = 0; i < oddIndex; i++) System.out.print(oddArray[i] + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for (int i = 0; i < evenIndex; i++) System.out.print(evenArray[i] + " ");
    }
}
