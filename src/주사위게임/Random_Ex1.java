package 주사위게임;
// int rand = (int) (Math.random() * 6) + 1; // 1 ~ 6 사이의 임의의 정수를 생성
import java.util.concurrent.ThreadLocalRandom;


public class Random_Ex1 {
    public static void main(String[] args) {
        // 2개의 주사위를 굴려서 두 주사위의 수가 같으면 무인도 탈출하기
        // 탈출 시 두개의 주사위 값을 표시하고, 몇 번만에 탈충했는지 횟수 표시
        int num = ThreadLocalRandom.current().nextInt(1, 7);

        int cnt = 0;
        while (true)
        {
            int rand = (int)(Math.random() * 6) + 1;
            int rand2 = (int)(Math.random() * 6) + 1;
            cnt++;
            System.out.printf("첫번째 주사위 : %d 두번째 주사위 : %d \n", rand, rand2);
            if (rand == rand2)
            {
                System.out.printf("무인도 탈출 \n");
                System.out.printf("주사위 던진 횟수 : %d", cnt);
                break;
            }
        }

    }
}
