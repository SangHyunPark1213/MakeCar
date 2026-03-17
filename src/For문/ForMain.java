package For문;
// for(초기값; 최종값; 증감값) { }

import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

//        for(int i = 0; i < num; i++) {
//            System.out.print("* ");
//        }
//        System.out.println();

        // 정수값을 입력받음
        // 입력받은 정수값 범위의 5의 배수를 1줄 10개씩 출력

        int count=0;
        for(int i = 1; i <= num; i++){
            if (i % 5 == 0){
                System.out.printf("%4d ", i);
                count++;
                if(count == 10){
                    System.out.println();
                    count = 0;
                }
            }
        }

        // 정수 num을 입력받아 num * num 출력하기
        // 싱글 for문 사용하기
        // 입력 : 4
        // 1 2 3 4
        // 5 6 7 8
        // 9 10 11 12
        // 13 14 15 16

        System.out.print("정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        int num2 = num1 * num1;
        for (int i=1;i<=num2;i++){
            System.out.printf("%3d", i);
            if (i % num1 == 0) System.out.println();;
        }

        // 문자열을 입력받아 역순으로 출력하기
        // "ABCDEFG" => "GFEDCBA

        sc.nextLine();
        System.out.print("문자열을 입력하세요 : ");
        String letters = sc.next();
        String rst = "";
        for (int i = letters.length() - 1; i >=0; i--){
            rst += letters.charAt(i);
        }
        System.out.println(rst);
    }
}

