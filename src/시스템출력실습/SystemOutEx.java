package 시스템출력실습;



public class SystemOutEx {
    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("         나를 소개합니다!          ");
        System.out.println("이름 : 박상현");
        System.out.println("나이 : 26세");
        System.out.println("취미 : 코딩, 게임, 운동");
        System.out.println("한마디 : 안녕하세요, 잘 부탁드립니다!");
        System.out.println("================================");
        System.out.println();



        System.out.println("================================");
        System.out.println("        ☕ JAVA CAFE 영수증      ");
        System.out.println("================================");

        System.out.printf("%-10s %5d잔   %,6d원\n", "아메리카노", 2, 9000);  // -10s(좌측정렬) %5d(우측 정렬) 각각 10칸, 5칸씩 비운 후 정렬
        System.out.printf("%-11s %5d잔   %,6d원\n", "카페라떼", 1, 5500);
        System.out.printf("%-10s %4d조각   %,6d원\n","치즈케이크", 1, 6800);
        System.out.println("--------------------------------");
        System.out.printf("%-17s %,d원\n", "합 계", 21300);
        System.out.println("=".repeat(32));
        System.out.println("감사합니다. 또 방문해주세요!");

        System.out.println("─────────────────────");
        System.out.println("      구구단 3단       ");
        System.out.println("─────────────────────");
        System.out.printf("%d x %d = %d\n", 3, 1, 3 * 1);
        System.out.printf("%d x %d = %d\n", 3, 2, 3 * 2);
        System.out.printf("%d x %d = %d\n", 3, 3, 3 * 3);
        System.out.printf("%d x %d = %d\n", 3, 4, 3 * 4);
        System.out.printf("%d x %d = %d\n", 3, 5, 3 * 5);
        System.out.printf("%d x %d = %d\n", 3, 6, 3 * 6);
        System.out.printf("%d x %d = %d\n", 3, 7, 3 * 7);
        System.out.printf("%d x %d = %d\n", 3, 8, 3 * 8);
        System.out.printf("%d x %d = %d\n", 3, 9, 3 * 9);
    }
}