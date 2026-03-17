package 게임싱글톤;

public class GameSettings {
    private String resolution;
    private int volume;
    private String difficulty;
    // static을 붙인 이유는 객체가 프로그램 종료시까지 소멸되지 않도록 함
    private static GameSettings gameSettings = new GameSettings();
    // 외부에서 생성자를 호출하지 못하도록 private
    private GameSettings() {
        resolution = "1920x1080";
        volume = 50;
        difficulty = "Normal";
    }

    // 클래스 메서드로 해당 메서드 호출시 싱글톤 주소를 반환
    static GameSettings getInstance(){
        return gameSettings;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getResolution() {
        return resolution;
    }

    public int getVolume() {
        return volume;
    }

    public String getDifficulty() {
        return difficulty;
    }
}
