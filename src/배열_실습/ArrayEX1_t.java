package 배열_실습;

import java.util.Scanner;

public class ArrayEX1_t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputArray = new int[8];
        int[] addArray = new int[8];
        int[] evenArray = new int[8];

        System.out.print("정수 값 입력 : ");
        for (int i = 0; i < inputArray.length; i++)
        {
            inputArray[i] = sc.nextInt();
        }

        int oodIndex = 0;
        int evenIndex = 0;

        for (int e : inputArray)
        {
            if (e % 2 == 0) evenArray[evenIndex++] = e;
        }
    }
}
