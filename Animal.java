
public class Animal {
    private int age;

    public Animal (int age) {
        this.age=age;
        System.out.println("Animal has been created.");
    }

    public void eat(){
        System.out.println("An animal is eating.");
    }

    public int getAge(){
        return age;
    }


    public static void main(String[] args) {
        Animal a = new Animal(5);
        Dog d = new Dog();
        Cat c = new Cat();
        d.ruff();
        c.meow();
        a.eat();
        d.eat();
        c.eat();
        d.run();
        c.prance();
        System.out.println(d.getAge());
        System.out.println(c.getAge());
    }
}