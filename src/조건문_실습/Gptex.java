package 조건문_실습;

import java.util.Scanner;

public class Gptex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        int t = (h * 60 + m - 45 + 1440) % 1440;

        System.out.println(t / 60 + "시 " + t % 60 + "분");


    }


}
