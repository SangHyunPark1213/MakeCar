package While_ex;
// 이름 문자열로 입력
// 나이는 정수로 0 ~ 199 까지는 정상 입력, 나머지 수는 "나이 입력이 잘못 되었습니다", 재입력 받기
// 성별은 문자로 입력, 'M', 'm', 'F', 'f'만 정상 입력 다른 문자이면 "성별 입력이 잘못 되었습니다", 재입력 받기
// 직업은 정수값으로 입력, [1] 회사원 [2] 학생 [3] 주부 [4] 무직, 값이 정수 1~4가 아니면 "직업 입력이 잘못 되었습니다", 재입력 받기
// 출력 String으로
// 모든 입력이 정상적이면 출력


import java.util.Scanner;

public class While_Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, jobcode = 0;
        char gender;
        String name = "";
        String jobStr = "";


        while (true) {
            System.out.print("이름을 입력하세요 : ");
            name = sc.next();
            break;
        }
        while (true) {
            System.out.print("나이를 입력하세요 : ");
            if (!sc.hasNextInt()) {
                System.out.println("정수를 입력하세요.");
                sc.next();
                continue;
            }
            age = sc.nextInt();
            if (age < 0 || age >= 200) {
                System.out.println("나이 입력이 잘못되었습니다.");
                continue;
            }
            break;

        }
        while (true)
        {
            System.out.print("성별을 입력하세요 : ");
            gender = sc.next().toLowerCase().charAt(0);
            if (gender == 'm' || gender == 'f') break;
            System.out.println("성별 입력이 잘못되었습니다.");
        }
        while (true)
        {
            System.out.print("직업을 입력 하세요 [1] 회사원 [2] 학생 [3] 주부 [4] 무직 : ");
            if (!sc.hasNextInt()) {
                System.out.println("정수를 입력하세요.");
                sc.next();
                continue;
            }
            jobcode = sc.nextInt();
            if (jobcode < 0 || jobcode > 4) {
                System.out.println("1 ~ 4인 정수를 입력하세요.");
                continue;
            }
            break;
        }
        System.out.println("=".repeat(10) + "회원 정보" + "=".repeat(10));
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + ((gender == 'm') ? "남성" : "여성"));

        switch (jobcode) {
            case 1:
                jobStr = "회사원";
                break;
            case 2:
                jobStr = "학생";
                break;
            case 3:
                jobStr = "주부";
                break;
            case 4:
                jobStr = "무직";
                break;
        }
        System.out.println("직업: " + jobStr);
    }
}






