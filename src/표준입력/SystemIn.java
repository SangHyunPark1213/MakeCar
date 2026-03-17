package 표준입력;

import java.util.Scanner;

public class SystemIn {
    public static void main(String[] args) {
        // 키보드를 통한 입력을 받기 위해 스캐너 클래스에 대한 객체 생성
        Scanner sc = new Scanner(System.in);

//        byte a = sc.nextByte(); // 스캐너 객체를 통해서 byte 타입의 값을 입력받아 a 변수에 대입
//        short b = sc.nextShort();
//        int c = sc.nextInt();
//        long d = sc.nextLong();
//        float e = sc.nextFloat();
//        double f = sc.nextDouble();
//
//        // 문자와 문자열
//        String name = sc.next(); // 공백 기준으로 문자열을 입력받음
//        String addr = sc.nextLine(); // 줄바꿈 기준으로 문자열을 입력받음
//        char ch = sc.next().charAt(0); // 문자열에서 맨앞의 문자 추출

        // 이름은 next()
        // 주소는 nextLine()
        // 성별은 next().charAt(0) 'M' / 'F'로 입력받아 출력은 "남성" / "여성"으로 출력
        // 직업은 [1]회사원 [2]학생 [3]주부 [4]무직 : 정수로 입력받아 문자열로 출력
        // 나이는 nextInt() 입력
        // 입력 완료시 결과를 출력

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("주소를 입력하세요 : ");
        String addr = sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);
        String yourGender = "";
        if (gender == 'M'){
            yourGender = "남성";
        }
        if (gender == 'F'){
            yourGender = "여성";
        }
        System.out.print("직업을 입력하세요 : ");
        int job = sc.nextInt();
        String[] jobs = {"", "회사원", "학생", "주부", "무직"};
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.println("==== 회원 정보 출력 =====");
        System.out.println("이름: " + name);
        System.out.println("주소: " + addr);
        System.out.println("성별: " + yourGender);
        System.out.println("직업: " + jobs[job]);
        System.out.println("나이: " + age);
    }
}