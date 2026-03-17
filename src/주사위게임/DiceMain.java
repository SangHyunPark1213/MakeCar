package 주사위게임;
// int rand = (int) (Math.random() * 6) + 1; // 1 ~ 6 사이의 임의의 정수 생성

public class DiceMain {
    public static void main(String[] args) {
        // 2개의 주사위를 굴려서 같은 수가 나오면 무인도 탈출
        // 탈출시 두 개의 주사위 값을 표시하고 시도횟수 표시
        int count = 0;
        while (true) { // 반복 횟수를 알 수 없을 때 주로 사용
            count++;
            int dice1 = (int)(Math.random() * 6) + 1;
            int dice2 = (int)(Math.random() * 6) + 1;
            if (dice1 == dice2) {
                System.out.printf("두 개의 주사위 값이 같으므로 무인도 탈출 : %d %d\n", dice1, dice2);
                System.out.printf("시도 횟수 : %d", count);
                break;
            }
        }
    }
}
