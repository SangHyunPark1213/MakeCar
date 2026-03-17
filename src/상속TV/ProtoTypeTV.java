package 상속TV;

// 상속을 주기 위한 TV 만들기
public class ProtoTypeTV {
    // 전원
    protected boolean power;
    // 채널
    protected int cnl;
    // 볼륨
    protected int vol;

    // 매개변수가 없는 생성자
    ProtoTypeTV(){
        power = false;
        cnl = 7;
        vol = 10;
    }
    // 매개변수가 전부 있는 생성자 : ProtoTypeTV(boolean power, int cnl, int vol)
    ProtoTypeTV(boolean power, int cnl, int vol){
        this.power = power;
        this.cnl = cnl;
        this.vol = vol;
    }

    // 채널 설정은 1 ~ 999까지 설정 가능하도록 만들기
    void setCnl(int cnl){
        this.cnl = cnl;
        if (1 <= cnl && cnl <= 999) System.out.printf("채널을 %d로 설정합니다.\n", cnl);
        else System.out.println("잘못된 채널 번호입니다.");
    }

    int getCnl(){
        return cnl;
    }

    // 전원을 켜고 끄는 기능 만들기
    void setPower(boolean power) {
        this.power = power;
        System.out.println("전원을 " + (power ? "ON" : "OFF") + "합니다");
    }
    boolean getPower(){
        return power;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
        System.out.printf("볼륨을 %d로 설정합니다.\n", vol);
    }
}