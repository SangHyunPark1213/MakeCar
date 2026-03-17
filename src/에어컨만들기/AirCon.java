package 에어컨만들기;
// 기능 설계
// - 전원 ON/OFF 기능
// - 온도 설정 기능 (1도 단위 설정)
// - 현재 온도 표시 기능
// - 냉방기 ON/OFF 기능
// - 난방기 ON/OFF 기능
// - 바람세기 설정 (1단계 / 2단계 / 3단계)

// 생성자 만들기

// 각각의 필드에 대한 게터와 세터 만들기

// 에어컨의 전체 정보 상태를 보여주는 메서드 만들기

import java.util.Calendar;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirCon {
    Scanner sc = new Scanner(System.in);
    private boolean power;
    private int tempNow;
    private int tempTarget;
    private boolean cooler;
    private boolean heater;
    private int windStep;

    public boolean isPower() {
        return power;
    }



    public AirCon() {
        final int[] monthTempArr = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 4};
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH); // 현재가 몇 월인지 정보를 가져옴
        tempNow = monthTempArr[month];
        power = false;
        tempTarget = 20;
        cooler = false;
        heater = false;
        windStep = 1;
    }

    public void setPower(boolean power) {
        this.power = power;
        System.out.println("전원을  " + (power ? "ON" : "OFF") + "합니다");

    }
    // getter 메서드 : 외부에서 접근 불가능한 필드의 값을 읽기 위해 사용되는 메서드
    public boolean getPower(){
        return power;
    }

    public int getTemp() {
        return tempNow;
    }

    public void setTemp(int tempTarget) {
        this.tempTarget = tempTarget;
        System.out.println("온도를 " + tempTarget + "으로 설정합니다.");
        if (tempNow < tempTarget) {
            System.out.println("난방을 켭니다.");
            heater = true;
            cooler = false;
        }
        else {
            System.out.println("냉방을 켭니다.");
            cooler = true;
            heater = false;
        }
    }

    public int getWindStep() {
        return windStep;
    }

    public void setWindStep(int windStep) {
        this.windStep = windStep;
        System.out.println("바람 세기를 " + windStep + "단계로 설정합니다.");
    }

    public int getTempNow() {
        return tempNow;
    }

    public int getTempTarget() {
        return tempTarget;
    }

    public void printAC(){
        final String[] step = {"", "1단계", "2단계", "3단계"};
        System.out.println("===== 에어컨 정보 출력 =====");
        System.out.println("전원 : " + (power ? "ON" : "OFF"));
        System.out.println("현재 온도 : " + getTempNow());
        System.out.println("희망 온도 : " + getTempTarget());
        System.out.println("냉방 모드 : " + (cooler ? "ON" : "OFF"));
        System.out.println("난방 모드 : " + (heater ? "ON" : "OFF"));
        System.out.println("바람 세기 : " + step[windStep]);
    }

    // 에어컨 동작 메서드
    public void operate() {
        int elapsedTime = 0; // 경과 시간을 계산하기 위한 변수
        boolean changedTemp = false; // 온도를 변경해야 하는 조건

        System.out.println("\n===== 에어컨 작동을 시작합니다. =====");
        printAC();

        try {
            while (true) {
                sleep(1000);
                elapsedTime++;
                int getTimeThreshold = getTimeFunc();

                if (elapsedTime >= getTimeThreshold) { // 온도를 바꿔야 할 상황
                    changedTemp = true;
                }

                if (changedTemp) { // 온도를 변경해야 할 조건, 1단 60, 2단 30, 3단 20초
                    if (cooler) setTempNow(-1);
                    if (heater) setTempNow(1);
                    printAC(); // 현재 에어컨 상태를 출력
                    elapsedTime = 0; // 경과 시간을 초기화
                    changedTemp = false; // 온도 변경 조건을 false로 변경
                }
                if (tempNow == tempTarget) { // 현재 온도와 설정 온도가 같은 경우
                    System.out.println("\n설정 온도에 도달하여 에어컨 작동을 종료합니다.");
                    power = false;
                    break;
                }
            }
        }catch(InterruptedException e){
                Thread.currentThread().interrupt(); // sleep()에 대한 예외 처리
        }
    }
    // 에어컨 설정
    public void setAirCon(Scanner sc) { // 스캐너 객체를 전달받음
        System.out.println("현재온도는 " + tempNow + "도 입니다.");
        System.out.print("온도 설정 : ");
        tempTarget = sc.nextInt();
        System.out.print("바람 세기 : ");
        windStep = sc.nextInt();

        if (tempNow > tempTarget) { // 온도를 내려야 하는 경우
            System.out.println("Cooler가 동작합니다.");
            cooler = true;
            heater = false;
        } else if (tempNow < tempTarget) {
            System.out.println("Heater가 동작합니다.");
            heater = true;
            cooler = false;
        } else {
            cooler = false;
            heater = false;
        }
    }
    // 현재 온도 변경 메서드
    private void setTempNow(int temp) {
        tempNow += temp;
    }

    private int getTimeFunc() {
        switch (windStep) {
            case 1: return 60;
            case 2: return 30;
            case 3: return 20;
            default: return 60;
        }
    }
}
