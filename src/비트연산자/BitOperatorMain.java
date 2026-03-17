package 비트연산자;
// 비트연산자 : 정보의 최소 단위인 비트끼리 연산을 수행함
// 주로 하드웨어 제어, 네트워킹, 데이터 압축 등등에 사용됨
// 비트 연산을 위해서 2진법에 대한 이해가 필요

public class BitOperatorMain {
    public static void main(String[] args) {
     int x = 10, y = 12;
        System.out.println(x & y); // 비트 AND : 두개 모두 1이면 1, 8
        System.out.println(x | y); // 비트 or : 둘 중 하나가 1이면 1, 14
        System.out.println(x ^ y); // 비트 XOR : 두 값이 다를 경우 1, 6
        System.out.println(~x); // 비트 NOT : 각 비트를 반전 시킴, -11
        System.out.println(x << 1); // 비트 Shift : 20
        System.out.println(x >> 1); //5
    }
}
