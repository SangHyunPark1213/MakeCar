package 시스템_출력_실습;

//        ================================
//                  나를 소개합니다!
//        ================================
//        이름   : 홍길동
//        나이   : 25세
//        취미   : 코딩, 독서, 운동
//        한마디 : "안녕하세요, 잘 부탁드립니다!"
//        ================================



public class System_Out_Ex {
    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("          나를 소개합니다!");
        System.out.println("================================");
        System.out.println("이름   : 홍길동");
        System.out.println("나이   : 25세");
        System.out.println("취미   : 코딩, 독서, 운동");
        System.out.println("한마디 : \"안녕하세요, 잘 부탁드립니다!\"");
        System.out.println("================================");


        int coffee = 9000, latte = 5500, cheese = 6800;
        int anum1 = 2, lnum = 1, cnum = 1;
        int total = coffee + latte + cheese;
        String totals = "합  계";
        System.out.println("==============================");
        System.out.println("     ☕ JAVA CAFE 영수증");
        System.out.println("==============================");
        System.out.printf("아메리카노  %10d잔 %,d원 \n", anum1, coffee);
        System.out.printf("카페라테  %12d잔 %,d원 \n", lnum, latte );
        System.out.printf("차즈케이크  %9d조각 %,d원 \n", cnum, cheese);
        System.out.println("------------------------------");
        System.out.printf("%s +              %,3d원 \n", totals ,total);
        System.out.println("==============================");
        System.out.println("감사합니다. 또 방문해주세요!");


        System.out.println("─────────────────────");
        System.out.println("     구구단  3단");
        System.out.println("─────────────────────");
        System.out.printf("%d x %d = %d\n", 3, 1, 3*1);
        System.out.printf("%d x %d = %d\n", 3, 2, 3*2);
        System.out.printf("%d x %d = %d\n", 3, 3, 3*3);
        System.out.printf("%d x %d = %d\n", 3, 4, 3*4);
        System.out.printf("%d x %d = %d\n", 3, 5, 3*5);
        System.out.printf("%d x %d = %d\n", 3, 6, 3*6);
        System.out.printf("%d x %d = %d\n", 3, 7, 3*7);
        System.out.printf("%d x %d = %d\n", 3, 8, 3*8);
        System.out.printf("%d x %d = %d\n", 3, 9, 3*9);

        System.out.println("=".repeat(32));
        System.out.println("\t\tJAVA CAFE 영수증");
        System.out.println("=".repeat(32));
        System.out.printf("%-16s %3s %,6d원 \n","아메리카노", "2잔", 9000);
        System.out.printf("%-16s %3s %,6d원 \n","카페라테", "2잔", 5500);
        System.out.printf("%-16s %3s %,6d원 \n","치즈케이크", "2잔", 6800);


        System.out.println("-".repeat(32));
        for (int i = 1; i <= 9; i++){
            System.out.printf("%d x %d = %d \n", 3, i, i * 3);
        }
    }
}
