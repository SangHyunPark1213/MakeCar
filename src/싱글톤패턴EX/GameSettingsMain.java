package 싱글톤패턴EX;

public class GameSettingsMain {
    public static void main(String[] args) {
        Player player1 = new Player("플1");
        Player player2 = new Player("플2");

        player1.setGameSettings(1920, 95, 2);
//        player2.setGameSettings(1728, 80, 3);
        player2.printSettings();

        // 동일 인스턴스 여부 확인
        GameSettings s1 = GameSettings.getGameSettings();
        GameSettings s2 = GameSettings.getGameSettings();
        System.out.println(s1 == s2);
    }
}
