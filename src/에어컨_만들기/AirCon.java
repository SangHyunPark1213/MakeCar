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

import 시스템_출력.SystemOut;

import java.util.Calendar;
import java.util.Scanner;

import static java.lang.Thread.sleep;

// 에어컨의 전체 상태 정보를 보여주는 메서드 만들기
public class AirCon {
    private boolean power;
    private int setTemp;
    private int currentTemp;
    private boolean cooler;
    private boolean heater;
    private int windlevel;

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getSetTemp() {
        return setTemp;
    }

    public void setSetTemp(int setTemp) {
        this.setTemp = setTemp;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public int getWindlevel() {
        return windlevel;
    }

    public void setWindlevel(int windlevel) {
        this.windlevel = windlevel;
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

    public AirCon() {
        final int[] mouthTempArr = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 4};
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH); // 현재 몇 월인지 정보를 가져옴
        currentTemp = mouthTempArr[month]; // 현재 달의 온도를 현재 온도로 대입 받음.
        this.power = false;
        this.setTemp = 20;
        this.cooler = false;
        this.heater = false;
        this.windlevel = 1;
    }


    public void printAircon() {
        System.out.println("==== 현재 에어컨 정보 ====");
        System.out.println("전원 " + (isPower() ? "ON" : "OFF"));
        System.out.println("현재 온도 : " + getCurrentTemp());
        System.out.println("설정 온도 : " + getSetTemp());
        System.out.println("냉방 모드 : " + (isCooler() ? "ON" : "OFF"));
        System.out.println("난방 모드 : " + (isHeater() ? "ON" : "OFF"));
        System.out.println("바람 세기 : " + getWindlevel());
    }

    // 에어컨 동작 메서드
    public void Operate() {
        int elapsedTime = 0; // 경과 시간 계산하기 위한 변수
        boolean changeTemp = false; // 온도를 변경해야 하는 조건

        System.out.println("===== 에어컨 작동을 시작합니다. =====");
        printAircon();

        try {
            while (true) {
                sleep(1000); // 1초 잠재움
                elapsedTime++; // 경과 시간 증가
                int getTimeThreshold = getTimeFunc(); // 바람 세기에 따른 시간 값 대입

                if (elapsedTime >= getTimeThreshold) { // 온도를 바꿔야 할 상황
                    changeTemp = true;
                }
                if (changeTemp) { // 온도를 변경해야 할 조건, 1단 60초, 2단 30초, 3단 20초
                    if (isCooler()) setCurrentTemp(-1);
                    if (isHeater()) setCurrentTemp(1);
                    printAircon(); // 현재 에어컨 상태를 출력
                    elapsedTime = 0; // 경과 시간을 초기화
                    changeTemp = false; // 온도 변경 조건을 false로 변경
                }
                if (getCurrentTemp() == getSetTemp()) { // 현재 온도와 설정 온도가 같은 경우
                    System.out.println("설정 온도에 도달하여 에어컨 작동을 종료합니다.");
                    setPower(false);
                    break;
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // sleep() 에 대한 예외 처리
        }
    }

    // 에어컨 설정
    public void setAircon(Scanner sc) { // 스캐너 객체를 전달 받음
        System.out.println("현재 온도는 : " + currentTemp + "도 입니다.");
        System.out.print("온도 설정 : ");
        setSetTemp(sc.nextInt());
        System.out.print("바람 세기 설정 : ");
        setWindlevel(sc.nextInt());

        if (currentTemp > setTemp) { // 온도를 내려야하는 경우 (cooler)
            System.out.println("쿨러가 동작합니다.");
            setCooler(true);
            setHeater(false);
        } else if (currentTemp < setTemp) {
            System.out.println("히터가 동작합니다");
            setHeater(true);
            setCooler(false);
        } else {
            setCooler(false);
            setHeater(false);
        }
    }


    // 현재 온도 변경 메서드
    private void setCurrentTemp(int tmp) {
        this.currentTemp += tmp;
    }


    private int getTimeFunc() {
        switch (windlevel) {
            case 1:
                return 60; // 1단이면 60초
            case 2:
                return 30; // 2단이면 30초
            case 3:
                return 5; // 3단이면 3초 // 20초 너무 느림.
            default:
                return 60;
        }
    }


}
