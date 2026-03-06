package 반복문;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        System.out.print("정수 값을 입력하세요 : ");
//        int num = sc.nextInt();
//        int cnt = 0;
//        for (int i = 5; i <= num; i += 5)
//        {
//            System.out.printf("%5d", i);
//            cnt++;
//            if(cnt == 10)
//            {
//                System.out.println();
//                cnt = 0;
//            }
//        }


        //정수 num을 입력 받아 num * num 출력하기
        // ex) 입력 : 3
        // 1 2 3
        // 4 5 6
        // 7 8 9

//        System.out.print("정수를 입력하세요 : ");
//        int num = sc.nextInt();
//        int cnt = 0;
//        for (int i = 1; i <= (num * num); i++)
//        {
//            System.out.printf("%3d ",i);
//            cnt++;
//            if (cnt == num)
//            {
//                cnt = 0;
//                System.out.println();
//            }
//
//        }

        // 문자열을 입력 받아서 역순으로 출력하기
        // "ABCDEFG" => "GFEDCBA"

        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
         int a = str.length() - 1;

        for (int i = 0; i < str.length(); i++)
        {
            System.out.print(str.charAt(a));
            a--;
        }
    }
}
