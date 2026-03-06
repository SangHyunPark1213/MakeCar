package 비트_연산자;
// 비트 연산자 : 정보의 최소 단위인 비트끼리 연산을 수행한다.
// 주로 하드웨어 제어, 네트워킹, 데이터 압축 등에 사용된다.
// 비트 연산을 위해서 2진법의 이해가 핋요함
public class BitOperatorMain {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;

        System.out.println(num1 & num2); // 두 비트가 모두 1일 경우에만 1을 반환합니다. 나머지 경우에는 0을 반환합니다.
        // 예시) 노이즈 제거
        System.out.println(num1 | num2); // 두 비트중 하나만 1이어도 1을 반환합니다.
        System.out.println(num1 ^ num2); // XOR : 두 값이 다른 경우만 1을 반환
        //
        System.out.println(~num1); // 비트의 반전을 수행합니다. 1은 0으로, 0은 1로 변환합니다.
        System.out.println(num1 << 1); // 비트를 왼쪽으로 이동시킵니다. 빈 자리는 0으로 채워집니다.
        // 곱하기 2와 같다
        System.out.println(num1 >> 1); // 비트를 오른쪽으로 이동시킵니다. 부호 비트로 채워집니다.
    }   // 나누기 2와 같다
}
