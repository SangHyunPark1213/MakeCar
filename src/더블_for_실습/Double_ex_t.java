package 더블_for_실습;

import 시스템_출력.SystemOut;

import java.util.Scanner;

public class Double_ex_t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
