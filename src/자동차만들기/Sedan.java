package 자동차만들기;

public class Sedan extends Car {
    public Sedan(String name) {
        super(200, 12, 45, 4, name);
    }

    public void setMode(boolean isOn) {
        if (isOn) seat += 1;
    }
}