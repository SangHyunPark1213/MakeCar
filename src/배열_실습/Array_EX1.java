package 배열_실습;

// 실습 문제 1번
// 햄버거 3개와 음료 2개의 가격을 입력 받아
// 세트메뉴 가격 = (햄버거 3개 중 가장 싼 메뉴 가격 + 음료 2개 중 싼 메뉴 기격) - 50원(세트 할인)

// 실습 문제 2번
// 8개의 정수를 입력 받아 배열에 저장
// 홀수는 홀수 배열에 나누어 담고, 짝수는 짝수 배열에 나누어 담아서 출력하기

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int lowham, lowdrk, total = 0;
//
//        int ham[] = new int[3];
//        int drk[] = new int[2];
//        System.out.print("햄버거 3개의 가격 : ");
//        for (int i = 0; i < ham.length; i++)
//        {
//            ham[i] = sc.nextInt();
//
//        }
//        System.out.print("음료 2개의 가격 : ");
//        for (int i = 0; i < drk.length; i++)
//        {
//            drk[i] = sc.nextInt();
//
//        }
//        if (ham[0] > ham[1] && ham[1] < ham[2])  lowham = ham[1];
//        else if (ham[0] < ham[1] && ham[0] < ham[2]) lowham = ham[0];
//        else lowham = ham[2];
//
//        if (drk[0] < drk[1] && ham[0] < ham[2])  lowdrk = drk[0];
//        else lowdrk = drk[1];
//
//        System.out.printf("세트 메뉴의 가격은 : %,d원 입니다", (lowham + lowdrk) - 50);
//


        int evnum[] = new int[8];
        int oddnum[] = new int[8];

        int num[] = new int[8];
        System.out.print("정수 8개를 입력하세요 : ");
        for (int i = 0; i < num.length; i++)
        {
//            int j = 0;
            num[i] = sc.nextInt();
            if ((num[i] % 2) == 0)
            {
                evnum[i] = num[i];
//                System.out.print("짝수 " + evnum[i] + " ");
//                j++;
            }
            else
            {
                oddnum[i] = num[i];
//                System.out.print("홀수 " + oddnum[i] + " ");
            }
        }
        System.out.println("짝수 " + Arrays.toString(evnum));
        System.out.println("홀수 " + Arrays.toString(oddnum));
    }


}
