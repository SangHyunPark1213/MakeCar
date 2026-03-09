package 더블_for_실습;

import java.util.Scanner;

// 입력 : 5
// *
// * *
// * * *
// * * * *
// * * * * *
public class Double_for_EX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
