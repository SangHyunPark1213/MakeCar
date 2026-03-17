package While문실습;
// 이름은 문자열로 입력
// 나이는 정수로 입력, 0 ~ 199까지는 정상입력, 나머지는 "나이 입력이 잘못되었습니다." 출력 후 재입력받기
// 성별은 문자로 입력, 'M', 'm' / 'F', 'f'만 정상 입력으로 간주하고 다른 문자이면 "성별을 잘못입력하셨습니다." 출력 후 재입력
// 직업은 정수로 입력 [1] 회사원 [2] 학생 [3] 주부 [4] 무직, 이외 숫자는 "직업을 잘못하셨습니다." 출력 후 재입력
// - 출력은 "회사원", "학생", "주부", "무직"
// 모든 입력이 정상적으로 완료되면 출력하기

import java.util.Scanner;

public class whileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        sc.nextLine();

        int age;
        while (true) {
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            if (age >= 0 && age < 200) break;
            System.out.println("나이 입력이 잘못되었습니다.");
        }

        String Gender;
        while (true) {
            System.out.print("성별을 입력하세요 : ");
            char gender = sc.next().charAt(0);
            // gender = sc.next().toLowerCase().charAt(0); // 소문자로 변경
            if (gender == 'M' || gender == 'm') {
                Gender = "남성";
                break;
            }
            else if (gender == 'F' || gender == 'f') {
                Gender = "여성";
                break;
            }
            System.out.println("성별을 잘못입력하셨습니다.");
        }

        int job;
        while (true) {
            System.out.print("직업을 입력하세요 [1] 회사원 [2] 학생 [3] 주부 [4] 무직 : ");
            char jobTmp = sc.next().charAt(0);
            if (Character.isDigit(jobTmp)) { // 숫자로 변환 가능한지 확인
                job = (int) jobTmp - '0'; // ASCII 코드값으로 계산
                if (job >= 1 && job <= 4) break;
                System.out.println("직업을 잘못입력하셨습니다.");
            }
            else{
                System.out.println("직업 코드는 숫자로 입력하세요.");
            }
        }

        final String[] jobs= {"", "회사원", "학생", "주부", "무직"};
        System.out.println("=".repeat(10) + "회원정보" + "=".repeat(10));
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + Gender);
        System.out.println("직업 : " + jobs[job]);
    }
}
