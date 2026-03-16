package 자동차만들기;

import java.util.Scanner;
import static 자동차만들기.Fuel_Price.Distance;

public class CarMain {
    public static void main(String[] args) {

        Fuel_Price fuel_price = new Fuel_Price();

        Car car = null;
        Car inputCar = new Sedan("temp");

        int loc = inputCar.getLocation();
        int cnt = inputCar.getPassengerCnt();
        int type = inputCar.getCarType();
        boolean isMode = inputCar.getOptionMode();
        int weather = inputCar.getWeather();

        switch (type) {
            case 1:
                car = new SportsCar("포르쉐 911");
                break;
            case 2:
                car = new Sedan("세단");
                break;
            case 3:
                car = new Bus("관광버스");
                break;
            default:
                car = null;
                break;
        }
        car.setMode(isMode);
        int moveCnt = car.moveCnt(cnt);
        System.out.println("=======" + car.getCarName() + "=======");
        System.out.println("총 비용 : " + car.totalCost(Distance[loc], moveCnt));
        System.out.println("총 주유 횟수 : " + car.fuelCount(Distance[loc], moveCnt));
        System.out.println("총 이동 시간 : " + car.totalTime(Distance[loc], moveCnt, weather));
    }
}