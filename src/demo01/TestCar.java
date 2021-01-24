package demo01;

public class TestCar {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.setYearModel(2006);
        myCar.setMake("Ford Taurus");
        System.out.println(myCar);

        myCar.accelerate();
        System.out.println("Current speed is: " +myCar.getSpeed()+ " miles/per hour");
        myCar.brake();
        System.out.println("Current speed is: " +myCar.getSpeed()+ " miles/per hour");
    }
}
