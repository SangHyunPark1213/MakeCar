package 조건문;

import java.util.Scanner;

public class Condition_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("국어 : ");
        int kor = sc.nextInt();
        System.out.print("영어 : ");
        int eng = sc.nextInt();
        System.out.print("수학 : ");
        int math = sc.nextInt();

        if(kor <0 || kor > 100 || eng < 0 || eng > 100 || math < 0 || math > 100)
        {
            System.out.println("성적 입력 오류");
        }

        int total = kor + eng + math;
        double avg = total / 3.0;
        char grade;

        if(avg >= 90) grade = 'A';
        else if(avg >= 80) grade = 'B';
        else if(avg >= 70) grade = 'C';
        else if(avg >= 60) grade = 'D';
        else grade = 'F';



        System.out.printf("%s, %d, %.2f, %c \n", name, total, avg, grade);
    }
}
