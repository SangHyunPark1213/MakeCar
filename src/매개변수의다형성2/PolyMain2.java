package 매개변수의다형성2;

public class PolyMain2 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        SportCar sportCar = new SportCar();
        // 운전자 생성
        Driver driver = new Driver("NANA");
        // 1. 버스
        driver.drive(new Bus());
        // 2. 택시
        driver.drive(new Taxi());
        // 3. 스포츠카
        driver.drive(new SportCar());

        // 실습 예제 : 차량을 추가 해보기
        driver.drive(new Pony());


        // 오버 라이딩 -> 오버로딩으로 변경 가능한지 검토
        driver.drive(bus);
        driver.drive(taxi);
        driver.drive(sportCar);
    }
}
