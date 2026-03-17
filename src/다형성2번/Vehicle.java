package 다형성2번;

public class Vehicle {
    public String move() {
        return "차량이 달립니다.";
    }
}

class Bus extends Vehicle {
    @Override
    public String move() {
        return "버스가 달립니다.";
    }
}

class Taxi extends Vehicle {
    @Override
    public String move() {
        return "택시가 달립니다.";
    }
}

class SportCar extends Vehicle {
    @Override
    public String move() {
        return "스포츠카가 달립니다.";
    }
}

class Driver {
    String name;
    public Driver(String name) {
        this.name = name;
    }

    void drive(Vehicle vehicle) {
        System.out.print(name + "의 ");
        vehicle.move();
    }
    String Driver(Vehicle vehicle) {
        return name+"의 "+vehicle.move();
    }
}