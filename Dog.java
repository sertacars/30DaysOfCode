public class Dog extends Animal{

    public Dog () {

        super(15); //referencing animal constructor in animal class
        System.out.println("A Dog has been created.");
    }
    
    public void ruff(){
        System.out.println("The dog saysruff");
    }

    public void run (){
        System.out.println("A dog is running");
    }
}
