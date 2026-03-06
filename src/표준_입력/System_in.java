package 표준_입력;

import java.util.Scanner;

public class System_in {
    public static void main(String[] args) {
        // 키보드 입력을 받기 위해 Scanner 클래스의 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

//        byte a = sc.nextByte(); // 스캐너 객체를 통해 byte 타입의 값을 입력받아 a에 저장


        // 문자와 문자열 입력
//        String name = sc.next(); // 공백 기준으로 문자열을 입력 받음
//        String addr = sc.nextLine(); // 줄바꿈 기준으로 문자열을 입력 받음
//
//        char c = sc.next().charAt(0); // 문자열에서 맨 앞의 문자 추출

        // 이름은 next()
        // 주소는 nextLine()
        // 성별은 next().charAt(0) 'M' or 'F'로 입력 받아서 출력은 "남성", "여성"
        // 직업은 [1]회사원 [2]학생 [3]주부 [4]무직 : 정수로 입력 받아서 문자열로 출력
        // 나이는 nextInt()
        // 입력 완료시 결과를 출력

        String gen = "";
        String job = "";


        System.out.println("이름을 입력하세요 : ");
        String name = sc.next();
        System.out.println("주소를 입력하세요 : ");
        sc.nextLine(); // 버퍼 비우기
        String address = sc.nextLine();
        System.out.println("성별을 입력하세요 : \nex) M or F");
        char gender = sc.next().toUpperCase().charAt(0);
        if (gender == 'M')
        {
             gen = "남성";
        }
        else
        {
             gen = "여성";
        }
        System.out.println("직업을 선택하세요 [1]회사원 [2]학생 [3]주부 [4]무직 \n:");
        int jobnum = sc.nextInt();
        if (jobnum == 1)
        {
             job = "회사원";
        }
        else if (jobnum == 2)
        {
             job = "학생";
        }
        else if (jobnum == 3)
        {
             job = "주부";
        }
        else if (jobnum == 4)
        {
             job = "무직";
        }
        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();


        System.out.printf("이름은 : %s \n주소는 : %s \n성별은 : %s \n직업은 : %s \n나이는 : %d", name, address, gen, job, age );

    }
}
