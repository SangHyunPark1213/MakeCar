package 자동차만들기;

import java.util.Scanner;
import static 자동차만들기.Fuel_Price.Distance;

public class CarMain {
    public static void main(String[] args) {

        Car car;
        Car inputCar = new Sedan("임시"); // 지역변수 inputCar 생성 (switch문에서 변경됨)

        int loc = inputCar.getLocation();
        int cnt = inputCar.getPassengerCnt();
        int type = inputCar.getCarType();
        boolean isMode = inputCar.getOptionMode();
        int weather = inputCar.getWeather();


        switch (type) {
            case 1:
                car = new SportsCar("스포츠카");
                break;
            case 2:
                car = new Sedan("승용차");
                break;
            case 3:
                car = new Bus("버스");
                break;
            default:
                System.out.println("차량 선택을 잘못 하셨습니다.");
                return;
        }
        car.setMode(isMode);
        int setPower = car.setAC();
        int setAudio = car.setAD();
        int setAuto = car.setAP();
        int moveCnt = car.moveCnt(cnt);
        System.out.println("=======" + car.getCarName() + "=======");
        System.out.printf("총 비용 : %,d원\n", (int)car.totalCost(Distance[loc], moveCnt));
        System.out.println("총 주유 횟수 : " + car.fuelCount(Distance[loc], moveCnt) + "회");
        System.out.println("총 이동 시간 : " + car.totalTime(Distance[loc], moveCnt, weather));
    }
}
