package 반복문;
// 반복문 : 주어진 조건이 참인 경우 혹은 주어진 횟수만큼 반복적으로 수행
// while : 주로 반복 횟수를 특정할 수 없을 때 사용
// do while : 무조건 한번 수행 후 조건 비교 (잘 안 씀)
// 보통 while(true)를 사용하고 탈출 조건을 걸어 놓는 편을 더 많이 사용하기에
// for(초기값; 최종값; 증감값) : 주어진 횟수를 반복 수행
// Enhanced for 문 : 배열이나 컬렉션과 같은 반복 가능한(iterable) 객체를 간편하게 순회할 때 사용
// for과 Enhanced for 문 차이 : Enhanced for 문은 내부값 변경 불가, 자동 순회

import java.util.Scanner;

public class LoopMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int sum = 0; // 값을 누적하기 위한 변수, 초기화가 필요함 // 스택 영역은 초기화를 해주지 않기 때문
//        while (num > 0) // 다른 언어의 경우 0(false)이외의 모든 정수를 true로 판별하지만
//                        // 자바의 while문은 무조건 true false 조건만 사용
//        {
//            sum += num;
//            num--; // 반복문 탈출 조건
//            System.out.println(sum);
//        }
        while (true) // 무한 반복문 탈출 조건 필수
        {
            sum += num;
            num--;
            if(num == 0) break; // do while을 써야 할 경우 이런식으로 대체 가능.
        }

        System.out.println("누적 합계 " + sum);



    }
}
