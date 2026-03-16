package 자동차만들기;

public abstract class Car {
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFuel_eco() {
        return fuel_eco;
    }

    public void setFuel_eco(double fuel_eco) {
        this.fuel_eco = fuel_eco;
    }

    public int getFuel_size() {
        return fuel_size;
    }

    public void setFuel_size(int fuel_size) {
        this.fuel_size = fuel_size;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    int  moveCount(int pass_seat){
        return (int) Math.ceil((double) pass_seat / seat);
    }
    int fuelCount(int distance, int moveCnt) {
        double totalDistance = distance * moveCnt;
        double totalFuel = totalDistance / fuel_eco; // 연료 소모량
        return (int) Math.ceil(totalFuel / fuel_size); // 주유 횟수 반환
    }

    double totalCost(double totalFuel){
        return totalFuel * 2000; // 총 비용 계산 .. 총 연료 소모량 x 2000
    }
    double totalTime(int distance, int speed, int moveCnt, double weatherCal){
        return (double) distance / speed * moveCnt * weatherCal;
    }

    public abstract boolean setMode(boolean isOn);
}
