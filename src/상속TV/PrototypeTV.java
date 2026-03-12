package 상속TV;

import java.util.Scanner;

// 상속을 주기 위한 TV 만들기
public class PrototypeTV {
    // 전원
    private boolean power;
    // 채널 변경
    private int cnl;
    // 볼륨
    private int vol;

    Scanner sc = new Scanner(System.in);

    // 매개 변수가 없는 생성자
    PrototypeTV(){
        this.power = false;
        this.cnl = 1;
        this.vol = 1;
    }

    // 매개 변수가 전부 있는 생성자 : PrototypeTV(boolean power, int cnl, int vol)

    PrototypeTV(boolean power, int cnl, int vol){
        this.power = power;
        this.cnl = cnl;
        this.vol = vol;
    }

    public boolean isPower() {
        return power;
    }
    // 전원을 켜고 끄는 기능 만들기
    public void setPower(boolean power) {
        this.power = power;
    }
    public int getCnl() {
        return cnl;
    }

    // 채널 설정은 1 ~ 999번까지 설정 가능 하도록 만들 것
    public void setCnl(int cnl) {
        this.cnl = cnl;
        while (cnl < 1 || cnl > 999){
            System.out.println("채널 입력이 잘못 되었습니다.");
            System.out.print("채널을 다시 입력해주세요 (1 ~ 999) : ");
            setCnl(sc.nextInt());
        }
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }
    public void printTV(){
        System.out.println("전원 : " + isPower());
        System.out.println("채널 : " + getCnl());
        System.out.println("볼륨 : " + getVol());
    }


}
