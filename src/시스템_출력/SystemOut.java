package 시스템_출력;
// 자바 표준 입출력 클래스 : 사용자와 프로그램 사이의 입출력을 담당
// 입력과 출력은 무수히 많은 장치가 있을 수 있음.
// System.in : 표준 입력 스트림, 사용자의 입력을 프로그램으로 넣는 것

// System.out : 표준 출력 스트림, 프로그램의 출력을 콘솔로 나타냄.

import java.util.Scanner;

// System.err : 표준 오류 스트림, 프로그램 내에서 발생한 오류를 콘솔에 출력 할 때 사용
// 속도는 빠르지만 리다이렉션(가공)이 안 됨
public class SystemOut {
    public static void main(String[] args) {

        // 표준 출력 : println(), print(), printf("서식", 출력값)
        //           줄바꿈 포함  줄바꿈 없음   서식 지정자 사용

        // 이름은 문자열, 주소 문자열, 성별은 문자, 국어, 영어, 수학 성적은 정수, 총점 정수, 평균은 실수형
        String name = "김현중";
        String address = "충남 천안시";
        char gender = 'M';
        int kor = 92, eng = 50, math = 70;
        int grade = kor + eng + math;
        double avg = grade / 3.0;
        // 이스케이프 시퀀스 : 화면 출력 제어 (\n \r \t \b \\)
        System.out.println("안녕하세요");
        System.out.println(name + "님");
        System.out.println("asd\tasd\tasd");
        System.out.println("asd\basd\basd");
        System.out.println("asd\\asd\\asd");

        // 서식 지정자 : printf()
        System.out.printf("이름 : %s\n", name); // 문자열 출력 서식은 %s, 변수를 서식에 대입하여 출력
        System.out.printf("주소 : %s\n", address);
        System.out.printf("성별 : %c\n", gender); // 문자는 %c
        System.out.printf("총점 : %d\n", grade); // 정수는 %d
        System.out.printf("평균 : %.2f\n", avg); // %f, %2.f, 소수점 2번째까지 표현하라 3째자리에서 반올림

        // println(), print() : 오버로딩 :  동일한 이름의 메서드를 매개변수의 개수나 타입으로 호출 할 매서드를 결정
        System.out.println("이름 : " + name); // 문자열 출력에 대한 메서드 호출
        System.out.println("주소 : " + address);
        System.out.println("성별 : " + gender); // 앞 부분이 문자열이기에 문자열 출력에 대한 메서드를 호출한다

        System.out.println(gender); // 이런 경우는 문자 char로 출력된다

        System.out.println("성별 : " + (gender == 'M' ? "남성" : "여성")); // 3항 연산자 사용

        System.out.println("aa"+ 17 + 8); // 문자열인 "aa"가 먼저 나왔기에 뒤에 있는 17 + 8 까지 문자열로 간주하여 'aa178' 이렇게 출력 됨
        System.out.println(17 + 8 + "JDK"); // 정수형인 17이 먼저 나왔기에 출력 값은 '25JDK' 가 됨





    }
}



