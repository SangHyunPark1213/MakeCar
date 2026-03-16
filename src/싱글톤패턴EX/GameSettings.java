package 싱글톤패턴EX;

public class GameSettings {
    private int resolution;
    private int volume;
    private int difficulty;

    private static GameSettings gameSettings = new GameSettings();

    private GameSettings(){
        resolution = 1920;
        volume = 100;
        difficulty = 1;
    }
    static GameSettings getGameSettings(){
        return gameSettings;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
}
