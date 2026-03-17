package 자동차만들기;

import java.util.Scanner;

public abstract class Car {
    Scanner sc = new Scanner(System.in);
    protected int speed;
    protected double fuel_eco;
    protected int fuel_size;
    protected int seat;
    protected String carName;

    public Car(int speed, double fuel_eco, int fuel_size, int seat, String carName){
        this.speed = speed;
        this.fuel_eco = fuel_eco;
        this.fuel_size = fuel_size;
        this. seat = seat;
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    int moveCnt(int pass_seat){
        return (int) Math.ceil((double) pass_seat / seat); // 총 이동횟수는 승객 수를 좌석 수로 나눈 후 올림함
    }
    int fuelCount(int distance, int moveCnt) {
        double totalDistance = distance * moveCnt; // 총 이동거리 계산 = 거리 * 이동횟수
        double totalFuel = totalDistance / fuel_eco; // 연료 소모량
        return (int) Math.ceil(totalFuel / fuel_size); // 주유 횟수 반환
    }

    double totalCost(int distance, double moveCnt){
        double totalDistance = distance * moveCnt;
        double totalFuel = totalDistance / fuel_eco;
        return totalFuel * 2000; // 총 비용 계산 = 총 연료 소모량 x 2000
    }

    String totalTime(int distance, int moveCnt, int weather){
        double getTime = (double) distance * moveCnt / speed;

        switch (weather) {
            case 2: getTime *= 1.2; break; // 날씨에 따라 소요시간 증가
            case 3: getTime *= 1.4; break;
            default:
        }
        int totalMin = (int) (getTime * 60); // 시간을 출력 예시와 같게 하기 위해 분, 초로 나눔
        int hour = totalMin / 60;
        int min = totalMin % 60;
        return String.format("%d시간 %d분", hour, min);
    }
    public abstract void setMode(boolean isOn);

    public int getLocation() { // 스캐너 객체로 지역 선택
        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int location = sc.nextInt();
        return location;
    }

    public int getPassengerCnt(){ // 스캐너 객체로 승객 수 입력
        System.out.print("이동할 승객 수 입력 : ");
        int count = sc.nextInt();
        return count;
    }
    public int getCarType(){ // 스캐너 객체로 차량 선택
        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carType = sc.nextInt();
        return carType;
    }
    public  boolean getOptionMode() { // 스캐너 객체로 부가 기능 입력
        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int option = sc.nextInt();
        boolean optionBool = true;
        if(option == 1) optionBool = true;
        else if(option == 2) optionBool = false;
        return optionBool;
    }

    public int getWeather() { // 날씨 입력
        int weather;
        while (true) {
            System.out.print("날씨 선택 [1]맑음 [2]비 [3]눈 : ");
            weather = sc.nextInt();
            if (weather >= 1 && weather <= 3) return weather;
            System.out.println("날씨 선택이 잘못 되었습니다.");
        }

    }
}

class Fuel_Price { // 연료 비용을 따로 정의하고 변수는 상수로 입력
    final static int Fuel_Price = 2000;
    final static int[] Distance = {0, 400, 150, 200, 300};
}
