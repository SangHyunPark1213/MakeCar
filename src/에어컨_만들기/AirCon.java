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
    boolean power;
    int setTemp;
    int currentTemp;
    boolean cooler;
    boolean heater;
    int windlevel;


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
        System.out.println("전원 " + (power ? "ON" : "OFF"));
        System.out.println("현재 온도 : " + currentTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("냉방 모드 : " + (cooler ? "ON" : "OFF"));
        System.out.println("난방 모드 : " + (heater ? "ON" : "OFF"));
        System.out.println("바람 세기 : " + windlevel);
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
                    if (cooler) setCurrentTemp(-1);
                    if (heater) setCurrentTemp(1);
                    printAircon(); // 현재 에어컨 상태를 출력
                    elapsedTime = 0; // 경과 시간을 초기화
                    changeTemp = false; // 온도 변경 조건을 false로 변경
                }
                if (currentTemp == setTemp) { // 현재 온도와 설정 온도가 같은 경우
                    System.out.println("설정 온도에 도달하여 에어컨 작동을 종료합니다.");
                    power = false;
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
        setTemp = sc.nextInt();
        System.out.print("바람 세기 설정 : ");
        windlevel = sc.nextInt();

        if (currentTemp > setTemp) { // 온도를 내려야하는 경우 (cooler)
            System.out.println("쿨러가 동작합니다.");
            cooler = true;
            heater = false;
        } else if (currentTemp < setTemp) {
            System.out.println("히터가 동작합니다");
            heater = true;
            cooler = false;
        } else {
            cooler = false;
            heater = false;
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
                return 20; // 3단이면 20초
            default:
                return 60;
        }
    }


}
