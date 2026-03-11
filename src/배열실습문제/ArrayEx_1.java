package 배열실습문제;
// 1. 핸드폰 요금
// 영식 요금제
// 30초마다 10원
// 1초부터 29초까지는 10원 30초부터는 20원 처음에 무조건 10원 부과 됨.
// 민식 요금제
// 60초마다 15원 1초 ~ 59초 15원 60초부터 30원

// 입력
// 통화 개수 n개, 통화 시간 n개가 주어짐.
// 통화 개수는 1 ~ 20, 통화 시간은 1 ~ 10,000
// ex)
//3
//40 40 40

//출력
// 더 싼 요금제의 이름을 출력 그 후 공백을 사이에 두고 요금이 몇 원 나오는지 출력
// 만약 두 요금제 요금이 같을시 영식, 민식 순서로 쓰며 영식은 Y로 민식은 M으로
// ex ) M 45

// 2. 저항

import java.util.Scanner;

public class ArrayEx_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력

        int Dongcalltimesum = 0;
        int Dongcallcnt = sc.nextInt();
        int ySum = 0;
        int mSum = 0;

        if (Dongcallcnt > 20)
        {
            System.out.println("1 ~ 20의 정수를 입력하세요");
            return;
        }
        int Dongcalltime[] = new int[Dongcallcnt];

        for (int i = 0; i < Dongcalltime.length; i++)
        {
            Dongcalltime[i] = sc.nextInt();
        }

        for (int i = 0; i < Dongcalltime.length; i++)
        {
            Dongcalltimesum += Dongcalltime[i];
        }

        if (Dongcalltimesum > 10000)
        {
            System.out.println("통화 시간의 10,000보다 큽니다.");
            return;
        }

        // 출력
        for (int i = 0; i < Dongcallcnt; i++)
        {

        }

    }

}
