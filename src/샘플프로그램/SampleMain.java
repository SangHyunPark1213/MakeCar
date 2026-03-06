package 샘플프로그램;

// 한 줄 주석을 의미 : 주석은 컴파일러가 읽지 않음, 사람에게 정보를 제공하는 목적이거나
// 코드의 실행을 막기 위해서 사용
/* 여러줄 주석
ex)
date : 2026. 03. 04
작성자 : 김현중
목적 : 샘플프로그램
 */
public class SampleMain {
    // 자바는 컴파일러 언어이기 때문에 main 메서드에서 프로그램이 시작 됨.
    // public : 접근제한자 : puclic, protected, default, private
    // static : 정적 메서드
    // void : 해당 메서드 실행 후 반환 값이 없음.
    public static void main(String[] args) {
        //화면에 내용을 출력
        System.out.println("안녕하세요. 자바프로그래밍 입니다."); // 코드 라인은 반드시 ;(세미콜론)으로 끝나야 함.
    }
}
