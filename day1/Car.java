package day1;

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';

    public void printVariables(){
        System.out.println("The max speed is: " + maxSpeed);
        System.out.println("The min speed is: " + minSpeed);
        System.out.println("The weight is: " + weight);
        System.out.println("Is the car on?: " + isTheCarOn);
        System.out.println("The condition is: " + condition);
    }

    public void wreckCar(){
        condition = 'C';

    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public static void main(String[] args) {
        Car familyCar = new Car();
        System.out.println("Family's Car:");
        familyCar.printVariables();
        familyCar.upgradeMinSpeed();
        familyCar.printVariables();
    }
    
}
