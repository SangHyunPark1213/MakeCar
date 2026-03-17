package 게임싱글톤;

public class GameMain {
    public static void main(String[] args) {
        Player player1 = new Player("1번 플레이어");
        Player player2 = new Player("2번 플레이어");

        // 게임 설정
        player1.changeSettings("1920 x 1080", 23, "Hard");

        player1.printSettings();
        player2.printSettings();

        // 동일 인스턴스 여부 확인
        GameSettings s1 = GameSettings.getInstance();
        GameSettings s2 = GameSettings.getInstance();
        System.out.println(s1 == s2); // 주소가 같은지 확인
    }
}