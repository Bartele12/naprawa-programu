import java.util.ArrayList;

abstract class Animal{
    public abstract String makeSound();
    String name;
    int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Dog extends Animal {

    public Dog(String name, int age) {

        super(name,age);
    }

    public String makeSound() {

        return "Woof";
    }
}
class Cat extends Animal {
    public Cat(String name, int age) {

        super(name,age);
    }

    public String makeSound() {
        return "cat makes sound";
    }


}
class Horse extends Animal {

    public Horse(String name,int age) {
        super(name,age);
    }

    public String makeSound() {
       return "Horse makes sound";
    }

}

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Reksio", 3));
        animals.add(new Cat("Filemon",  2));
        animals.add(new Horse("Rafal", 5));



        for (Animal animal : animals) {
            System.out.println("Imie: "+ animal.name +" Dzwiek: "+ animal.makeSound() +" Wiek: "+ "Moze byc adoptowany");
        }



    }
    
}

