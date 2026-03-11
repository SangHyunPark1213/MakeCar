package 에어컨_만들기;
// 기능 설계
// 전원 on off
// 온도 설정 기능
// 현재 온도 표시 기능
// 냉방기 on off 기능
// 난방기 on off 기능
// 바람 세기 설정 ( 1단게 / 2단계 / 3단계)

// 생성자 만들기

// 각각의 필드에 대한 게터와 세터 만들기

// 에어컨의 전체 상태 정보를 보여주는 메서드 만들기
public class AirCon {
    private boolean power;
    private  int setTemp;
    private  int currentTemp;
    private  boolean cooler;
    private  boolean heater;
    private int windlevel;

    public AirCon(){
        this.power = false;
        this.setTemp = 22;
        this.currentTemp = 10;
        this.cooler = false;
        this.heater = false;
        this.windlevel = 1;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getSetTemp() {
        return setTemp;
    }

    public void SetTemp(int setTemp) {
        this.setTemp = setTemp;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public boolean isCooler() {
        return cooler;
    }

    public void setCooler(boolean cooler) {
        this.cooler = cooler;
    }

    public boolean isHeater() {
        return heater;
    }

    public void setHeater(boolean heater) {
        this.heater = heater;
    }

    public int getWindlevel() {
        return windlevel;
    }

    public void setWindlevel(int windlevel) {
        this.windlevel = windlevel;
    }

    public void HeaterorCooler(){
        if (getCurrentTemp() > setTemp)
        {
            System.out.println("냉방기를 가동합니다.");
            this.cooler = true;
        }
        else if(getCurrentTemp() < setTemp) {
            System.out.println("난방기를 가동합니다");
            this.heater = true;
        }
        else {
            System.out.println("현재 온도와 설정 온도가 같습니다.");
            this.cooler = false;
            this.heater = false;
        }
    }
    public void printAircon(){
        System.out.println("==== 현재 에어컨 정보 ====");
        System.out.println("전원 " + (isPower() ? "ON" : "OFF"));
        System.out.println("현재 온도 : " + getCurrentTemp());
        System.out.println("설정 온도 : " + getSetTemp());
        System.out.println("냉방 모드 : " + (cooler ? "ON" : "OFF"));
        System.out.println("난방 모드 : " + (heater ? "ON" : "OFF"));
        System.out.println("바람 세기 : " + getWindlevel());
    }
}
