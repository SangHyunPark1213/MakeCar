package 시스템출력;
// 자바 표준 입출력 클래스 : 사용자와 프로그램 사이의 입출력을 담당
// 입력과 출력은 무수히 많은 장치가 있을 수 있음
// System.in : 표준 입력 스트림, 사용자의 입력을 프로그램으로 넣는 것
// System.out : 표준 출력 스트림, 프로그램의 출력을 콘솔로 나타내는 것
// System.err : 표준 오류 스트림, 프로그램 내에서 발생한 오류를 콘솔에 출력할 때 사용, 속도는 빠르지만 리다이렉션이 없음

public class SystemOut {
    public static void main(String[] args) {
        // 표준 출력 : println(내용) 줄바꿈 포함, print(내용) 줄바꿈 없음, printf("서식", 출력값) 서식 지정자 사용
        // 이름은 문자열, 주소 문자열, 성별은 문자, 국어, 영어, 수학 성적은 정수, 총점은 정수, 평균은 실수형
        String name = "박상현";
        String addr = "천안시 서북구 백석동";
        char gender = 'M';
        int kor = 90, eng = 88, math = 78;
        int sum = kor + eng + math;
        double avg = (double)sum / 3;

        // 이스케이프 시퀀스 : 화면 출력 제어(\n \r \t \b \\))
        System.out.println("안녕하세요"); // 기본적으로 \n(줄바꿈) 포함
        System.out.println(name + "님");
        System.out.println("딸기\r바나나\r키위"); // 커서를 맨 앞으로 돌림
        System.out.println("strawberry\tbanana\tkiwi"); // tab 사이즈만큼의 간격을 띄움
        System.out.println("strawberry\bbanana\bkiwi"); // 한 글자를 지움
        System.out.println("strawberry\\banana\\kiwi"); // \ 하나를 넣음

        // 서식지정자 사용 : printf()
        System.out.printf("이름 : %s\n", name);   // 문자열 출력 서식은 %s, 변수를 서식에 대입해서 출력
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("성별 : %c\n", gender); //문자는 %c
        System.out.printf("총점 : %d\n", sum);    // 정수는 %d
        System.out.printf("평균 : %.2f\n", avg);  // %f, %.2f 소수점 3번째 자리를 반올림해서 소수점 2번째 자리까지 출력

        // println(), print() : 오버로딩 : 동일한 이름의 메서드를 매개변수의 개수나 타입으로 호출할 메서드를 결정
        System.out.println("이름 : " + name); // 문자열 출력에 대한 메서드 호출
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + ((gender == 'M' ? "남성" : "여성"))); // 3항 연산자 사용
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);

        System.out.println("JDK" + 17 + 8); // 모두 문자열로 간주
        System.out.println(17 + 8 + "JDK"); // 25JDK
    }
}
