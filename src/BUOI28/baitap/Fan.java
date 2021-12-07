package BUOI28.baitap;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    int speed = 1;
    boolean on = false;
    private double radius = 5;
    private String color = "blue";

    Fan() {
    }

    public void turnOn() {
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setColor(String color){
        this.color= color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String toString(){
        if(on){
            return this.speed + this.color + "Fan is on";
        }else {
            return this.speed +this.color + " Fan is off";
        }
    }

}
class FanShow{
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setColor("yellow");
        fan.setRadius(10);
        fan.setSpeed(3);
        fan.turnOn();
        Fan fan1 = new Fan();
        fan1.setColor("blue");
        fan1.setRadius(5);
        fan1.setSpeed(2);
        fan1.turnOff();
        System.out.println(fan.toString());
        System.out.println(fan1.toString());
   }
}
