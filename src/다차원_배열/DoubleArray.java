package 다차원_배열;

//  5명의 학번, 국어, 영어, 수학 성적을 입력 받기
//  각 학생의 학번, 국어, 영어, 수학, 총점, 평균을 출력하기
// 2차원 배열을 사용

import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {
        int[][] students = new int[5][5]; // 5명 학생 (학번, 국어, 영어, 수학, 총점)
        double[] avg = new double[5]; // 5명 학생의 대한 평균 배열 (데이터 타입이 달라서 배열 별도 생성)

        Scanner sc = new Scanner(System.in);

        // 2차원 배열에 학번과 성적 입력 받기
        for (int i = 0; i < students.length; i++) //행의 길이까지 반복 (2차원 배열), 각 학생
        {
            System.out.printf("[%d 번째 학생] \n", i + 1);
            System.out.print("학번 입력 : ");
            students[i][0] = sc.nextInt(); // 학생의 학번
            System.out.print("국어 영어 수학 성적 : ");
            students[i][1] = sc.nextInt(); // 국어
            students[i][2] = sc.nextInt(); // 영어
            students[i][3] = sc.nextInt(); // 수학
            students[i][4] = students[i][1] + students[i][2] + students[i][3]; //총점
            avg[i] = (double) students[i][4] / 3.0; // 평균
        }

        //출력
        System.out.println("-".repeat(32));
        System.out.println("학번   국어   영어  수학  총점   평균");
        System.out.println("-".repeat(32));
        for (int i = 0; i < students.length; i++)
        {
            System.out.printf("%4d %4d %4d %5d %5d %6.2f \n",
                    students[i][0], students[i][1], students[i][2], students[i][3], students[i][4], avg[i]);
        }
        System.out.println("-".repeat(32));
    }
}
