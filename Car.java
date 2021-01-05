
public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Sertac";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void printVariables(){
        System.out.println("The max speed is: " + maxSpeed);
        System.out.println("The min speed is: " + minSpeed);
        System.out.println("The weight is: " + weight);
        System.out.println("Is the car on?: " + isTheCarOn);
        System.out.println("The condition is: " + condition);
        System.out.println("Car name is: " + nameOfCar);
    }

    public void wreckCar(){
        condition = 'C';
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn(){
        // numberOfPeopleInCar = numberOfPeopleInCar + 1;
        numberOfPeopleInCar++;
    }

    public void getOut(){
        numberOfPeopleInCar--;
    }

    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }

    public static void main(String[] args) {

        System.out.println("Birthday car");

        Car birthdayPresent = new Car(500, 5000.545, true);
        birthdayPresent.printVariables();

        System.out.println("Christmas car");

        Car christmasPresent = new Car(550, 2000, false);
        christmasPresent.printVariables();

    }
    
}
