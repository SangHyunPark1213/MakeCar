package 게임싱글톤;

public class Player {
    private String name;
    public Player(String name) {
        this.name = name;
    }

    // 만들어져 있는 싱글톤 객체의 내용을 변경
    public void changeSettings(String resolution, int volume, String difficulty) {
        GameSettings gameSettings = GameSettings.getInstance();
        gameSettings.setResolution(resolution);
        gameSettings.setVolume(volume);
        gameSettings.setDifficulty(difficulty);
        System.out.println(name + " -> 게임 설정 완료!!!");
    }



    void printSettings() {
        GameSettings gameSettings = GameSettings.getInstance();
        System.out.println("해상도 : " + gameSettings.getResolution());
        System.out.println("볼륨 : " + gameSettings.getVolume());
        System.out.println("난이도 : " + gameSettings.getDifficulty());
    }
}
