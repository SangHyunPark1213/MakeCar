package 배열실습문제;

import java.util.Scanner;

public class ArrayEx_1_g {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] time = new int[n];  // 통화 시간

        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();
        }

        int ySum = 0;
        int mSum = 0;

        for (int i = 0; i < n; i++) {
            ySum += ((time[i] / 30) + 1) * 10;
            mSum += ((time[i] / 60) + 1) * 15;
        }

        if (ySum < mSum) {
            System.out.println("Y " + ySum);
        } else if (mSum < ySum) {
            System.out.println("M " + mSum);
        } else {
            System.out.println("Y M " + ySum);
        }
    }

}
