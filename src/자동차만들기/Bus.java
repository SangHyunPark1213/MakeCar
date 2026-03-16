package 자동차만들기;

public class Bus extends Car{
    public Bus(String name){
        super(5, 150, 100, 20, name);
    }
    public void setMode(boolean isOn){
        if(isOn) fuel_size += 30;
    }

}