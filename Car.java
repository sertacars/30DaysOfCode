
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
    int maxNumberOfPeopleInCar = 6;

    public Car() {

    }

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    // getters and setters

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed){
        this.maxSpeed = newMaxSpeed;
    }
    
    public int getMinSpeed() {
        return this.minSpeed;
    }
    
    public double getWeight() {
        return this.weight;
    }

    public boolean getIsTheCarOn() {
        return this.isTheCarOn;
    }

    public void printVariables(){
        System.out.println("The max speed is: " + maxSpeed);
        System.out.println("The min speed is: " + minSpeed);
        System.out.println("The weight is: " + weight);
        System.out.println("Is the car on?: " + isTheCarOn);
        System.out.println("The condition is: " + condition);
        System.out.println("Car name is: " + nameOfCar);
        System.out.println("Number of people in the car: " + numberOfPeopleInCar);
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
        // numberOfPeopleInCar++;
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar){
            numberOfPeopleInCar++;
            System.out.println("Someone got in");
        }
        else {
            System.out.println("The car is full " + numberOfPeopleInCar + "=" + maxNumberOfPeopleInCar);
        }
        

    }

    public void getOut(){
        //numberOfPeopleInCar--;
        if (numberOfPeopleInCar > 0){
            numberOfPeopleInCar--;
        }
        else{
            System.out.println("No one is in the car " + numberOfPeopleInCar);
        }
    }

    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }

    public void turnTheCarOn(){
        if (isTheCarOn == false){
        isTheCarOn  = true;
        }
        else{
            System.out.println("The car is already on " + isTheCarOn);
        }
    }



    public static void main(String[] args) {

        Car tommyCar = new Car();    
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();

        //System.out.println("Christmas car");
        //Car christmasPresent = new Car(550, 2000, false);
        //christmasPresent.printVariables();

    }
    
}
