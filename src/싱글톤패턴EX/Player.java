package 싱글톤패턴EX;

public class Player {
    private String name;

    Player(String name){
        this.name = name;
    }
    GameSettings gameSettings = GameSettings.getGameSettings();

    public void setGameSettings(int resolution, int volume, int difficulty){

        gameSettings.setResolution(resolution);
        gameSettings.setVolume(volume);
        gameSettings.setDifficulty(difficulty);
        System.out.println(name + " 게임 설정 완료");
    }

    void printSettings(){
        System.out.println("해상도 : " + gameSettings.getResolution());
        System.out.println("볼륨 : " + gameSettings.getVolume());
        System.out.println("난이도 : " + gameSettings.getVolume());
    }
}
