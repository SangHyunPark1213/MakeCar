package 자동차만들기;

public class SportsCar extends Car {
    public SportsCar(String name) {
        super(250, 8, 30, 2, name);
    }
    public void setMode(boolean isOn){
        if(isOn) speed *= 1.2;
    }
}
