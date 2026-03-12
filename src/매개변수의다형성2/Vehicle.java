package 매개변수의다형성2;

public class Vehicle {
    public void move() {
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle {
    @Override
    public void move() {
        System.out.println("버스가 달립니다.");
    }
}

class Taxi extends Vehicle {
    @Override
    public void move() {
        System.out.println("택시가 달립니다.");
    }
}

class SportCar extends Vehicle {
    @Override
    public void move() {
        System.out.println("스포츠카가 달립니다.");
    }
}

class Pony extends Vehicle {
    @Override
    public void move() {
        System.out.println("포니가 달립니다.");
    }
}

class Driver {
    String name;

    public Driver(String name) {
        this.name = name;
    }

        void drive(Vehicle vehicle){
        System.out.print(name + "의 ");
        vehicle.move();
    }
//    void drive(Bus bus) {
//        System.out.print(name + "의 ");
//        System.out.println("버스가 달립니다.");
//    }
//
//    void drive(Taxi taxi) {
//        System.out.print(name + "의 ");
//        System.out.println("택시가 달립니다.");
//    }
//
//    void drive(SportCar sportCar) {
//        System.out.print(name + "의 ");
//        System.out.println("스포츠카가 달립니다.");
//    }
//
//    void drive(Pony pony) {
//        System.out.print(name + "의 ");
//        System.out.println("포니가 달립니다.");
//    }
}
