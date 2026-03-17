package 배열실습문제;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        phoneChargeEx();
        //resistanceEx();
    }
    static void phoneChargeEx(){
        // - 영식 요금제 : 30초마다 10원, 기본 통화 10
        // - 민식 요금제 : 60초마다 15원, 기본 통화 15
        // - 통화의 개수 : 20
        // 통화 시간은 10000 보다 작은 자연수

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int[] call = new int[N];
        for (int i=0; i<N; i++){
            call[i] = sc.nextInt();
        }
        int Y = 0;
        int M = 0;
        for (int i=0; i<N; i++){
            Y += ((call[i]/30) + 1) * 10;
            M += ((call[i]/60) + 1) * 15;
        }
        if (Y < M){
            System.out.printf("Y %d", Y);
        }
        else if (M == Y){
            System.out.printf("Y %d", Y);
            System.out.println();
            System.out.printf("M %d", M);
        }
        else{
            System.out.printf("M %d", M);
        }
    }


    static void resistanceEx(){
        // 3개 저항값을 색상으로 입력
        // - 첫번째 : 10의 자리 값
        // - 두번째 : 1의 자리 값
        // - 세번째 : 곱의 자리
        Scanner sc = new Scanner(System.in);
        String[] color = new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] mul = new int[] {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        int val1 = 0;
        int val2 = 0;
        int val3 = 0;
        String color1 = sc.nextLine();
        String color2 = sc.nextLine();
        String color3 = sc.nextLine();
        for (int i=0; i<10; i++){
            if (color1.equals(color[i])) val1 = i;
            if (color2.equals(color[i])) val2 = i;
            if (color3.equals(color[i])) val3 = mul[i];
        }
        System.out.printf("%d", (long) ((val1*10) + val2) * val3);
    }
}

// 예시답안 코드
//    static void callPrice(){
//        Scanner sc = new Scanner(System.in);
//        int[] call = new int[20];
//        int yPay = 0, mPay = 0;
//        System.out.print("통화 횟수 입력 : ");
//        int cnt = sc.nextInt();
//        System.out.print("통화 시간 입력 : ");
//        for (int i = 0; i < cnt; i++){
//            call[i] = sc.nextInt();
//        }
//        for (int i = 0; i < cnt; i++) {
//            yPay += (call[i] / 30) * 10 + 10;
//            mPay += (call[i] / 60) * 15 + 15;
//        }
//        if (yPay > mPay) {
//            System.out.println("M " + mPay);
//        } else if (yPay < mPay) {
//            System.out.println("Y " + yPay);
//        } else {
//            System.out.println("Y M " + yPay);
//        }
//    }